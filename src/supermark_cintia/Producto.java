package supermark_cintia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Producto {

	Statement stmt = null;

	Connection acceso;

	private int codigo;
	private String nombre;
	private String marca;
	private String descripcion;
	private Double precio;
	private Integer stock;
	private String categoria;

	public Producto(int codigo, String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria) {
		
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}

	public Producto() {
		super();
	}

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void mostrar() {

		System.out.println("ID: " + this.codigo);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Marca: " + this.marca);
		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Precio: " + this.precio);
		System.out.println("Stock: " + this.stock);
		System.out.println("Categoria: " + this.categoria);
	}
	
	public int getId() {
		return this.codigo;
	}
	
	public boolean iguales(Producto p1) {
		if(this.nombre.equals(p1.getNombre())) {
			if(this.marca.equals(p1.getMarca())) {
				if(this.descripcion.equals(p1.getDescripcion())) {
					if(this.precio.equals(p1.getPrecio())) {
						if(this.stock.equals(p1.getStock())){
							if(this.categoria.equals(p1.getCategoria())) {
								return true;
							}
							else return false;
						}
						else return false;
					}
					else return false;
				}
				else return false;
			}
			else return false;
		}
		return false;
	}

}
