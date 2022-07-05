package supermark.code;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Cliente {
	
	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;
	
	private String nombre;
	private String apellido;
	private String dni;
    private String domicilio;
	private String telefono;
	private String celular;
	private String localidad;
	private String email;

	public Cliente(String nombre, String apellido, String dni, String domicilio, String telefono, String celular,
			String localidad, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.celular = celular;
		this.localidad = localidad;
		this.email = email;
	}
	public Cliente() {
		super();
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
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
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
	
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostrar() {
		
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("DNI: "+ this.dni);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("Celular: "+ this.celular);
		System.out.println("Localidad: "+this.localidad);
		System.out.println("Email: "+this.email);
		
	}

	public void registrarCliente(){
		
		Scanner reg = new Scanner(System.in);
		
		System.out.println("Ingresar Nombre: ");
		nombre = reg.nextLine();
		
		System.out.println("Ingrese Apellido: ");
		apellido = reg.nextLine();
		
		System.out.println("Ingrese DNI: ");
		dni = reg.nextLine();
		
		System.out.println("Ingrese Domicilio: ");
		domicilio = reg.nextLine();
		
		System.out.println("Ingrese Telefono: ");
		telefono =reg.nextLine();
		
		System.out.println("Ingrese Celular: ");
		celular = reg.nextLine();
		
		System.out.println("Ingrese Localidad: ");
		localidad = reg.nextLine();
		
		System.out.println("Ingrese Email: ");
		email = reg.nextLine();
		
		String sql = "insert into clientes values (id,'"+nombre+"','"+apellido+"','"+dni+"','"+domicilio+"','"+telefono+"','"+celular+"','"+localidad+"','"+email+"')";
		acceso = connection.connect();
		
		try {
			stmt = acceso.createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e1) {
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
