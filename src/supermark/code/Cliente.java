package supermark.code;

public class Cliente {

	private Integer id;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;
	private String localidad;
	private Long dni;

	public Cliente(Integer id, String nombre, String apellido, String domicilio, String telefono, String localidad,
			Long dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.localidad = localidad;
		this.dni = dni;
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public void mostrar() {

		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("ID: " + this.id);
		System.out.println("DNI: " + this.dni);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("Localidad: "+this.localidad);
		System.out.println("Telefono: " + this.telefono);
		
	}

}
