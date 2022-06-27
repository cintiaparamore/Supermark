package supermark_cintia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class Cliente {
	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;

	private Integer id;
	private String nombre;
	private String apellido;
    private String domicilio;
	private String telefono;
	private String localidad;
	private Long dni;
//	private String email;

	public Cliente(Integer id, String nombre, String apellido, String domicilio, String telefono, String localidad,
			int dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.localidad = localidad;
		this.dni = (long) dni;
//		this.email = email;
	}

	public Cliente() {
		super();
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public Long getDni() {
		return dni;
	}


	public void setDni(Long dni) {
		this.dni = dni;
	}


//	public String getEmail() {
//		return email;
//	}


//	public void setEmail(String email) {
//		this.email = email;
//	}


	public void mostrar() {
		
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("Localidad: "+this.localidad);
		System.out.println("DNI: " + this.dni);
//		System.out.println("Email: "+this.email);
		
	}

	public void registrarCliente(){
		
		Scanner reg = new Scanner(System.in);
		System.out.println("Ingresar Nombre");
		nombre = reg.nextLine();
		System.out.println("Ingrese Apellido");
		apellido = reg.nextLine();
		System.out.println("Ingrese DNI");
		dni = reg.nextLong();
		System.out.println("Ingrese Telefono");
		reg.nextLine();
		telefono = reg.nextLine();
		System.out.println("Ingrese Localidad");
		localidad = reg.nextLine();
		System.out.println("Ingrese Domicilio");
		domicilio = reg.nextLine();
//		System.out.println("Ingrese Email");
//		email = reg.nextLine();
		String sql = "insert into clientes values (null, '"+nombre+"', '"+apellido+"', '"+domicilio+"', '"+telefono+"', '"+localidad+"', '"+dni+"')";
		acceso = connection.connect();
		
		try {
			stmt = acceso.createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/*
	 * public static void main(String arg[]) { Cliente p1 = new Cliente(1, "Cintia",
	 * "Paramore", "Caseros 1685", "4230309", "Salta, Capital", 40985456,
	 * "cintiaparamore@gmail.com"); p1.mostrar();
	 * 
	 * }
	 */
}
