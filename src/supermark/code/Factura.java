package supermark.code;

import java.sql.Date;
import java.util.ArrayList;

public class Factura {

	private char tipo;
	private Integer id;
	private Date fecha;
	private Cliente localidad;
	private Domicilio domicilio;
	private Cliente cliente;
	private Detalle cantidad;
	private ArrayList<Detalle> detalles;
	private Detalle total;

	public Factura(char tipo, Integer id, Date fecha, ArrayList<Detalle> detalles, Cliente localidad, Domicilio domicilio,
			Cliente cliente, Detalle total) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.fecha = fecha;
		this.detalles = detalles;
		this.localidad = localidad;
		this.domicilio = domicilio;
		this.cliente = cliente;
		this.total = total;
	}

	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Detalle getTotal() {
		return total;
	}

	public void setTotal(Detalle total) {
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

	public Cliente getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Cliente localidad) {
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
		
		System.out.println("Tipo de Factura: " + this.tipo);
		System.out.println("Nro de Factura: "+this.id);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Señor(res): " + this.cliente);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Localidad: " + this.localidad);
		System.out.println("Cantidad: "+this.cantidad);  
		System.out.println("Detalle: " + this.detalles);
		System.out.println("Total: " + this.total);
	}

}
