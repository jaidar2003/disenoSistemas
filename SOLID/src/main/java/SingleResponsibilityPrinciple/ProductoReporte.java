package SingleResponsibilityPrinciple;

public class ProductoReporte {
    public void imprimirDetalles(Producto producto) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
    }
}
