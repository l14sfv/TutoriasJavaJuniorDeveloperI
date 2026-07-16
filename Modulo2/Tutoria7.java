import java.util.List;
import java.util.ArrayList;

public class Tutoria7 {
    
}

public class Cliente {
    public String nombre;
    public int edad;
    public List <String> telefono;


    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = new ArrayList<>();
    }

    

}

public List<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<String> telefono) {
        this.telefono = telefono;
    }



Cliente cliente = new Cliente(nombre, edad);
Cliente.telefono.add("3030303030");
Cliente.telefono.get(0);
Cliente.telefono.set(0, "32323323");
Cliente.telefono.remove(2);
Cliente.telefono.size();

public class Comensal extends Cliente {

    public List <String> pedido;

    public Comensal(String nombre, int edad, List<String> pedido) {
        super(nombre, edad);
        this.pedido = new ArrayList<>();
    }
    
    
}
    
Comensal c1 = new Comensal(nombre, edad);
c1.telefono.add("30303030303030");
c1.pedido.add("asdasdas");


Comensal ejemplo = new Comensal(nombre, edad, telefono);
ejemplo.add(new Pedido());
ejemplo.add(2, new Pedido());

List <Persona> personas = new ArrayList<>();
List <Cosa> cosas = new ArrayList<>();

personas.add(new Persona("Luis", 30));
personas.add(new Persona("carlos", 20));

Cosas.addAll(personas);


List <String> nuevos = Arrays.asList("asas", "23", "asas", 23);
Cosas.addAll(2, nuevos);

//INTERFACE

public interface Pagable {
    void pagar();
}

public class Tarjeta implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pago con Tarjeta");        
    }
}

// LLAMANDO UNA CLASE

public class ServicioRegistro {
    public void guardar(String nombre) {
        System.out.println("Guardando: " + nombre);
    }
}

public interface Registrable { 
    void registrar();    
}

public class Comensal extends Cliente implements Registrable {
    public Comensal(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void registrar() {
        ServicioRegistro servicio = new ServicioRegistro();
        servicio.guardar(this.nombre);
    }
}
