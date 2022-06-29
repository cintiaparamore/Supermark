package supermark_cintia;

public class Usuario {

	private String email;
	private String clave;


	public Usuario(String email, String clave) {
		
		this.email = email;
		this.clave = clave;
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
		return "insert into usuarios (email,clave) values ('" + this.email + "','" + this.clave+ "');";
	}
}
