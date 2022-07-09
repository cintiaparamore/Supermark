package supermark.code;

import java.sql.Date;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.util.ArrayList;

public class Carrito {
	
	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;
	
	private int id;
	private String fecha;
	private ArrayList <ProductoCarrito> productos;
	
	public Carrito() {
		this.id=0;
		this.productos=new ArrayList<ProductoCarrito>();
	}
	
	public Carrito(int id, String fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.productos = new ArrayList<ProductoCarrito>();
	}

	public Carrito(int id, String fecha, ArrayList<ProductoCarrito> productos) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.productos = productos;
	}

	public Carrito(Object o, Object o1, Object o2, int opcion1) {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<ProductoCarrito> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoCarrito> productos) {
		this.productos = productos;
	}

	public void agregar(ProductoCarrito nuevo) {
		
		if(this.productos.size()<30) {
			this.productos.add(nuevo);
		}
		else System.out.println("�Lo siento! pero excede los 30 articulos por compra. Vuelva a realizar otra compra");
		
	} 

	public Producto buscar(int pos) {

		if (pos > 0 && pos < this.productos.size()) {
			return this.productos.get(pos);
		} else
			return null;

	}

	public void quitar(int pos) {

		if (pos > 0 && pos < this.productos.size()) {
			this.productos.remove(pos);
		} else
			System.err.println("�Error!");

	}
	
	public void mostrar() {
		double total=0;
		System.out.println("Fecha:"+this.fecha);
		if(this.productos.size()!=0) {
			for(int i=0;i<this.productos.size();i++) {
				this.productos.get(i).mostrarCarrito();
				System.out.print("Cantidad: " +this.productos.get(i).getCantidad());
				System.out.println("");
				total=total+this.productos.get(i).getCantidad()*this.productos.get(i).getPrecio();
			}
			System.out.println("Total: $"+total);
		}
		else System.out.println("Su Carrito se encuentra Vacio");
		
	}

	public float getTotal() {
		return 0;
	}
}

