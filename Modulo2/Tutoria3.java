
package Modulo2;


class Persona {
    String nombre;
    int edad;
    String direccion;
    String telefono;
    String email;
    int numero;

    Persona(String nombre, int edad, String direccion, String telefono, String email, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numero = numero;
    }

    public Persona(String nombre, int edad, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
    public static void main(String[] args) {
            Persona persona = new Persona("Juan", 25, "Calle Principal 123", "555-1234", "juan@email.com");
            Estudiante estudiante = new Estudiante("María", 20, "Calle Secundaria 456", "555-5678", "maria@email.com", "Ingeniería", 3, "Universidad XYZ");
        }

class Estudiante extends Persona {
    public String carrera;
    private int semestre;
    protected String universidad;

    Estudiante(String nombre, int edad, String direccion, String telefono, String email, String carrera, int semestre, String universidad) {
        super(nombre, edad, direccion, telefono, email);
        this.carrera = carrera;
        this.semestre = semestre;
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    
}

Estudiante estudiante = new Estudiante("Carlos", 22, "Calle Tercera 789", "555-9012")

String nombre = estudiante.getNombre(); //persona clase padre
estudiante.setDireccion("Calle Nueva 321"); //modificar la dirección de la persona

String carrera = estudiante.getCarrera(); //estudiante clase hija
estudiante.setSemestre(4); //modificar el semestre del estudiante