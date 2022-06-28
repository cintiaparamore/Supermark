package supermark_cintia;

import java.util.Scanner;


public class Registro {
	static Scanner leerScanner = new Scanner (System.in);
	public boolean Registrarme() {
		boolean rpta=true;
		
		String nombreString;
		String apellidoString;
		Long dniLong;
	    String domicilioString;
		String telefonoString;
		String localidadString;
		
		String emailString;
		String claveString;
		String confirmacionClaveString;
		
		Scanner leerScanner = new Scanner (System.in);
		
		System.out.println("**********Formulario de Registro**********");
		System.out.println("Campos Obligatorios**");
		
		System.out.println("Nombre *:");
		nombreString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("Apellido *:");
		apellidoString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("DNI *:");
		dniLong = leerScanner.nextLong();	
		System.out.println();
		
		System.out.println("Domicilio *:");
		domicilioString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("Telefono *:");
		telefonoString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("Localidad *:");
		localidadString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("Email: *:");
		emailString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("Clave *:");
		claveString = leerScanner.nextLine();	
		System.out.println();
		
		System.out.println("Confirmacion Clave: *:");
		confirmacionClaveString = leerScanner.nextLine();	
		System.out.println();
	
		if(validacionDeCampos(nombreString, apellidoString, dniLong, domicilioString, telefonoString, localidadString, emailString, claveString, confirmacionClaveString)) {
			
			CrudConsultasBD crudbd = new CrudConsultasBD("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/supermarket", "root", "blackpink94");
			if (crudbd.conectar()) {
				String resultadoString = crudbd.select("select email from usuarios where email="+emailString);
				if(resultadoString.equalsIgnoreCase("")) {
					Cliente nuevoCliente = new Cliente();
					crearCuenta crearcuenta = new crearCuenta();
					Usuario usuario = new Usuario();
					
					
					if(crudbd.insert(nuevoCliente.crearQueryInsert())) {
						
						crudbd.insert(crearcuenta.crearQueryInsert());{
							System.out.println("¡Creacion de cuenta Exitosa!");
						}
						crudbd.insert(usuario.crearQueryInsert());{
							System.out.println("¡Usuario Registrado!");
						}
						
						
						System.out.println("¡Enhorabuena!. Ya eres parte de la familia Supermark.");
						System.out.println("Ingrese nuevamente con su email");
						crudbd.cerrar();
						
					}
					
					else System.out.println("Error al registrarse. Por favor vuelva intentar mas tarde.");
				}
				else System.out.println("El email ingresado ya se encuentra REGISTRADO.");
			}
			else System.out.println("Error en la conexion.");
		}
		return rpta;
	}
	//VALIDAR CAMPOS
	
	private boolean validacionDeCampos(String nombreString,String apellidoString,Long dniLong,String domicilioString,String telefonoString,String localidadString,String emailString,String claveString,String confirmacionClaveString) {
		boolean rpta=true;
		
		if(nombreString.equalsIgnoreCase("")) {
			rpta=false;
			return rpta;
		}
		return true;

	}
}
