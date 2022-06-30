package supermark_cintia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Producto {

	Statement stmt = null;

//	ConexionBDD connection = new ConexionBDD();
	Connection acceso;

	private int id;
	private String nombre;
	private String marca;
	private String descripcion;
	private Double precio;
	private Integer stock;
	private String categoria;

	public Producto(int id, String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria) {
		
		super();
		this.id = id;
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

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
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
		System.out.println("Precio: " + this.precio);
		System.out.println("Stock: " + this.stock);
		System.out.println("Categoria: " + this.categoria);
	}

	public void agregarProducto(String nombre, String marca, String descripcion, Double precio, int stock,
			int categoria) {

//		acceso = connection.connect();

		try {
			stmt = acceso.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql_insertar = "INSERT INTO productos \r\n" + "VALUES \r\n" + "(null,'" + nombre + "','" + marca + "','"
				+ descripcion + "'," + precio + "," + stock + "," + categoria + ")\r\n" + ";";

		try {
			stmt = acceso.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ResultSet rs= stmt.executeQuery(sql);

		try {
			stmt.executeUpdate(sql_insertar);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Producto agregado.");

	}

	public void modificarNombreProducto(int codmodi, String nommodi) {

		String sql_modi = "UPDATE productos SET nombre ='" + nommodi + "' WHERE codigo = " + codmodi;

		try {
			stmt.executeUpdate(sql_modi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Producto " + codmodi + " modificado.");

	}

	public void modificarPrecioProducto(int codmodi, Double preciomodi) {

		String sql_modi = "UPDATE productos SET precio =" + preciomodi + " WHERE codigo = " + codmodi;

		try {
			stmt.executeUpdate(sql_modi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Producto " + codmodi + " modificado.");

	}

	public void eliminarProducto(int codeli) {

		String sql_modi = "DELETE FROM productos WHERE codigo =" + codeli;

		try {
			stmt.executeUpdate(sql_modi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Producto " + codeli + " eliminado.");

	}

	public void listarProductos() {

		System.out.println("LISTADO DE PRODUCTOS");

		try {

			String sql = "Select * from productos";

//			acceso = connection.connect();
			stmt = acceso.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			int c = 0;

			while (rs.next()) {
				
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String marca = rs.getString("marca");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");

				System.out.print("ID: " + id + " | ");
				System.out.print("Nombre: " + nombre + " | ");
				System.out.print("Marca: " + marca + " | ");
				System.out.print("Descripcion: " + descripcion + " | ");
				System.out.println("Precio: " + precio);
				c++;
			}

			System.out.println("Cantidad de Productos: " + c);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al conectarse a la Base de Datos.");
			e.printStackTrace();
		}
	}

	public void listarUnProducto(int codigoBuscado) {

		System.out.println("------- PRODUCTO SELECCIONADO -------");

		String sql = "SELECT * FROM productos WHERE codigo=" + codigoBuscado;

//		acceso = connection.connect();
		try {
			stmt = acceso.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ResultSet rs;

			rs = stmt.executeQuery(sql);
			rs.next();
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String marca = rs.getString("marca");
			String descripcion = rs.getString("descripcion");
			Double precio = rs.getDouble("precio");

			System.out.print("ID: " + id + " | ");
			System.out.print("Nombre: " + nombre + " | ");
			System.out.print("Marca: " + marca + " | ");
			System.out.print("Descripcion: " + descripcion + " | ");
			System.out.println("Precio: " + precio);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
