package supermark_cintia;

public class Usuario extends crearCuenta {

	private String email;
	private String clave;

	public Usuario(Integer id, String nombre, String apellido, String domicilio, String telefono, String localidad,
			int dni, int id_crearCuenta, String email, String clave, String confirmacionClave) {
		super(id, nombre, apellido, domicilio, telefono, localidad, dni, id_crearCuenta, email, clave,
				confirmacionClave);

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String crearQueryInsert() {
		return "insert into usuarios (email,clave,confirmClave) values ('" + this.email + "','" + this.clave
				+ "');";
	}
}
