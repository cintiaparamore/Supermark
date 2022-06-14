package supermark.code;

import java.sql.Date;
import java.util.ArrayList;

public class Factura {

	private char tipo;
	private Integer id;
	private Date fecha;
	private ArrayList<Producto> productos;
	private Integer stock;
	private String localidad;
	private String domicilio;
	private Cliente cliente;
	private float subtotal;
	private float descuento;
	private float total;

	public Factura(char tipo, Integer id, Date fecha, ArrayList<Producto> productos, Integer stock, String localidad,
			String domicilio, Cliente cliente, float subtotal, float descuento, float total) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.fecha = fecha;
		this.productos = productos;
		this.stock = stock;
		this.localidad = localidad;
		this.domicilio = domicilio;
		this.cliente = cliente;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.total = total;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
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

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void mostrar() {
		
		System.out.println("Tipo: " + this.tipo);
		System.out.println("ID: "+this.id);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Cliente: " + this.cliente);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Localidad: " + this.localidad);
		System.out.println("Productos: " + this.productos);
		System.out.println("Cantidad: " + this.stock);
		System.out.println("Subtotal: " + this.subtotal);
		System.out.println("Descuento: " + this.descuento);
		System.out.println("Total: " + this.total);
	}

}
