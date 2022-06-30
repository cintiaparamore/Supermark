package supermark_cintia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudConsultasBD {
	
	private String JDBC_DRIVER;
	private String DB_URL;
	private String USER;
	private String PASS;
	
	private Connection connection;
	private Statement stmt;
	private ResultSet rs;
	
	public CrudConsultasBD(String jDBC_DRIVER, String dB_URL, String uSER, String pASS) {
		super();
		JDBC_DRIVER = jDBC_DRIVER;
		DB_URL = dB_URL;
		USER = uSER;
		PASS = pASS;
		
		this.connection=null;
		this.stmt=null;
		this.rs=null;
	}
	
	public boolean conectar() {
		boolean rpta=true;
		
		try {
			Class.forName(this.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			rpta=false;
		}
		
		try {
			connection=DriverManager.getConnection(DB_URL,USER,PASS);
			this.stmt=this.connection.createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			rpta=false;
		
		}
		
		return rpta;
	}
	
	public boolean insert(String query) {
		boolean rpta=true;
		
		try {
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			rpta=false;
		}
		
		return rpta;
		
	}
	
	public String select(String query) {
		
		String string="";
		ResultSetMetaData rsmd;
		
		try {
			this.rs = this.stmt.executeQuery(query);
			// string=rs.getCursorName();
			rsmd = this.rs.getMetaData();

			while (rs.next()) { // Registros

				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					
				//	System.out.println("Tipo:" + rsmd.getColumnType(i));

					switch (rsmd.getColumnType(i)) {
					case 12: // VARCHAR
						string = string + this.rs.getString(i);
						break;
					case 4: // INTEGER
						string = string + this.rs.getInt(i);
						break;
					case 93: // DATE
						string = string + this.rs.getDate(i).toString();
						break;
					default: // Por defecto.....
					//	System.out.println("Tipo:" + rsmd.getColumnType(i));
					}
					if (i > rsmd.getColumnCount()) {
						string = string + ";";
					}

				}
				string = string + ";";
			}

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			string="";
		}
		
		return string;
	}
	
	public boolean update(String query) {
		boolean rpta=true;
		
		try {
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			rpta=false;
		}
		
		return rpta;
		
	}
	
	public boolean delete(String query) {
		boolean rpta=true;
		
		try {
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			rpta=false;
		}
		
		return rpta;
		
	}

	public boolean cerrar() {
		boolean rpta=true;
		try {
			if(this.stmt!=null) {
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			rpta=false;
		}
		
			try {
				if(this.connection!=null) {
				connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				rpta=false;
			}

			
				try {
					if(this.rs!=null) {
						this.rs.close();
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					rpta=false;
				}
			
		return rpta;
	}
	
	public String getJDBC_DRIVER() {
		return JDBC_DRIVER;
	}

	public void setJDBC_DRIVER(String jDBC_DRIVER) {
		JDBC_DRIVER = jDBC_DRIVER;
	}

	public String getDB_URL() {
		return DB_URL;
	}

	public void setDB_URL(String dB_URL) {
		DB_URL = dB_URL;
	}

	public String getUSER() {
		return USER;
	}

	public void setUSER(String uSER) {
		USER = uSER;
	}

	public String getPASS() {
		return PASS;
	}

	public void setPASS(String pASS) {
		PASS = pASS;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

}
