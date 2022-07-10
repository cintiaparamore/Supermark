package supermark.code;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class miCuenta {
	static Carrito carrito1 = new Carrito();
	private Usuario usuario;
	private Carrito carrito;
	private Compra compra;
	
	 
	
	public miCuenta(Usuario usuario, Carrito carrito, Compra compra) {
		super();
		this.usuario = usuario;
		this.carrito = carrito;
		this.compra = compra;
	}

	public miCuenta() {

	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public void mostrar() {
	
		System.out.println("Mi Usuario: "+this.usuario);
		System.out.println("Mis compras: "+this.compra);
		
	}

	public static void menuUsuario(Usuario user) {
		Producto producto1 = new Producto();
		Producto produ = new Producto();
		Statement stmt = null;
		ConexionBDD connection = new ConexionBDD();
		Connection acceso;
		Scanner leer = new Scanner(System.in);
		
		int clicli = 0;
				 
		

		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("-------------- MI CUENTA --------------");
		System.out.println("---------------------------------------");
		System.out.println("-(1)- Mostrar mis datos");
		System.out.println("-(2)- Ver Lista de Productos");
		System.out.println("-(3)- Seleccionar Productos y cantidad");
		System.out.println("-(4)- Ver Productos Seleccionados");
		System.out.println("-(5)- Confirmar Compra");
		System.out.println("---------------------------------------");
		System.out.println("");

		
		switch (leer.nextInt()){

			case 1:

				System.out.println("MIS DATOS");

				try {

					String sql = "SELECT * FROM clientes WHERE email='"+ user.getEmail()+"';";
					
					acceso = connection.connect();
					stmt = acceso.createStatement();

					ResultSet rs = stmt.executeQuery(sql);

					//int c = 0;

					while (rs.next()) {

						int id = rs.getInt("id");
						String nombre = rs.getString("nombre");
						String apellido = rs.getString("apellido");
						String dni = rs.getString("dni");
						String domicilio = rs.getString("domicilio");
						String telefono = rs.getString("telefono");
						String celular = rs.getString("celular");
						String localidad = rs.getString("localidad");
						String email = rs.getString("email");

						//int clicli = id;
						//int usu = id;
						
						System.out.println("ID cliente: " + id + " | ");
						System.out.println("Nombre: " + nombre + " | ");
						System.out.println("Apellido: " + apellido + " | ");
						System.out.println("DNI: " + dni + " | ");
						System.out.println("Domicilio: " + domicilio + " | ");
						System.out.println("Telefono: " + telefono+ " | ");
						System.out.println("Celular: " + celular+ " | ");
						System.out.println("Localidad: " + localidad+ " | ");
						System.out.println("Email: " + email+ " | ");

						//c++;
					}
					menuUsuario(user);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("Error al conectarse a la Base de Datos.");
					e1.printStackTrace();
				}

			case 2:
				if (!produ.listarProductosCuenta()){
					miCuenta.menuUsuario(user);
				}

			case 3:
				
						
				int cc;
				cc = carrito1.getCanticarrito();
				
				if (cc<=30)  {
				
					System.out.println("Seleccionar codigo de producto:");
					int prodSel = leer.nextInt();
					System.out.println("Seleccionar cantidad de producto:");
					Integer prodCantidad = leer.nextInt();
					ProductoCarrito productoCarrito = new ProductoCarrito();
					productoCarrito = producto1.listarUnProductoCarrito(prodSel,prodCantidad);
					
					cc = prodCantidad + carrito1.getCanticarrito();
														
					if (productoCarrito.getStock() > prodCantidad){
				
											
						if (cc<=30)  {
						  
						  carrito1.setCanticarrito(cc);
						  
						  carrito1.agregar(productoCarrito);
						  
						  carrito1.mostrar();
						
						} else {
							System.out.println("¡¡¡Lo siento!!! Sólo se permiten 30 artículos por compra.");
							carrito1.mostrar();
						}	
						
						
												
						miCuenta.menuUsuario(user);
					}
					else {
						System.out.println("No hay stock suficiente");
						miCuenta.menuUsuario(user);}
				
				}
				
				
			case 4:
				carrito1.mostrar();
				miCuenta.menuUsuario(user);

			case 5:
				 
				//  Para registrar en la tabla VENTAS //
				
				//  Obtengo el ID_CLIENTE en la variable clicli 
				try {
					String sql = "SELECT * FROM clientes WHERE email='"+ user.getEmail()+"';";
					acceso = connection.connect();
					stmt = acceso.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int id = rs.getInt("id");
						clicli = id;
					}
				} catch (SQLException e2) {	// TODO Auto-generated catch block
					System.out.println("Error al conectarse a la Base de Datos.");
					e2.printStackTrace();
				}
				
				// Obtengo la Fecha de Venta 		
				String fechaventa = new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
				
				// Obtengo el  Total de la venta
				double totventa = carrito1.getTotalcarrito();
				
				String sql_insertar =  "INSERT INTO ventas (id_ventas, fecha, id_cliente, total_venta) VALUES (null, '" + fechaventa + "'," + clicli + "," + totventa + ")";
				
				acceso = connection.connect();
     			
				try {
					stmt = acceso.createStatement();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
				stmt.executeUpdate(sql_insertar);
				System.out.println("Compra registrada.");
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				carrito1.graba_detalle();

				
				
				
				miCuenta.menuUsuario(user);

		}
	}


}