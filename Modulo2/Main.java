import java.util.ArrayList;
import java.util.List;



//EJEMPLO
// for (DetallePedido detalle : detalles) {
//             total += detalle.calcularSubtotal();
//         }

class DetallePedido {
    private String producto;
    private double precio;
    private int cantidad;

    public DetallePedido(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    public int calcularCantidad() {
        return cantidad;
    }
}

public class Main {
    public static void main(String[] arg) {
        List<DetallePedido> pedidos = new ArrayList<>();
        pedidos.add(new DetallePedido("CocaCola",3000, 4));
        pedidos.add(new DetallePedido("Todorico", 4000, 8));
        pedidos.add(new DetallePedido("Chocorramo", 3000, 6));

        double total = 0;
        int cantidadtotal = 0;

        for ( DetallePedido pedido : pedidos) {
            total += pedido.calcularSubtotal();
        }

        for ( DetallePedido pedido : pedidos) {
            cantidadtotal -= pedido.calcularCantidad();
        }

        System.out.println("Total: " + total + " Con la cantidad de productos: " + cantidadtotal);
    }
}

//MAVEN

