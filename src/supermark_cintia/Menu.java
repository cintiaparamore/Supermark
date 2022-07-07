package supermark_cintia;

import java.util.Scanner;

public class Menu {
	static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switch (menu()) {
			case 1:
				Login login=new Login();
				Cliente cliente=login.loguearme();
				
				if(cliente!=null) {
					System.out.println("**********Bienvenido a Supermark**********");
					
					switch (menuCliente()) {
					case 1:
						System.out.println("Usuario:"+cliente.getEmail());
					break;
					case 2:
						System.out.println("Historial");
					break;
					case 3:
						System.out.println("Productos");
					break;
					case 4:
						System.out.println("Carrito");
					break;
					default:
						System.out.println("Saliendo de supermark");
						
					}
					
					
				}
				else {
					
				}
			break;
			case 2:
				Registro registro=new Registro();
				
				registro.Registrarme();
				
			break;
		default:
			System.out.println("Usted esta saliendo de SuperMark...");
		}
		

	}
	
	public static int menu() {
		
		String rta;
		
		
		do{
			System.out.println("1. Iniciar sesion");
			System.out.println("2. Registrarme");
			System.out.println("0. Salir");
			System.out.print("Ingrese una opcion:");
			rta=leer.nextLine();
		
			if(rta.equalsIgnoreCase("0")==false && rta.equalsIgnoreCase("1")==false && rta.equalsIgnoreCase("2")==false) {
				System.out.println("Ingrese una opcion Valida...");
			}
			
		}while(rta.equalsIgnoreCase("0")==false && rta.equalsIgnoreCase("1")==false && rta.equalsIgnoreCase("2")==false);
		
		return Integer.parseInt(rta);
		
		
	}
	
	public static int menuCliente() {
		String rta;
		
		do{
			System.out.println("1. Ver Usuario");
			System.out.println("2. Ver Historial de Compras");
			System.out.println("3. Comprar");
			System.out.println("4. Ver Carrito");
			System.out.println("0. Salir");
			System.out.print("Ingrese una opcion:");
			rta=leer.nextLine();
		
			if(rta.equalsIgnoreCase("0")==false && rta.equalsIgnoreCase("1")==false && rta.equalsIgnoreCase("2")==false&& rta.equalsIgnoreCase("3")==false && rta.equalsIgnoreCase("4")==false) {
				System.out.println("Ingrese una opcion Valida...");
			}
			
		}while(rta.equalsIgnoreCase("0")==false && rta.equalsIgnoreCase("1")==false && rta.equalsIgnoreCase("2")==false && rta.equalsIgnoreCase("3")==false && rta.equalsIgnoreCase("4")==false);
		
		return Integer.parseInt(rta);
		
	}

}
