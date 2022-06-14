package supermark.code;

public class Detalle {
	
	private Producto descripcion;
	private Integer cantidad;
	private float subtotal;
	private float descuento;
	
	public Detalle(Producto descripcion, Integer cantidad, float subtotal, float descuento) {
		super();
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.descuento = descuento;
	}
	public Producto getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(Producto descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
}
