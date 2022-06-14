package supermark.code;

import java.sql.Date;
import java.util.ArrayList;

public class Factura {

	private char tipo;
	private Integer id;
	private Date fecha;
	private ArrayList<Detalle> detalles;
	private String localidad;
	private String domicilio;
	private Cliente cliente;
	private float total;

	public Factura(char tipo, Integer id, Date fecha, ArrayList<Detalle> detalles, String localidad, String domicilio,
			Cliente cliente, float total) {
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
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
		System.out.println("Detalle: " + this.detalles);
		System.out.println("Total: " + this.total);
	}

}
