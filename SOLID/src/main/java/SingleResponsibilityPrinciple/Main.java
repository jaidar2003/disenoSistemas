package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1200.0, 10);

        ProductoGestor gestor = new ProductoGestor();
        ProductoReporte reporte = new ProductoReporte();

        gestor.actualizarStock(producto, 5);  // Aumentar el stock en 5
        reporte.imprimirDetalles(producto);  // Imprimir detalles del producto
    }
}
