package modeloCin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
		boolean rta=true;
		
		try {
			Class.forName(this.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection=DriverManager.getConnection(DB_URL,USER,PASS);
			this.stmt=this.connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			rta=false;
		}
		
		return rta;
	}
	
	public String select(String query) {
		
		String string="";
		
		try {
			this.rs=this.stmt.executeQuery(query);
			string=rs.getCursorName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			string="";
		}
		
		return string;
	}
	
	public boolean insert(String query) {
		boolean rta=true;
		
		try {
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			rta=false;
		}
		
		return rta;
		
	}

	public boolean cerrar() {
		boolean rta=true;
		try {
			if(this.stmt!=null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			rta=false;
		}
		
			try {
				if(this.connection!=null) {
				connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				rta=false;
			}

			
				try {
					if(this.rs!=null) {
						this.rs.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					rta=false;
				}
			
		
		return rta;
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
