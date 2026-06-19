Tutoria2ria2 {
    private  String marca;
    private String nombre;
    private  int modelo;
    private String color;
    private String motor;
    private String placa;

    public RegistroVehiculos(String marca, String nombre, int modelo, String color, String motor, String placa) {
        this.marca = marca;
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.placa = placa;


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarInformacion() {
        System.out.println("===== INFORMACIÓN DEL VEHÍCULO =====");
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + nombre);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Motor: " + motor);
        System.out.println("Placa: " + placa);
    }

    public void encender() {
        System.out.println(nombre + " ha sido encendido.");
    }

    public void apagar() {
        System.out.println(nombre + " ha sido apagado.");
    }

    public void acelerar() {
        System.out.println(nombre + " está acelerando.");
    }

    public void frenar() {
        System.out.println(nombre + " está frenando.");
    }

    static void main(String[] args) {
        Tutoria2 vehiculo1 = new Tutoria2(
                "Toyota",
                "Corolla",
                2024,
                "Blanco",
                "1.8L",
                "ABC-123"
        );


        vehiculo1.mostrarInformacion();

        System.out.println();


        vehiculo1.encender();
        vehiculo1.acelerar();
        vehiculo1.frenar();
        vehiculo1.apagar();
    }
    }

// setter y getter

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private void mostrarInfo () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void imprimirInfo() {
        mostrarInfo();
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Luis", 20);
        Persona p2 = new Persona("Ana", 25);

        var p3 = new Persona();
        p3.setNombre("andres");
        p3.setEdad(30);

        var p4 = new Persona("carlos", 40);



        p1.imprimirInfo();
        System.out.println();
        p2.imprimirInfo();
        System.out.println();
        p3.imprimirInfo();
        System.out.println();
        p4.imprimirInfo();
    }

    
}

// Ejercicio 1: Clase Persona (Encapsulamiento + Métodos)
// Objetivo: Entender cómo crear clases, atributos privados, constructores y métodos públicos.

// Enunciado:
// Crea una clase Persona que tenga:

// Atributos privados: nombre (String) y edad (int)

// Un constructor para inicializar ambos atributos

// Métodos getters y setters

// Un método mostrarInfo() que imprima los datos de la persona

// Luego, en una clase Main, crea al menos 2 objetos Persona y muestra su información.

// Conceptos clave:

// Encapsulamiento: usar private y acceder mediante métodos

// Constructores: inicializar objetos correctamente

// Métodos: comportamiento del objeto

// Ejemplo de lo que deberías practicar:

// Crear objetos: Persona p1 = new Persona("Luis", 20);

// Llamar métodos: p1.mostrarInfo();

// Extra (reto opcional):
// Valida en el setter de edad que no sea negativa.




var nombre = "Andres"; // string
var edad = 30; // int
var altura = 1.75; // double
var persona = new Persona(); // objeto de la clase Persona