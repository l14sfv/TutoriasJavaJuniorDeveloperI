// Datos
// int = entero
// double = decimal
// String = cadena de texto
// Boolean = verdadero o falso

//algo que podemos hacer y reutilizar a futuro es crear una función, que es un bloque de código que realiza una tarea específica y puede ser reutilizado en diferentes partes del programa.

package Modulo1;

import Modulo1.Tutoria4

public class Tutorira6 {
    public static void main(String[] args) {
         // Llamamos a la función para sumar dos números
        resultado = Calculadora.sumar(5,3);
        System.out.println("La suma de 5 y 3 es: " + resultado);
    }
    // public static int sumar(int a, int b) {
    //     int resultado = a + b;
    //     return resultado;}

    // public static int restar(int a, int b) {
    //     int resultado = a - b;
    //     return resultado;}
    
    // public static int multiplicar(int a, int b) {
    //     int resultado = a * b;
    //     return resultado;}
    
    // public static double dividir(int a, int b) {
    //     if (b == 0) {
    //         System.out.println("Error: No se puede dividir por cero.");
    //         return 0;
    //     }
    //     double resultado = (double) a / b;
    //     return resultado;}

    // public static void main(String[] args) {
    //     int num1 = 5;
    //     int num2 = 9;

    //     java.util.Scanner sc = new java.util.Scanner(System.in);
    //     System.out.print("Ingrese el primer número: ");
    //     num1 = sc.nextInt();
    //     System.out.print("Ingrese el segundo número: ");
    //     num2 = sc.nextInt();
    //     sc.close();

    //     // llamar el metodo 
    //     double suma = sumar(num1, num2);
    //     double resta = restar(num1, num2);
    //     double multiplicacion = multiplicar(num1, num2);
    //     double division = dividir(num1, num2);

    //     System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    //     System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
    //     System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
    //     System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);
    // }
}

class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return (double) a / b;
    }
}