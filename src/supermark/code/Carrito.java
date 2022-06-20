package supermark.code;

import java.sql.Date;
import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<ProductoCarrito> producto;
	private Float total;
	private Date fecha;
	private Integer id;
	
	
	public Carrito(ArrayList<ProductoCarrito> producto, Float total, Date fecha, Integer id) {
		super();
		this.producto = producto;
		this.total = total;
		this.fecha = fecha;
		this.id = id;
	}
	public ArrayList<ProductoCarrito> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<ProductoCarrito> producto) {
		this.producto = producto;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
