package supermark.code;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

	public static void menuUsuario(Usuario user){
		Producto producto1 = new Producto();
		Producto produ = new Producto();
		Statement stmt = null;
		ConexionBDD connection = new ConexionBDD();
		Connection acceso;
		Scanner leer = new Scanner(System.in);

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

					int c = 0;

					while (rs.next()) {

						int id = rs.getInt("id");
						String nombre = rs.getString("nombre");
						String apellido = rs.getString("apellido");
						int dni = rs.getInt("dni");
						String domicilio = rs.getString("domicilio");
						String telefono = rs.getString("telefono");
						String celular = rs.getString("celular");
						String localidad = rs.getString("localidad");
						String email = rs.getString("email");


						System.out.println("ID cliente: " + id + " | ");
						System.out.println("Nombre: " + nombre + " | ");
						System.out.println("Apellido: " + apellido + " | ");
						System.out.println("DNI: " + dni + " | ");
						System.out.println("Domicilio: " + domicilio + " | ");
						System.out.println("Telefono: " + telefono+ " | ");
						System.out.println("Celular: " + celular+ " | ");
						System.out.println("Localidad: " + localidad+ " | ");
						System.out.println("Email: " + email+ " | ");

						c++;
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
				System.out.println("Seleccionar codigo de producto");
				int prodSel = leer.nextInt();
				System.out.println("selecionar cantidad de producto");
				Integer prodCantidad = leer.nextInt();
				ProductoCarrito productoCarrito = new ProductoCarrito();
				productoCarrito = producto1.listarUnProductoCarrito(prodSel,prodCantidad);
				if (productoCarrito.getStock() > prodCantidad ){
					carrito1.agregar(productoCarrito);

					miCuenta.menuUsuario(user);
				}
				else {
					System.out.println("No hay stock suficiente");
					miCuenta.menuUsuario(user);}

			case 4:
				carrito1.mostrar();
				miCuenta.menuUsuario(user);

			case 5:
				System.out.println("confirmar compra(pendiente)");
				miCuenta.menuUsuario(user);

		}
	}


}