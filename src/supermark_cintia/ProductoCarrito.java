package supermark_cintia;

public class ProductoCarrito extends Producto {
	
	private Integer cantidad;
	
	public ProductoCarrito(String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria, Integer cantidad) {
		super(nombre, marca, descripcion, precio, stock, categoria);
		this.cantidad = cantidad;
	}

	public ProductoCarrito(int codigo, String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria, Integer cantidad) {
		super(codigo, nombre, marca, descripcion, precio, stock, categoria);
		this.cantidad = cantidad;
	}

	public ProductoCarrito(Integer cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public void mostrar() {
		
		super.mostrar();
		System.out.println("Cantidad: " + this.cantidad);
	}
}
