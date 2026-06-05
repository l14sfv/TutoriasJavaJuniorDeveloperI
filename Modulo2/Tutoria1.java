//POO

// vehiculo
// motor, ruedas, puertas, asientos, luces, frenos, acelerador, volante, escape, combustible

// carro 
// atributos = color, modelo, marca, año, placa, , puertas, asientos, cambios

// metodos = arrancar, acelerar, frenar, estacionar, encender luces, apagar luces, abrir puertas, cerrar puertas

// clase se puede ver como un molde o plantilla para crear objetos

// clase principal vehiculo
class Vehiculo {
    // atributos
    String color;
    String modelo;
    private String marca;
    int año;
    String placa;
    int puertas;
    int asientos;
    String cambios;

    // metodos
    void arrancar() {
        System.out.println("El vehiculo ha arrancado");
    }

    void acelerar() {
        System.out.println("El vehiculo esta acelerando");
    }

    void frenar() {
        System.out.println("El vehiculo esta frenando");
    }

    void estacionar() {
        System.out.println("El vehiculo esta estacionado");
    }

    void encenderLuces() {
        System.out.println("Las luces del vehiculo estan encendidas");
    }

    void apagarLuces() {
        System.out.println("Las luces del vehiculo estan apagadas");
    }

    void abrirPuertas() {
        System.out.println("Las puertas del vehiculo estan abiertas");
    }

    void cerrarPuertas() {
        System.out.println("Las puertas del vehiculo estan cerradas");
    }
}

class carro extends vehiculo {
    // atributos adicionales
    String tipoCombustible;
    int capacidadMaletero;

    // metodos adicionales
    void tocarBocina() {
        System.out.println("El carro esta tocando la bocina");
    }
}

class chevrolet extends carro {
    // atributos adicionales
    String modeloEspecifico;

    // metodos adicionales
    void mostrarModelo() {
        System.out.println("El modelo del Chevrolet es: " + modeloEspecifico);
    }

    static int mostrarMarca() {
        return 0;
    }
}

class main {
    public static void main(String[] args) {
        chevrolet a = new chevrolet();
        chevrolet b = new chevrolet();
        chevrolet c = new chevrolet();

        a.modeloEspecifico = "Camaro";
        b.modeloEspecifico = "Corvette";
        c.tipoCombustible = "Gasolina";
        b.tipoCombustible = "Hibrido";
        a.marca = "Chevrolet";
        b.puertas = 2;

        a.mostrarModelo(); // chevrolet
        b.mostrarModelo();
        a.arrancar();
        a.acelerar();
        b.frenar();
        b.estacionar();
        b.encenderLuces();
        b.apagarLuces();
        b.abrirPuertas();
        a.cerrarPuertas();
        a.tocarBocina();
    }
}

// getters y setters

// HERENCIA

// ENCAPSULAMIENTO

// POLIMORFISMO

// ABSTRACCION

// STATIC
// NO STATIC

//static que no necesita objetos para usarse
class Vehiculo {
    static int numeroDeRuedas = 4; // atributo estatico
    String color; // atributo no estatico
    String modelo; // atributo no estatico

    Vehiculo(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    //Sataic que no necesita objetos para usarse
    static void mostrarContador() {
        System.out.println("El numero de ruedas es: " + numeroDeRuedas);
    }

class main {
    public static void main(String[] args) {
        Vehiculo.mostrarContador(); // se puede llamar sin crear un objeto

        Vehiculo a = new Vehiculo("Rojo", "Sedan");
        System.out.println("El color del vehiculo es: " + a.color);

        Vehiculo.mostrarContador(); // se puede llamar sin crear un objeto
}
}

// no static necesita objetos para usarse
class Vehiculo {
    public String color; // atributo no estatico
    String modelo; // atributo no estatico
    int ano; // atributo no estatico

    void mostrarInformacion() {
        System.out.println("El color del vehiculo es: " + color);
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("El año del vehiculo es: " + ano);
    }
    
class main {
    public static void main(String[] args) {
        Vehiculo a = new Vehiculo();
        Vehiculo b = new Vehiculo();
        Vehiculo c = new Vehiculo();

        a.color = "Azul";
        a.modelo = "SUV";
        a.ano = 2020;

        a.mostrarInformacion(); // se muestra la informacion del vehiculo
    }
}


// public
usar public para que el atributo o metodo sea accesible desde cualquier clase

// private
solamente se puede acceder desde la misma clase

// protected
se puede acceder desde la misma clase y desde las clases que heredan de esa clase

class vehiculo {
    public String color; // atributo publico
    private String modelo; // atributo privado

    public void arrancar(String modelo) { // metodo publico para establecer el valor del modelo
        System.out.println("El vehiculo ha arrancado");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String frenar() { // metodo privado para obtener el valor del modelo
        return modelo;
    }
}

class main {
    public static void main(String[] args) {
        vehiculo a = new vehiculo();
        a.color = "Rojo"; // se puede acceder al atributo publico
        a.arrancar("Sedan"); // se puede acceder al metodo publico

        // a.modelo = "SUV"; // no se puede acceder al atributo privado
        // System.out.println(a.frenar()); // no se puede acceder al metodo privado

        a.setModelo("SUV"); // se puede acceder al metodo publico para establecer el valor del modelo
        System.out.println(a.getModelo()); // se puede acceder al metodo publico para obtener el valor del modelo
    }
}

