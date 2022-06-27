package modeloCin;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class crearCuenta extends Cliente{

	Statement stmt = null;
	ConexionBDD connection = new ConexionBDD();
	Connection acceso;
	
	private int id_crearCuenta;
	private String email;
	private String clave;
	private crearCuenta confirmacionClave;

	public crearCuenta(Integer id, String nombre, String apellido, String domicilio, String telefono, String localidad,
			int dni, int id_crearCuenta, String email, String clave, crearCuenta confirmacionClave) {
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

		
		public static void main(String[] args) {

	}
}