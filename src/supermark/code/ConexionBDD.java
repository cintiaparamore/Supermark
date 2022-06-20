package supermark.code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDD {

	
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/supermarket";
	static final String USER="root";
	static final String PASS="123456789";
			
	public Connection Conectar() {
			
		Connection connection = null;
		//Statement stmt = null;
			
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		    e.printStackTrace();}
			
			
		try {
			//System.out.println("Conectándose a la Base de Datos...");
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
	    } catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("Error al conectarse a la Base de Datos.");
			e1.printStackTrace();}
			
	return connection;
	}
	
}
