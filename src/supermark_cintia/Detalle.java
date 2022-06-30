package supermark_cintia;

public class Detalle {
	
	private Producto stock;
	private Producto descripcion;
	private float precio_unit;
	private float precio_total;
	private float subtotal;
	private float descuento;
	private float total;
	
	public Detalle(Producto stock, Producto descripcion, float precio_unit, float precio_total, float subtotal,
			float descuento, float total) {
		super();

		this.stock = stock;
		this.descripcion = descripcion;
		this.precio_unit = precio_unit;
		this.precio_total = precio_total;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.total = total;
	}
	public Producto getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(Producto descripcion) {
		this.descripcion = descripcion;
	}
	
	public Producto getStock() {
		return stock;
	}

	public void setStock(Producto stock) {
		this.stock = stock;
	}

	public float getPrecio_unit() {
		return precio_unit;
	}
	public void setPrecio_unit(float precio_unit) {
		this.precio_unit = precio_unit;
	}
	public float getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(float precio_total) {
		this.precio_total = precio_total;
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
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
public void mostrar() {
		
		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Cantidad "+this.stock);
		System.out.println("Precio por unitario: " + this.precio_unit);
		System.out.println("Precio por cant. total: " + this.precio_total);
		System.out.println("Subtotal: " + this.subtotal);
		System.out.println("Descuento: " + this.descuento);
		System.out.println("Total: "+this.total);

	}
	
}
