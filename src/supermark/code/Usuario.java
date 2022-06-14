package supermark.code;

public class Usuario {

	private Integer id;
	private String nombre;
	private String domicilio;
	private Long dni;

	public usuario(Integer id, String nombre, String domicilio,Long dni) {

		this.id = id;
		this.nombre = nombre;
		this.domicilio = domicilio;
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

	public void mostrar() {
		
		System.out.println("Nombre: " + this.nombre);
		System.out.println("ID: " + this.id);
		System.out.println("Domicilio: " + this.domicilio);
		System.out.println("DNI: "+this.dni);
	}

}
