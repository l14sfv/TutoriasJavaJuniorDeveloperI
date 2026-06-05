/**
 * TUTORIA 7 — Métodos en Java
 */
public class Tutoria7 {

    // =========================================================================
    // 1. MÉTODOS DE INSTANCIA (NO static)
    // =========================================================================
    // Pertenece al OBJETO. Para llamarlos hace falta: Tutoria7 obj = new Tutoria7();
    // Luego: obj.nombreDelMetodo();
    //
    // Sintaxis general:
    //   [modificadores] tipoRetorno nombreMetodo(parámetros) { cuerpo }
    //
    // - public  → visible desde cualquier clase.
    // - void    → NO devuelve valor (solo ejecuta acciones).
    // - int, String, double, boolean, etc. → SÍ devuelve un valor (obligatorio usar return).
    // =========================================================================

    // -------------------------------------------------------------------------
    // 1.1 public void — SIN retorno de valor (método de instancia)
    // -------------------------------------------------------------------------
    public void imprimirMensaje() {
        System.out.println("Hola Mundo (método de instancia, void)");
    }

    /*
     * recibe parámetros pero no retorna nada.
     */
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // -------------------------------------------------------------------------
    // 1.2 public &lt;tipo&gt; — CON retorno de valor (método de instancia)
    // -------------------------------------------------------------------------
    /*
    public int sumar(int a, int b) {
        return a + b;
    }

    /*
     * Retorno de tipo referencia (String).
     */
    public String obtenerSaludo(String nombre) {
        return "Bienvenido, " + nombre;
    }

    // =========================================================================
    // 2. MÉTODOS ESTÁTICOS (static)
    // =========================================================================
    // Pertenece a la CLASE, no a un objeto concreto.
    // Llamada directa: Tutoria7.nombreDelMetodo();  (sin new)
    //
    // - static + void     → acción utilitaria sin devolver dato (ej. imprimir config).
    // - static + tipo     → cálculo o consulta sin necesitar estado del objeto.
    //
    // Regla: un método static NO puede usar {@code this} ni atributos de instancia
    //        salvo que reciba un objeto como parámetro.
    // =========================================================================

    // -------------------------------------------------------------------------
    // 2.1 public static void — SIN retorno de valor (método estático)
    // -------------------------------------------------------------------------
    /* 
     * no requiere new Tutoria7().
     * se invoca con el nombre de la clase: Tutoria7.imprimirMensajeEstatico();
     */
    public static void imprimirMensajeEstatico() {
        System.out.println("Hola Mundo desde un método estático (void)");
    }

    /*
     * Utilidad estática: validar y mostrar sin devolver nada.
     */
    public static void mostrarResultado(int a, int b) {
        int resultado = sumarEstatico(a, b);
        System.out.println("Suma estática: " + resultado);
    }

    // -------------------------------------------------------------------------
    // 2.2 public static &lt;tipo&gt; — CON retorno de valor (método estático)
    // -------------------------------------------------------------------------
    /*
     * Método estático con retorno.
     */
    public static int sumarEstatico(int a, int b) {
        return a + b;
    }

    /*
     * Factory o utilidad: crea texto sin instanciar la clase para el cálculo.
     */
    public static String formatearEtiqueta(String texto) {
        return "[INFO] " + texto;
    }

    // =========================================================================
    // 3. COMPARACIÓN RÁPIDA (tabla conceptual en comentarios)
    // =========================================================================
    //
    // | Declaración              | ¿Necesita objeto? | ¿Devuelve valor? | Ejemplo de llamada                    |
    // |--------------------------|-------------------|------------------|---------------------------------------|
    // | public void met()        | Sí                | No               | obj.met();                            |
    // | public int met()         | Sí                | Sí (int)         | int x = obj.met();                    |
    // | public static void met() | No                | No               | Clase.met();                          |
    // | public static int met()  | No                | Sí (int)         | int x = Clase.met();                  |
    //
    // =========================================================================
    // 4. PUNTO DE ENTRADA — demostración de las cuatro variantes
    // =========================================================================

    public static void main(String[] args) {
        System.out.println("=== Métodos de instancia ===");

        Tutoria7 tutor = new Tutoria7();

        // void (sin retorno)
        tutor.imprimirMensaje();
        tutor.saludar("Ana");

        // con retorno
        int suma = tutor.sumar(4, 6);
        System.out.println("sumar(4, 6) = " + suma);
        System.out.println(tutor.obtenerSaludo("Carlos"));

        System.out.println("\n=== Métodos estáticos ===");

        // static void (sin retorno)
        Tutoria7.imprimirMensajeEstatico();
        Tutoria7.mostrarResultado(7, 3);

        // static con retorno
        int sumaEstatica = Tutoria7.sumarEstatico(7, 3);
        System.out.println("sumarEstatico(7, 3) = " + sumaEstatica);
        System.out.println(Tutoria7.formatearEtiqueta("Maven listo"));

        // También válido (pero menos claro): llamar static desde objeto
        tutor.imprimirMensajeEstatico();
    }
}

// =============================================================================
// REFERENCIA ADICIONAL (no forma parte de la compilación de Tutoria7)
// =============================================================================
//
// --- CICLOS (ejemplo) ---
// for (int i = 0; i < 5; i++) { System.out.println(i); }
// while (j < 5) { j++; }
// do { k++; } while (k < 5);
//
// --- CONDICIONALES ---
// if (condicion) { } else if (otra) { } else { }
// switch (variable) { case valor1: break; default: break; }
//
// --- MAVEN ---
// mvn clean | compile | test | package | install | deploy | -version
// mvnd --stop | --status | clean install
//
// --- CONSTRUCTOR ---
// Se ejecuta al hacer new Clase(). Inicializa atributos del objeto.
// public Persona(String nombre) { this.nombre = nombre; }
//
// --- GETTERS / SETTERS ---
// public String getNombre() { return nombre; }   // con retorno
// public void setNombre(String n) { nombre = n; } // void, sin retorno


//cuando se llaman
public class Tutoria7 {
    public Tutoria7() {
    }
 
    public void imprimirMensaje() {
       System.out.println("Hola Mundo (método de instancia, void)");
    }
 
    public void saludar(String var1) {
       System.out.println("Hola, " + var1);
    }
 
    public int sumar(int var1, int var2) {
       return var1 + var2;
    }
 
    public String obtenerSaludo(String var1) {
       return "Bienvenido, " + var1;
    }
 
    public static void imprimirMensajeEstatico() {
       System.out.println("Hola Mundo desde un método estático (void)");
    }
 
    public static void mostrarResultado(int var0, int var1) {
       int var2 = sumarEstatico(var0, var1);
       System.out.println("Suma estática: " + var2);
    }
 
    public static int sumarEstatico(int var0, int var1) {
       return var0 + var1;
    }
 
    public static String formatearEtiqueta(String var0) {
       return "[INFO] " + var0;
    }
 
    public static void main(String[] var0) {
       System.out.println("=== Métodos de instancia ===");
       Tutoria7 var1 = new Tutoria7();
       var1.imprimirMensaje();
       var1.saludar("Ana");
       int var2 = var1.sumar(4, 6);
       System.out.println("sumar(4, 6) = " + var2);
       System.out.println(var1.obtenerSaludo("Carlos"));
       System.out.println("\n=== Métodos estáticos ===");
       imprimirMensajeEstatico();
       mostrarResultado(7, 3);
       int var3 = sumarEstatico(7, 3);
       System.out.println("sumarEstatico(7, 3) = " + var3);
       System.out.println(formatearEtiqueta("Maven listo"));
       imprimirMensajeEstatico();
    }
 }
 