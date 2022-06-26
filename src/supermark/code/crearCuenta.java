package supermark.code;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class crearCuenta extends Cliente{

		private int id_crearCuenta;
		private String email;
		private String clave;
		private crearCuenta confirmacionClave;

		public crearCuenta(Integer id, String nombre, String apellido, String domicilio, String telefono,
				String localidad, int dni, int id_crearCuenta, String email, String clave, crearCuenta confirmacionClave) {
			super(id, nombre, apellido, domicilio, telefono, localidad, dni);
			
			this.id_crearCuenta = id_crearCuenta;
			this.email = email;
			this.clave = clave;
			this.confirmacionClave = confirmacionClave;
		}

		public int getId_crearCuenta() {
			return id_crearCuenta;
		}

		public void setId_crearCuenta(int id_crearCuenta) {
			this.id_crearCuenta = id_crearCuenta;
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

		public crearCuenta getConfirmacionClave() {
			return confirmacionClave;
		}

		public void setConfirmacionClave(crearCuenta confirmacionClave) {
			this.confirmacionClave = confirmacionClave;
		}

		@Override
		public String toString() {
			return "CrearCuenta [id_crearCuenta=" + id_crearCuenta + ", clave=" + clave
					+ ", confirmacionClave=" + confirmacionClave + ", email=" + email + "]";
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
			crearCuenta email = user.getEmail();
			crearCuenta clave = user.getClave();
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
		
		public static void main(String[] args) {

	}
}