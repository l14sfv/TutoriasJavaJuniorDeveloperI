// public class Persona {
//     private int edad;
//     private String nombre;

//     //constructor vacio
//     public Persona() {
//     }

//     //constructor con parametros
//     public Persona(int edad, String nombre) {
//         this.edad = edad;
//         this.nombre = nombre;
//     }

// Persona p1 = new Persona();
// p1.edad = 25;
// p1.nombre = "Juan";

public interface Figura {
    double area();
    double perimetro();
    default void mostrarInformacion() {
        System.out.println("Esta es una figura geométrica.");
    }
    static void mostrarMensaje() {
        System.out.println("¡Bienvenido al mundo de las figuras geométricas!");
    }
}

public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    //default
    @Override
    public void mostrarInformacion() {
        System.out.println("Esta es un círculo con radio: " + radio);
    }
}

// static
Figura.mostrarMensaje();

// default
Figura figura = new Circulo(5);
figura.mostrarInformacion();

