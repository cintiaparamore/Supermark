package supermark.code;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Calendar;

public class Carrito {
	
	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;
	
	private int id;
	private String fecha;
	private ArrayList <ProductoCarrito> productos;
	private int canticarrito; // Agregado Cecy 10/07/2022
	private double totalcarrito;
	
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
		
	//	if(this.productos.size()<30) {
			this.productos.add(nuevo);
			totalcarrito = totalcarrito + (nuevo.getCantidad()*nuevo.getPrecio());			
		//}
	//	else System.out.println("ï¿½Lo siento! pero excede los 30 articulos por compra. Vuelva a realizar otra compra");
		
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
			System.err.println("ï¿½Error!");

	}
	
	
	
	public void graba_detalle() {
		
		int ultimo_id_ventas = 0;
		int codip = 0;
		int cantip = 0;
	    Double subtotalp = 0.0;
		
		// Obtengo en la variable: ultimo_id_ventas, el último ID grabado en la tabla ventas
				String sql_ultimo_id = "SELECT MAX(id_ventas) AS id FROM ventas";
				acceso = connection.connect();
				try {
					stmt = acceso.createStatement();
				} catch (SQLException e1) {// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					ResultSet rs;
					rs = stmt.executeQuery(sql_ultimo_id);
					rs.next();
					int id_ventas = rs.getInt("id");
					
					ultimo_id_ventas = id_ventas;
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				// Recorro el carrito para ir grabando en la tabla detalle_ventas
				for(int i=0;i<this.productos.size();i++) {
					codip = this.productos.get(i).getcodigo();
					cantip = this.productos.get(i).getCantidad();
					subtotalp = this.productos.get(i).getCantidad()*this.productos.get(i).getPrecio(); 
	
     		        String sql_insertar_detalle =  "INSERT INTO detalle_ventas (id_ventas, codigo, cantidad, subtotal) VALUES (" + ultimo_id_ventas + "," + codip + "," + cantip + "," + subtotalp + ")";
				
					acceso = connection.connect();
						
					try {
						stmt = acceso.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			    	try {
				    stmt.executeUpdate(sql_insertar_detalle);
		    		} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		
	}
		
	
	
		public void mostrar() {
		double total=0;
		
		// Agregado Cecy 10/07/2022
		int cantidadcarrito=0;  
		String fechacompra = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		//
				
		System.out.println("Fecha: "+ fechacompra);
		System.out.println("---------------------------------------");
		System.out.println("-------- PRODUCTOS EN CARRITO ---------");
		System.out.println("---------------------------------------");
		
		if(this.productos.size()!=0) {
			for(int i=0;i<this.productos.size();i++) {
				this.productos.get(i).mostrarCarrito();
				System.out.print("Cantidad: " +this.productos.get(i).getCantidad());
				System.out.println("");
				total=total+this.productos.get(i).getCantidad()*this.productos.get(i).getPrecio();
				
				// Agregado Cecy 10/07/2022
				cantidadcarrito=cantidadcarrito+this.productos.get(i).getCantidad();
				//
			}
			
			System.out.println("Total: $ "+total);
			System.out.println("Total de artículos en carrito: "+cantidadcarrito);
			
		}
		else System.out.println("Su Carrito se encuentra Vacio");
		
	}

	public float getTotal() {
		return 0;
	}

	
	// Agregado Cecy 10/07/2022
	public int getCanticarrito() {
		return canticarrito;
	}
	public void setCanticarrito(int canticarrito) {
		this.canticarrito = canticarrito;
	}
	//

	public double getTotalcarrito() {
		return totalcarrito;
	}

	public void setTotalcarrito(double totalcarrito) {
		this.totalcarrito = totalcarrito;
	}
	
	
}

