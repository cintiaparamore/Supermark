package modeloCin;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switch (menu()) {
		case 1: 
			System.out.println("Iniciando sesion");
		break;
		
		case 2:
			System.out.println("Registro");
		break;
	default:
	
	 System.out.println("Usted esta saliendo de Supermark");
			
		}
	}
	
	public static int menu() {
		
		int rta;
		Scanner leer = new Scanner (System.in);
		
		do {
		System.out.println("1. Iniciar Sesion");
		System.out.println("2. Registrarme");
		System.out.println("0. Salir");
		System.out.println("Ingrese una opcion: ");
		rta = leer.nextInt();
		
		if (rta<0 || rta>2) {
			System.out.println("Ingrese una opcion valida");
		}
		
	} while(rta<0 || rta>2);
		
		return rta;
		
	}
}
