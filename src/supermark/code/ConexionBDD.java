package supermark.code;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class ConexionBDD {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/bd_supermark";
	static final String USER = "root";
	static final String PASS = "blackpink94";

	private	Connection connection = null;
//	private	Statement stmt = null;
//	private ResultSet rs =null;
	
	
	public Connection connect(){
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
	
			connection = DriverManager.getConnection(DB_URL, USER, PASS);

			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Algun error al conectarse a la base de datos");
		}

//		System.out.println("******FIN******");
		return connection;

	}
}
