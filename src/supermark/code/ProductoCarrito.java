package supermark.code;

public class ProductoCarrito {
	
	private Integer cantidad;
	private float precio_vta;
	
	public ProductoCarrito(Integer cantidad, float precio_vta) {
		super();
		this.cantidad = cantidad;
		this.precio_vta = precio_vta;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio_vta() {
		return precio_vta;
	}
	public void setPrecio_vta(float precio_vta) {
		this.precio_vta = precio_vta;
	}
	
	public void mostrar() {

		System.out.println("Cantidad: " + this.cantidad);
		System.out.println("Precio: " + this.precio_vta);
	}
}
