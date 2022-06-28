package supermark_cintia;

import java.util.Scanner;

public class Loguin {
	public boolean loguearme() {
		
		String emailString;
		String claveString;
		
		Scanner leerScanner = new Scanner(System.in);
		
		System.out.println("**********Supermark**********");
		System.out.println("Iniciando Sesion");
		
		System.out.println("Email: ");
		emailString=leerScanner.nextLine();
		System.out.println("");
		
		System.out.println("Contraseña: ");
		claveString=leerScanner.nextLine();
		
		CrudConsultasBD crudbd = new CrudConsultasBD("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/supermarket", "root", "blackpink94");
		
		
		return false;
	}
	
	

}
