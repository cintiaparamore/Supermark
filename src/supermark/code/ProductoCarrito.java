package supermark.code;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductoCarrito extends Producto {
	
	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;
	
	private Integer cantidad;
	
	public ProductoCarrito(String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria, Integer cantidad) {
		super();
		
		this.cantidad = cantidad;
	}
	
	public ProductoCarrito(int codigo, String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria, Integer cantidad) {
		super(codigo, nombre, marca, descripcion, precio, stock, categoria);
		
		this.cantidad = cantidad;
	}
	public ProductoCarrito(int codigo, String nombre, String marca, String descripcion, Double precio, Integer stock, Integer cantidad) {
		super(codigo, nombre, marca, descripcion, precio, stock);
		this.cantidad = cantidad;
	}
	
	public ProductoCarrito(Integer cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public ProductoCarrito() {

	}

	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public void mostrar() {
		
		super.mostrar();
		System.out.println("Cantidad: " + this.cantidad);
	}
	
	
}
