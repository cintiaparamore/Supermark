package supermark.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBDD {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/bd_supermarket";
	static final String USER = "root";
	static final String PASS = "";

	private	Connection connection = null;
	private	Statement stmt = null;
	private ResultSet rs =null;
	
	
	public Connection connect(){
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// System.out.println("Conectándose a la Base de Datos...");
			connection = DriverManager.getConnection(DB_URL, USER, PASS);

			/*
			 * System.out.println("Creando sentencias SQL..."); stmt =
			 * connection.createStatement(); String sql;
			 * 
			 * sql = findALL(); // realizar una consulta de sql (base de datos) ResultSet rs
			 * = stmt.executeQuery(sql); // Para ejecutar esa consulta y guardar los
			 * registro de la bd sql en una variable
			 * 
			 * while (rs.next()) {// Mientras exista un fila siguiente/Elementos en el
			 * conjunto int codigo = rs.getInt("ID"); String nombre =
			 * rs.getString("Nombre"); String marca = rs.getString("Marca"); String
			 * descripcion = rs.getString("Descripcion"); Double precio =
			 * rs.getDouble("Precio"); int stock = rs.getInt("Cantidad");
			 * 
			 * } rs.close();
			 * 
			 * // Extraer todos los datos
			 * 
			 * } catch (SQLException e) { e.printStackTrace(); } finally { try {
			 * 
			 * stmt.close(); connection.close();
			 */
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Algun error al conectarse a la base de datos");
		}

		System.out.println("******FIN******");
		return connection;

		/*
		 * } private String findALL() { // TODO Auto-generated method stub return
		 * "SELECT * FROM `productos`"; }
		 */
	}
}
