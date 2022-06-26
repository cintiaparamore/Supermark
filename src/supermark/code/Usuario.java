package supermark.code;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class Usuario extends crearCuenta{
	
	private crearCuenta email;
	private crearCuenta clave;

	public Usuario(Integer id, String nombre, String apellido, String domicilio, String telefono, String localidad,
			int dni, int id_crearCuenta, String email, String clave, crearCuenta confirmacionClave) {
		super(id, nombre, apellido, domicilio, telefono, localidad, dni, id_crearCuenta, email, clave, confirmacionClave);
	}
	
	
	public crearCuenta getEmail() {
		return email;
	}


	public void setEmail(crearCuenta email) {
		this.email = email;
	}


	public crearCuenta getClave() {
		return clave;
	}


	public void setClave(crearCuenta clave) {
		this.clave = clave;
	}


	public boolean login(){
		String email;
		String clave;
		System.out.println("Ingrese email");
		Scanner leer = new Scanner(System.in);
		email = leer.nextLine();
		System.out.println("Ingrese su clave");
		clave = leer.nextLine();
		Usuario user = new Usuario(email,clave);

		if (user.verificarUsuario(user)){
			return true;
		}
		else return false;
	/*
	 * public static void main(String arg[]) { Usuario p1 = new
	 * Usuario("cintiaparamore", "qwertyasdfzxcvb25"); p1.mostrar();
	 * 
	 * }
	 */
	}
}
