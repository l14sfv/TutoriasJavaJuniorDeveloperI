package Modulo3;

public class Tutoria3 {
    
}

// EJEMPLO HASHMAP y MAP

import java.util.HashMap;
import java.util.Map;

public class EjemploMapHashMap {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar pares clave-valor
        Map<String, String> edades = new HashMap<>();
        Map<String, String> edades = new java.util.LinkedHashMap<>();
        Map<String, String> edades = new java.util.TreeMap<>();

        // Agregar elementos al HashMap
        edades.put("Juan", "25");
        edades.put("María", "30");
        edades.put("Pedro", "28");
        edades.put("PEPITO", "Colombia");

        System.out.println(edades.get("María")); // Imprime: 30
        System.out.println(edades.get("PEPITO")); // Imprime: Colombia
        System.out.println(edades.containsKey("Juan")); // Imprime: true
        System.out.println(edades.containsValue("28")); // Imprime: true
        System.out.println(edades.containsKey("LUIS")); // Imprime: false
        System.out.println(edades.containsValue("1")); // Imprime: false

        for (Map.Entry<String, String> entry : edades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

// EJERCICIOS
// 1- Guardar datos de estudiantes por código o documento
import java.util.HashMap;
import java.util.Map;

public class EjemploEstudiantes {
    public static void main(String[] args) {
        Map<String, String> estudiantes = new HashMap<>();

        estudiantes.put("1001", "Luis Forero");
        estudiantes.put("1002", "Ana Pérez");
        estudiantes.put("1003", "Carlos Ruiz");

        System.out.println(estudiantes.get("1002")); // Ana Pérez
    }
}
// 2- Contar cuántas veces aparece cada palabra en un texto
import java.util.HashMap;
import java.util.Map;

public class EjemploPalabras {
    public static void main(String[] args) {
        String texto = "java map java hashmap map";
        String[] palabras = texto.split(" ");

        Map<String, Integer> conteo = new HashMap<>();

        for (String palabra : palabras) {
            conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
        }

        System.out.println(conteo);
    }
}
// 3- Registrar ventas por fecha
import java.util.HashMap;
import java.util.Map;

public class EjemploVentas {
    public static void main(String[] args) {
        Map<String, Double> ventas = new HashMap<>();

        ventas.put("2026-07-10", 150000.0);
        ventas.put("2026-07-11", 230000.0);
        ventas.put("2026-07-12", 180000.0);

        System.out.println(ventas.get("2026-07-11")); // 230000.0
    }
}
// 4- Relacionar un ID con un objeto en memoria para buscar rápido
import java.util.HashMap;
import java.util.Map;

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class EjemploObjetos {
    public static void main(String[] args) {
        Map<Integer, Producto> productos = new HashMap<>();

        productos.put(1, new Producto("Mouse", 45000));
        productos.put(2, new Producto("Teclado", 85000));

        Producto p = productos.get(2);
        System.out.println(p.nombre + " - " + p.precio);
    }
}
// 5- Guardar reglas de un juego, por ejemplo casilla de origen y casilla destino.
import java.util.HashMap;
import java.util.Map;

public class EjemploJuego {
    public static void main(String[] args) {
        Map<String, String> reglas = new HashMap<>();

        reglas.put("A1", "B3");
        reglas.put("C2", "D4");
        reglas.put("E5", "F6");

        System.out.println(reglas.get("C2")); // D4
    }
}
