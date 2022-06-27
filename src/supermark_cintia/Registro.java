package supermark_cintia;

import java.util.Scanner;

public class Registro {
	
	public boolean Registrarme() {
		boolean rta=true;
		
		String nombreString;
		String apellidoString;
	    String domicilioString;
		String telefonoString;
		String localidadString;
		Long dniLong;
		
		Scanner leerScanner = new Scanner (System.in);
		
		System.out.println("Formulario de Registro");
		System.out.println("*Campos Obligatorios*");
		
		System.out.println("Nombre *:");
		nombreString = leerScanner.nextLine();	
		System.out.println();
		return rta;
		
	
	}

}
