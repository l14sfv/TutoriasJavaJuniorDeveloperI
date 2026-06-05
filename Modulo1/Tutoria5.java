//SOUT
System.out.print("Hola Mundo"); // impresion solita sin cambiar nada de nada
System.out.println("Hola Mundo"); // impresion con salto de linea
System.out.printf("Hola Mundo: %d", 20); // impresion con formato, se puede usar para imprimir variables, por ejemplo:
// %d para enteros, %f para flotantes, %s para cadenas, %.2f para flotantes con 2 decimales
// %c para caracteres, %b para booleanos, %n para salto de linea
String nombre = "Juan";
int edad = 30;
double salario = 2500.50;
System.out.printf("Nombre: %s\n, Edad: %d, Salario: %.2f", nombre, edad, salario); 

//SOET
System.err.println("Error"); // impresion de error en consola, se muestra en rojo en la consola, se puede usar para imprimir mensajes de error, por ejemplo:


//datos decimales
double = mas puntual
float = menos puntual
BigDecimal = mas puntual que double, se usa para operaciones matematicas con mucha precision, por ejemplo en finanzas, se puede usar para evitar errores de redondeo, se puede usar para representar numeros muy grandes o muy pequeños, se puede usar para representar numeros con muchos decimales, se puede usar para representar numeros con muchos digitos, se puede usar para representar numeros con muchos ceros, se puede usar para representar numeros con muchos decimales y ceros, se puede usar para representar numeros con muchos digitos y ceros, se puede usar para representar numeros con muchos digitos y decimales, se puede


//wiper
double = guardad dato numerico ( primitivo)
int =  guardad dato numerico ( primitivo)
Double = version Objeto de double, se puede usar para guardar datos numericos con decimales, se puede
Integer = version Objeto de int, se puede usar para guardar datos numericos enteros, se puede usar para guardar datos numericos con decimales, se puede usar para guardar datos numericos con decimales y enteros, se puede usar para guardar datos numericos con decimales y enteros y ceros, se puede usar para guardar datos numericos con decimales y enteros


//
class Persona {
    String nombre;
}

Persona p = new Persona(); // creacion de un objeto de la clase Persona, se puede usar para crear objetos de cualquier clase, se puede usar para crear objetos de clases que no tienen constructor, se puede usar para crear objetos de clases que tienen constructor, se puede usar para crear objetos de clases que tienen constructor con parametros, se puede usar para crear objetos de clases que tienen constructor sin parametros, se puede usar para crear objetos de clases que tienen constructor con parametros y sin parametros, se puede usar para crear objetos de clases que tienen constructor con parametros y sin parametros y ceros, se puede usar para crear objetos de clases que tienen constructor con parametros y sin parametros y ceros y decimales, se puede


// constructor
class Persona {
    String nombre;
    int edad;

    // constructor sin parametros
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }
    // constructor con parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
Persona p1 = new Persona(); // creacion de un objeto de la clase Persona usando el constructor sin parametros
Persona p2 = new Persona("Juan"); // creacion de un objeto de la clase Persona
Persona p3 = new Persona("Juan", 30); // creacion de un objeto de la clase Persona usando el constructor con parametros


//
class Carro {
    String marca;
    String modelo;
    String color;
    int ano;

    public Carro(String marca, String modelo, String color, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        encender();
    }
    void encender() {
        System.out.println("El carro se ha encendido");
    }
}

Carro carro1 = new Carro("Toyota", "Corolla", "Rojo", 2020); // creacion de un objeto de la clase Carro usando el constructor con parametros
Carro carro2 = new Carro("Toyora", "Corolla", "Rojo", 2020); // creacion de un objeto de la clase Carro usando el constructor con parametros

carro1.mostrar();

Carro[] carros = {carro1, carro2}; // creacion de un arreglo de objetos de la clase Carro