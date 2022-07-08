package supermark.code;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Menu {
	
    public static void main(String[] args)  {
        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        Menu.bienvenida();
    }
    public static void bienvenida() {
        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        
        System.out.println("***************Bienvenido a Supermark***************");
        System.out.println("");
		System.out.println("Por favor ingrese una opcion: *");
		System.out.println("_______________________________");
		System.out.println("");
        System.out.println("¿Esta registrado?");
        System.out.println("1. Si");
        System.out.println("2. No");
		System.out.println("_______________________________");
		
        Scanner leer = new Scanner(System.in);
        if (leer.nextInt() == 2) {
        	
    		System.out.println("_______________________________");
    		System.out.println("");
            System.out.println("Te gustaria registrarte?");
            System.out.println("1. Si");
            System.out.println("2. No");
    		System.out.println("_______________________________");
    		
            if (leer.nextInt() == 1) {
               if (usuario.registrarUsuario() == true){
                   cliente.registrarCliente();
                   System.out.println("Regresando al inicio");
                   bienvenida();
               }
               else bienvenida();
            } else System.out.println("Que tenga buen dia");
        } else login(usuario);
        }



    public static void login(Usuario usuario){

        if (usuario.login() == 2){
            AdminProductos.main(null);
        }
        else System.out.println("carrito");
    }
}