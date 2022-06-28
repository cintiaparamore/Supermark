package supermark_cintia;

import java.util.Scanner;

/*import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;*/

public class Menu {
	static Scanner leerScanner = new Scanner (System.in);
    public static void main(String[] args)  {
  
        System.out.println("**********¡Bienvenido a Supermark!**********");
        System.out.println("Por favor ingrese una opcion: ");
    		
    		switch (menu()) {
    		case 1: 
    			System.out.println("Iniciando sesion");
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
    		Scanner leer = new Scanner (System.in);
    		
    		do {
    		System.out.println("1. Iniciar Sesion");
    		System.out.println("2. Registrarme");
    		System.out.println("0. Salir");
    		
    		rpta = leer.nextInt();
    		
    		if (rpta<0 || rpta>2) {
    			System.out.println("Ingrese una opcion valida");
    		}
    		
    	} while(rpta<0 || rpta>2);
    		
    		return rpta;
    		
    	}
 /*   public static void bienvenida() {
        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        System.out.println("Bienvenido a Supermark");
        System.out.println("Esta registrado?");
        System.out.println("1. Si");
        System.out.println("2. No");
        Scanner leer = new Scanner(System.in);
        if (leer.nextInt() == 2) {
            System.out.println("Te gustaria registrarte?");
            System.out.println("1. Si");
            System.out.println("2. No");
            if (leer.nextInt() == 1) {
               if (usuario.registrarUsuario() == true){
                   cliente.registrarCliente();
                   System.out.println("Regresando al inicio");
                   bienvenida();
               }
               else bienvenida();
            } else System.out.println("Que tenga buen dia");
        } else if (usuario.login()){
            AdminProductos.main(null);
        } 
    } */
}
