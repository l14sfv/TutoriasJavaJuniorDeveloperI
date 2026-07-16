package Modulo3;

import java.util.Scanner;

public class Tutoria4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de datos a ordenar:");
        int cantidad = scanner.nextInt();
        // Double[] datos = {5.0, 2.0, 9.0, 1.0, 5.0, 6.0};
        Double[] datos = new Double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el dato " + (i + 1) + ":");
            datos[i] = scanner.nextDouble();
        }

        OrdenarBurbuja ordenar = new OrdenarBurbuja(datos);

        System.out.println("Datos originales:");
        ordenar.MostrarDatos();

        ordenar.OrdenarAscendente();
        System.out.println("Datos ordenados ascendentemente:");
        ordenar.MostrarDatos();

        ordenar.OrdenarDescendente();
        System.out.println("Datos ordenados descendentemente:");
        ordenar.MostrarDatos();

        System.out.println("El mayor dato es: " + ordenar.obtenerMayor());
        System.out.println("El menor dato es: " + ordenar.obtenerMenor());

        // Double menor = datos[0];
        // Double mayor = datos[datos.length - 1];

        // System.out.println("El menor dato es: " + menor);
        // System.out.println("El mayor dato es: " + mayor);

        scanner.close();
    }
}

class OrdenarBurbuja {
    private Double[] datos;

    public OrdenarBurbuja(Double[] datos) {
        this.datos = datos;
    }

    public void OrdenarAscendente() {
        int n = datos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    // Intercambiar datos[j] y datos[j+1]
                    Double temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
    }

    public void OrdenarDescendente() {
        int n = datos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] < datos[j + 1]) {
                    // Intercambiar datos[j] y datos[j+1]
                    Double temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
    }

    public Double obtenerMayor () {
        Double mayor = datos[0];
        for (Double dato : datos) {
            if (dato > mayor) {
                mayor = dato;
            }
        }
        return mayor;

        // Double mayor = datos[0];
        // for (int i = 1; i < datos.length; i++) {
        //     if (datos[i] > mayor) {
        //         mayor = datos[i];
        //     }
        // }
    }

    public Double obtenerMenor () {
        Double menor = datos[0];
        for (Double dato : datos) {
            if (dato < menor) {
                menor = dato;
            }
        }
        return menor;

        // Double menor = datos[0];
        // for (int i = 1; i < datos.length; i++) {
        //     if (datos[i] < menor) {
        //         menor = datos[i];
        //     }
        // }
    }

    public void MostrarDatos() {
        for (Double dato : datos) {
            System.out.print(dato + " ");
        }
        System.out.println();
    }
}