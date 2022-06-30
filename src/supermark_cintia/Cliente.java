package supermark_cintia;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dni;
    private String domicilio;
	private String telefono;
	private String celular;
	private String localidad;
	


	public Cliente(String nombre, String apellido, String dni, String domicilio, String telefono, String celular, String localidad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.celular = celular;
		this.localidad = localidad;
	
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


	public String crearQueryInsert() {
		return "insert into clientes (fecha,nombre,apellido,dni,domicilio,telefono,celular,localidad) values (Now(),'"+this.nombre+"','"+this.apellido+"','"+this.dni+"','"+this.domicilio+"','"+this.telefono+"','"+this.celular+"','"+this.localidad+"');";
	}


//	public void mostrar() {
		
//		System.out.println("ID: " + this.id);
//		System.out.println("Nombre: " + this.nombre);
//		System.out.println("Apellido: " + this.apellido);
//		System.out.println("Domicilio: " + this.domicilio);
//		System.out.println("Telefono: " + this.telefono);
//		System.out.println("Localidad: "+this.localidad);
//		System.out.println("DNI: " + this.dni);
		
//	}

}
