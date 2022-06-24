package supermark.code;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {
	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;

	private String email;
	private String clave;
	
	public Usuario(String email, String clave) {
		super();
		this.email = email;
		this.clave = clave;
	}

	public Usuario(){
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void mostrar() {

		System.out.println("Email: " + this.email);
		System.out.println("Clave: " + this.clave);
	}

	public boolean registrarUsuario()  {
		ResultSet rs;
		Scanner reg = new Scanner(System.in);
		System.out.println("Ingrese email");
		email = reg.nextLine();
		System.out.println("Ingrese clave");
		clave = reg.nextLine();
		String sql = "SELECT * from usuario WHERE email ='"+email+"'";
		acceso = connection.connect();

		try {
			stmt = acceso.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next() == false){
				String sql2 = "insert into usuario (email, clave) values ('"+email+"', '"+clave+"')";
				stmt = acceso.createStatement();
				stmt.executeUpdate(sql2);
				System.out.println("Email registrado");
				return true;
			}
			else {
				System.out.println("El email ya esta registrado");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean verificarUsuario(Usuario user){
		String email = user.getEmail();
		String clave = user.getClave();
		acceso = connection.connect();
		ResultSet rs;
		String clavedb="0";
		
		try{
			
			String query ="SELECT clave from usuario WHERE email ='"+email+"'";
			stmt = acceso.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()){
				clavedb = rs.getString("clave");
			}
			if (Objects.equals(clavedb, clave)){
				System.out.println("Login correcto");
				return true;
			}
			else {System.out.println("Error en email o contrase;a"); return false;}

		}catch(HeadlessException | SQLException e){
		}
		return false;
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
