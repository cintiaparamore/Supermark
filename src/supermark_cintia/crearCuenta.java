package supermark_cintia;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class crearCuenta{
	
	static Scanner leerScanner = new Scanner (System.in);

	private String email;
	private String clave;
	private String confirmacionClave;


	public crearCuenta( String email, String clave, String confirmacionClave) {
		
		this.email = email;
		this.clave = clave;
		this.confirmacionClave = confirmacionClave;
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

	public String getConfirmacionClave() {
		return confirmacionClave;
	}

	public void setConfirmacionClave(String confirmacionClave) {
		this.confirmacionClave = confirmacionClave;
	}

//	@Override
//	public String toString() {
//		return "CrearCuenta [id_crearCuenta=" + id_crearCuenta + ", clave=" + clave + ", confirmacionClave="
//				+ confirmacionClave + ", email=" + email + "]";
//	}

/*	public static void verificacion(String[] args) {
		Scanner leer = new Scanner(System.in);
		String email;
		String clave;

		System.out.print("Ingrese email: ");
		email = leer.nextLine();
		System.out.println("Ingrese contraseña: ");
		clave = leer.nextLine();

		Pattern patEmail = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matEmail = patEmail.matcher(email);

		Pattern patClave = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
		Matcher matClave = patClave.matcher(clave);

		if (matEmail.find() && matClave.find()) {
			System.out.println("Correo Válido");
			System.out.println("Contraseña Válida");
		} else {
			System.out.println("Correo No Válido");
			System.out.println("Contraseña No Válida");
		}
	}*/

}