package supermark.code;

public class Usuario {

	private String email;
	private String clave;
	
	public Usuario(String email, String clave) {
		super();
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
	
	public void mostrar() {

		System.out.println("Email: " + this.email);
		System.out.println("Clave: " + this.clave);
	}
	
	public static void main(String arg[]) {	
		Usuario p1 = new Usuario("cintiaparamore", "qwertyasdfzxcvb25");
		p1.mostrar();

	}

}
