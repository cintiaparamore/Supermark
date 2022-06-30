package supermark_cintia;

import java.util.Scanner;

public class Menu {
	static Scanner leerScanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("**********¡Bienvenido a Supermark!**********");
		System.out.println("");
		System.out.println("Por favor ingrese una opcion: *");
		System.out.println("_______________________________");
		System.out.println("");

		switch (menu()) {
		case 1:
			Login login = new Login();
			login.loguearme();
			break;

		case 2:
			Registro registro = new Registro();
			registro.Registrarme();

			break;
		default:

			System.out.println("Usted esta saliendo de Supermark");
			System.out.println("Que tenga buen dia. ¡Saludos!");

		}
	}

	public static int menu() {

		int rpta;
		Scanner leer= new Scanner(System.in);

		do {
			
			System.out.println("1. Iniciar Sesion *");
			System.out.println("2. Registrarme *");
			System.out.println("0. Salir *");
			System.out.println("_______________________________");
			System.out.println("");

			rpta = leer.nextInt();

			if (rpta < 0 || rpta > 2) {
				System.out.println("Ingrese una opcion valida");
			}

		} while (rpta < 0 || rpta > 2);

		return rpta;

	}
}
