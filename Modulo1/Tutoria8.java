/*
 * TUTORÍA 8 — Sistema simple de registro de estudiantes
 */

import java.util.Locale;
import java.util.Scanner;

public class Tutoria8 {

    // Tres listas del mismo tamaño: en la posición 0 va el primer alumno
    // (nombre en nombres[0], edad en edades[0], nota en notas[0]), y así sucesivamente.
    static String[] nombres = new String[100];
    static int[] edades = new int[100];
    static double[] notas = new double[100];

    // Cuántos estudiantes se han registrado hasta ahora (también indica
    // la siguiente posición libre al agregar uno nuevo).
    static int contador = 0;

    // Objeto para leer lo que el usuario escribe. Locale.US hace que el punto
    // sea el separador decimal al ingresar notas (por ejemplo 8.5), útil en Windows.
    static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

    /**
     * Muestra el menú principal en pantalla.
     * No modifica datos; solo imprime las opciones disponibles.
     */
    public static void MostraMmenu() {
        System.out.println("\n *** Menu Principal ***");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Mostrar estudiantes registrados");
        System.out.println("3. Buscar estudiante por nombre");
        System.out.println("4. Promedio de notas");
        System.out.println("5. Salir del sistema");
    }

    /**
     * Pide nombre, edad y nota y los guarda en la siguiente posición libre.
     * Si ya hay 100 registros, avisa que no caben más.
     * Después de nextInt o nextDouble queda un salto de línea en el buffer;
     * nextLine() al final evita que el siguiente nombre se lea vacío por error.
     */
    public static void RegistrarEstudiante() {
        if (contador < nombres.length) {
            System.out.println("Ingresar nombre del estudiante");
            nombres[contador] = entrada.nextLine();
            System.out.println("Ingresar edad");
            edades[contador] = entrada.nextInt();
            System.out.println("Ingrese la nota");
            notas[contador] = entrada.nextDouble();
            contador++;
            entrada.nextLine();
            System.out.println(" Estudiante registrado correctamente.");
        } else {
            System.out.println(" Límite máximo de estudiantes alcanzado.");
        }
    }

    /**
     * Lista todos los estudiantes registrados (desde la posición 0 hasta contador - 1).
     * Si no hay ninguno, lo indica y no imprime filas de datos.
     */
    public static void MostrarEstudiante() {

        if (contador == 0) {
            System.out.println(" No hay estudiantes registrados.");
        }
        for (int i = 0; i < contador; i++) {
            System.out.printf("  %d. %s | Edad: %d | Nota: %.2f%n",
                    i + 1, nombres[i], edades[i], notas[i]);
        }
    }

    /**
     * Pide un nombre y lo compara con cada registro sin distinguir mayúsculas/minúsculas.
     * Puede mostrar más de un resultado si hay nombres repetidos.
     * Si no coincide ninguno, avisa que no se encontró.
     */
    public static void BuscarEstudiante() {
        if (contador == 0) {
            System.out.println(" No hay estudiantes registrados.");
        }
        if (contador != 0) {
            System.out.println("\n Ingrese el nombre a buscar: ");
            String EstudianteBuscar = entrada.nextLine();
            boolean encontrado = false;
            for (int i = 0; i < contador; i++) {
                if (nombres[i].equalsIgnoreCase(EstudianteBuscar)) {
                    System.out.println("\n Registro encontrado:");
                    System.out.printf("  Nombre: %s | Edad: %d | Nota: %.2f%n",
                            nombres[i], edades[i], notas[i]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println(" No se encontró ningún estudiante con ese nombre.");
            }
        }

    }

    /**
     * Suma todas las notas de los estudiantes registrados y divide entre su cantidad.
     * Si no hay estudiantes, solo muestra el mensaje de aviso (el cálculo no tiene sentido).
     */
    public static void CalcularPromedio() {
        if (contador == 0) {
            System.out.println(" No hay estudiantes registrados para calcular el promedio.");
        }

        double suma = 0;

        for (int i = 0; i < contador; i++) {
            suma += notas[i];
        }
        double promedio = suma / contador;
        System.out.println("\n  Promedio : " + promedio);
    }

    /*
     * Versión anterior de limpiar pantalla: enviaba códigos especiales a la consola
     * o imprimía muchas líneas en blanco. En Windows no siempre funcionaba bien.
     * Por eso se reemplazó por el método de abajo, que usa el comando del sistema.
     */
    // public static void limpiarConsola() {
    //     try {
    //         System.out.print("\033[H\033[2J");
    //         System.out.flush();
    //     } catch (Exception e) {
    //         for (int i = 0; i < 100; i++)
    //             System.out.println();
    //     }
    // }

    /**
     * Borra el contenido visible de la consola para que el menú se vea más ordenado.
     * En Windows ejecuta "cls"; en Linux o Mac ejecuta "clear".
     * Si falla, solo muestra un mensaje y el programa sigue.
     */
    public static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println(" No se pudo limpiar la consola.");
        }
    }

    /**
     * Limpia la consola, despide al usuario y termina la interacción de salida.
     * El Scanner no se cierra a propósito para evitar problemas si se reutiliza System.in.
     */
    public static void salir() {
        limpiarConsola();
        System.out.println("\n Saliendo del sistema... Gracias por usar el sistema.");
        // entrada.close();
    }

    /**
     * Punto de entrada del programa: repite menú y opciones hasta que el usuario elige 5.
     * Tras leer un número de opción, nextLine() consume el Enter sobrante antes del switch.
     * Si la opción no es del 1 al 5, limpia pantalla y pide intentar de nuevo.
     */
    public static void main(String[] args) {
        int opcion;
        do {
            MostraMmenu();
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> RegistrarEstudiante();
                case 2 -> MostrarEstudiante();
                case 3 -> BuscarEstudiante();
                case 4 -> CalcularPromedio();
                case 5 -> salir();
                default -> { limpiarConsola();  
                            System.out.println(" Opción inválida. Intente nuevamente.");
                        }
            }
            // if (opcion != 5) {
            //     System.out.println("\nPresione ENTER para volver al menú principal...");
            //     entrada.nextLine();
            //     limpiarConsola();
            // }
        } while (opcion != 5);
    }
}
