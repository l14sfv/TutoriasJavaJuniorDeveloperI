public class Tutoria6 

public class Animal {
    public String nombre;
    public int peso;

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void hacerSonido() {
        System.out.println("El animal hace sonido");
    }
    public void moverse() {
        System.out.println(nombre + "se mueve");
    }

}

public class Perro extends Animal {
    public String raza;

    public Perro(String nombre, int peso, String raza) {
        super(nombre, peso);
        this.raza = raza;
    }

    @Override
    public void hacerSonido () {
        System.out.println(nombre +"hace guau");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + "corre a 4 patas");
    }
}

public class Pajaro extends Animal {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre +"hace pio");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + "volar");
    }
}

public class Main {
    public static void main(String[] arg) {
        Animal animal1 = new Perro("Manchas", 2, "Caniche");
        Animal animal2 = new Pajaro("Piolin");

        Animal[] animales = {animal1, animal2};
        // Animal[] animales = new Animal[]{animal1, animal2};

        for (Animal animal : animales) {
            animal.hacerSonido();
            animal.moverse();
            System.out.println("------");
        }

        for (int i = 0; i < animales.length; i++) {
            Animal animal = animales[i];
            animal.hacerSonido();
            animal.moverse();
            System.out.println("------");
        }
    }
}