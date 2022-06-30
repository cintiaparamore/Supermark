package supermark_cintia;

import java.util.Scanner;

public class Login {
	public boolean loguearme() {
		
		boolean rpta = true;
		String emailString;
		String claveString;
		String registro;
		
		Scanner leerScanner = new Scanner(System.in);
		
		System.out.println("**********Supermark**********");
		System.out.println("Iniciando Sesion");
		
		System.out.println("Email: ");
		emailString=leerScanner.nextLine();
		System.out.println("");
		
		System.out.println("Clave: ");
		claveString=leerScanner.nextLine();
		
		CrudConsultasBD crudbd = new CrudConsultasBD("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/bd_supermarket", "root", "blackpink94");
		if(crudbd.conectar()==false) {
			System.out.println("Error en la conexion");
		}else {
			registro = crudbd.select("select clave from usuarios where email="+emailString+"';");
			
			if(registro.equals("")) {
				System.out.println("El Usuario "+emailString+" no se encuentra registrado. Por favor vuelva al menu principal y seleccione **Registrarme**");
			}
			else {
				registro=registro.substring(0, registro.length()-1);
				System.out.println(registro);
				
				if(registro.equals(claveString)) {
					System.out.println("Bienvenido a Supermark");
					
				} else System.out.println("�Error! La clave no corresponde al usuario: "+emailString);
			}
			
		}
	
		return rpta;

	}
}