package supermark_cintia;

import java.sql.Date;
import java.util.ArrayList;

public class Factura {

	private char tipo;
	private Integer id;
	private Date fecha;
	private Cliente localidad;
	private Domicilio domicilio;
	private Cliente cliente;
	private Producto stock;
	private Producto descripcion;
	private ArrayList<Detalle> detalles;

	
	public Factura(char tipo, Integer id, Date fecha, Cliente localidad, Domicilio domicilio, Cliente cliente,
			Producto stock, Producto descripcion, ArrayList<Detalle> detalles) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.fecha = fecha;
		this.localidad = localidad;
		this.domicilio = domicilio;
		this.cliente = cliente;
		this.stock = stock;
		this.descripcion = descripcion;
		this.detalles = detalles;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public Cliente getLocalidad() {
		return localidad;
	}



	public void setLocalidad(Cliente localidad) {
		this.localidad = localidad;
	}



	public Domicilio getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Producto getStock() {
		return stock;
	}



	public void setStock(Producto stock) {
		this.stock = stock;
	}



	public Producto getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(Producto descripcion) {
		this.descripcion = descripcion;
	}



	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}



	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}


	public void mostrar() {
		
		System.out.println("Tipo de Factura: " + this.tipo);
		System.out.println("Nro de Factura: "+this.id);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Señor(res): " + this.cliente);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Localidad: " + this.localidad);
		System.out.println("Cantidad: "+this.stock);  
		System.out.println("Detalle: " + this.detalles);
	}

}
