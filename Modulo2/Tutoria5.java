import java.util.ArrayList;
import java.util.List;

//AGREGACION: Es una relación entre clases donde una clase contiene a otra clase como parte de su estructura, pero la clase contenida puede existir independientemente de la clase contenedora. En este caso, un curso puede tener estudiantes, pero los estudiantes pueden existir sin el curso.

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;
    private Estudiante[] estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }
}

//add = agregar
//remove = eliminar
//get = obtener
//size = tamaño
//clear = limpiar
//set = establecer
//contains = contiene
//indexOf = índice de
//isEmpty = está vacío
//toArray = convertir a arreglo
//sort = ordenar

public class Tutoria5 {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("María");

        Curso java = new Curso("java senior");

        java.agregarEstudiante(estudiante2);
        java.agregarEstudiante(estudiante2);
}
}

//COMPOSICION: Es una relación más fuerte que la agregación, donde una clase contiene a otra clase como parte de su estructura, y la clase contenida no puede existir independientemente de la clase contenedora. En este caso, un departamento puede tener empleados, pero los empleados no pueden existir sin el departamento.

class LineaPedido {
    private String producto;
    private int cantidad;

    public LineaPedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
}

class Pedido {
    private String numero;
    private List<LineaPedido> lineas;

    public Pedido(String numero) {
        this.numero = numero;
        this.lineas = new ArrayList<>();
    }

    public void agregarLinea(String producto, int cantidad) {
        LineaPedido linea = new LineaPedido(producto, cantidad);
        lineas.add(linea);
    }
}

public class MainComposicion {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("12345");
        pedido.agregarLinea("Laptop", 1);
        pedido.agregarLinea("Mouse", 2);
    }
}

// PILARES DEL POO
// ENCAPSULAMIENTO: Es el principio de ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos públicos. Esto ayuda a proteger los datos y a mantener la integridad de la clase.

public class CuentaBancaria {
    // datos encapsulados
    private String numeroCuenta;
    private double saldo;

    // datos no encapsulados
    public String titular;

    // datos protegidos
    protected String banco;

    public CuentaBancaria(String numeroCuenta, double saldoInicial, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    } // solo haremos lectura, no haces modificaciones al saldo

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
        else {
            System.out.println("Cantidad inválida para depositar.");
        } // de manera controlada, validamos la cantidad a depositar, no permitimos cantidades negativas
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        else {
            System.out.println("Cantidad inválida para retirar o saldo insuficiente.");
            return false;
        } // de manera controlada, validamos la cantidad a retirar, no permitimos cantidades negativas ni retiros que excedan el saldo
    }
}

// HERENCIA: Es el mecanismo por el cual una clase puede heredar propiedades y comportamientos de otra clase. La clase que hereda se llama subclase o clase derivada, y la clase de la que hereda se llama superclase o clase base. Esto permite reutilizar código y crear jerarquías de clases.

public class Pago {
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago de: " + monto);
    }
}

public class PagoTarjeta extends Pago {
    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto); // llama al constructor de la clase base para inicializar el monto
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta: " + numeroTarjeta + " por monto: " + monto);
    }
}

public class PagoEfectivo extends Pago {
    public PagoEfectivo(double monto) {
        super(monto); // llama al constructor de la clase base para inicializar el monto
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por monto: " + monto);
    }
}

// POLIMORFISMO: Es la capacidad de una clase para tomar muchas formas. En Java, esto se logra a través de la herencia y la implementación de interfaces. El polimorfismo permite que un objeto de una clase derivada sea tratado como un objeto de su clase base, lo que facilita la flexibilidad y la extensibilidad del código.

public class ProcesarPagos {
    public void procesar(Pago pago) {
        pago.procesarPago(); // el método procesarPago se llama en el objeto pago, que puede ser de cualquier clase que herede de Pago, demostrando el polimorfismo
    }

    public static void main(String[] args) {
        ProcesarPagos procesador = new ProcesarPagos();

        Pago pagoEfectivo = new PagoEfectivo(100.0);
        Pago pagoTarjeta = new PagoTarjeta(200.0, "1234-5678-9012-3456");

        procesador.procesar(pagoEfectivo); // procesa un pago en efectivo
        procesador.procesar(pagoTarjeta); // procesa un pago con tarjeta
    }
}

// ABSTRACCION: Es el proceso de simplificar un sistema complejo al enfocarse en los aspectos esenciales y ocultar los detalles innecesarios. En Java, esto se logra a través de clases abstractas e interfaces, que permiten definir contratos y comportamientos sin especificar la implementación concreta. La abstracción ayuda a reducir la complejidad y a mejorar la modularidad del código.

public abstract class Notificador {

    public abstract void enviarNotificacion(String mensaje); // método abstracto que debe ser implementado por las clases derivadas
}    // se crea un contrato para enviar notificaciones, sin especificar cómo se envían, lo que permite diferentes implementaciones

public class NotificadorEmail extends Notificador {
    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por email a " + email + ": " + mensaje);
    }
}

public class NotificadorSMS extends Notificador {
    private String numeroTelefono;

    public NotificadorSMS (String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por email a " + numeroTelefono + ": " + mensaje);
    }
}

// uso desde otro codigo

public class ServicioAlerta {
    private Notificador notificador;

    public ServicioAlerta(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarAlerta(String texto) {
        notificador.enviar(texto);
    }
}

// SOLID

// S - Single Responsibility Principle (Principio de Responsabilidad Única): Una clase debe tener una única responsabilidad o razón para cambiar. Esto significa que cada clase debe estar enfocada en una sola tarea o función, lo que facilita el mantenimiento y la comprensión del código.

// O - Open/Closed Principle (Principio de Abierto/Cerrado): Las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para su extensión pero cerradas para su modificación. Esto significa que se debe poder agregar nueva funcionalidad sin modificar el código existente, lo que ayuda a evitar errores y a mantener la estabilidad del sistema.

// L - Liskov Substitution Principle (Principio de Sustitución de Liskov): Los objetos de una clase derivada deben poder ser sustituidos por objetos de su clase base sin afectar la corrección del programa. Esto significa que las clases derivadas deben cumplir con los contratos establecidos por la clase base, lo que garantiza la coherencia y la fiabilidad del código.

// I - Interface Segregation Principle (Principio de Segregación de Interfaces): Los clientes no deben verse obligados a depender de interfaces que no utilizan. Esto significa que es mejor tener varias interfaces específicas en lugar de una interfaz general, lo que mejora la modularidad y la flexibilidad del código.

// D - Dependency Inversion Principle (Principio de Inversión de Dependencias): Las dependencias deben invertirse, de modo que las clases de alto nivel no dependan de las clases de bajo nivel, sino que ambas dependan de abstracciones. Esto significa que se deben utilizar interfaces o clases abstractas para definir las dependencias, lo que facilita la flexibilidad y la mantenibilidad del código.