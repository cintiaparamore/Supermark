package supermark.code;

import java.sql.Date;

public class Producto {
	private Integer id;
	private String nombre;
	private String marca;
	private String descripcion;
	private Date fecha_vec;
	private Double precio;
	private Integer stock;
	private String categoria;

	public Producto(Integer id, String nombre, String marca, String descripcion, Date fecha_vec, Double precio,
			Integer stock, String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.fecha_vec = fecha_vec;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getFecha_vec() {
		return fecha_vec;
	}

	public void setFecha_vec(Date fecha_vec) {
		this.fecha_vec = fecha_vec;
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

		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Marca: " + this.marca);
		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Fecha de vecimiento: " + this.fecha_vec);
		System.out.println("Precio: " + this.precio);
		System.out.println("Stock: "+this.stock);
		System.out.println("Categoria: "+this.categoria);
	}
<<<<<<< HEAD
}
=======
	
    
	
}
>>>>>>> f48030c37473454d0efe90e849ac224d11dc9641
