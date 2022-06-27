package supermark_cintia;
/*package supermark.bd;

	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class TestConexionBD { // 2° metodo para la consulta y extraccion del registro de la base de datos a java
		
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		// org.postgresql.Driver
		static final String DB_URL = "jdbc:mysql://localhost:3306/supermarket";
		// jdbc:postgresql://localhost:5432/supermarket
		// Credenciales de la BDD
		static final String USER = "root";
		static final String PASS = "";

		public static void main(String[] args) {
			Connection conn = null;
			Statement stmt = null;// Objeto para realizar las declaraciones SQL que requiramos
			// ResultSet rs = null;//Conjunto de resultados

			try {

				// Registrar el driver jdbc
				Class.forName(JDBC_DRIVER);
				// Abrir conexion
				System.out.println("Conectando a la base datos...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);// Me conecto a la base datos
				// Ejecutar consulta sql
				System.out.println("Creando sentencias SQL...");
				stmt = conn.createStatement();// Especificamos que crearemos una sentencia SQL sobre la conexion previamente
												// creada
				String sql; //="SELECT * FROM departamento"; rs = stmt.executeQuery(sql);//Ejecuto la consulta SELECT
			 // String sql2 = "INSERT INTO universidad.departamento (departamento.nombre) VALUE ('Agronomia')";
		     // stmt.executeUpdate(sql2);

				// Probar consultas
				
				sql = findALL(); // realizar una consulta de sql (base de datos)
				ResultSet rss = stmt.executeQuery(sql); // Para ejecutar esa consulta y guardar los registro de la bd sql en una variable de java

				while (rss.next()) {// Mientras exista un fila siguiente/Elementos en el conjunto
					int id = rss.getInt("id");
					String nombre = rss.getString("nombre");

					System.out.print("id:" + id);
					System.out.print(", nombre: " + nombre);
					System.out.println();

				}
				
				rss.close();

				// Extraer todos los datos

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					// rs.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Algun error al conectar");
				}

				System.out.println("******FIN******");
			}

		}

		private static String findALL() {
			
			sql = findALL();   // Tabla Productos
			ResultSet re =stmt.executeQuery(sql);
			// 5 extraer datos
			while (rs.next()) {
				int codigo = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				String marca = rs.getString("marca");
				String descripcion = rs.getString("descripcion");
				double precio = rs.getString("precio");
				int stock = rs.getInt("stock");
				int categoria = rs.getInt("categoria");
				
				
				
			}
			
			return "SELECT * FROM departamento";
		}
		
	}     */
