package supermark.code;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Menu {
	// ALUMNNOS: CARRASCO, CINTIA - PALAVECINO, CECILIA - ZELAYA, LUIS - ZARATE,JOHANNA
	// PROF. ZURITA NATALIA - CURSO: CT3 - GRUPO : G01 - COMISION: TARDE
	// 1000 PROGRAMADORES SALTE?OS - INTRODUCCION A LA PROGRAMACION EN JAVA 2022
	public static void main(String[] args) {
		Menu.bienvenida();
	}

	public static void bienvenida() {
		Usuario usuario = new Usuario();
		Cliente cliente = new Cliente();

		System.out.println("__________________________________________");
		System.out.println();
		System.out.println("          Bienvenido a Supermark          ");
		System.out.println("__________________________________________");
		System.out.println();
		System.out.println("Por favor ingrese una opcion: *");
		System.out.println("_______________________________");
		System.out.println();
		System.out.println("?Esta registrado?");
		System.out.println("1. Si");
		System.out.println("2. No");
		System.out.println("_______________________________");

		Scanner leer = new Scanner(System.in);
		switch (leer.nextInt()) {
		case 2:
			System.out.println("_______________________________");
			System.out.println("");
			System.out.println("Te gustaria registrarte?");
			System.out.println("1. Si");
			System.out.println("2. No");
			System.out.println("_______________________________");
			if (leer.nextInt() == 1) {
				if (usuario.registrarUsuario() == true) {
					cliente.registrarCliente();
					System.out.println("Regresando al inicio");
					bienvenida();
				} else
					bienvenida();
			} else
				System.out.println("Que tenga buen dia");
			break;
		case 1:
			usuario.login();
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			bienvenida();
			break;
		}
		/*
		 * if (leer.nextInt() == 2) {
		 * 
		 * System.out.println("_______________________________");
		 * System.out.println(""); System.out.println("Te gustaria registrarte?");
		 * System.out.println("1. Si"); System.out.println("2. No");
		 * System.out.println("_______________________________");
		 * 
		 * if (leer.nextInt() == 1) { if (usuario.registrarUsuario() == true){
		 * cliente.registrarCliente(); System.out.println("Regresando al inicio");
		 * bienvenida(); } else bienvenida(); } else
		 * System.out.println("Que tenga buen dia"); } else usuario.login();
		 */
	}

}