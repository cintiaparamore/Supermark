package supermark.code;

import org.mariadb.jdbc.Connection;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Registro {

    public static boolean registrarDatos() {

        String email;
        String clave;
        String nombre;
        String apellido;
        int dni;
        String telefono;
        String localidad;
        String domicilio;


        Scanner reg = new Scanner(System.in);

        System.out.println("Creando datos de Ingreso");

        System.out.println("Ingresar Correo");
        email = reg.nextLine();
        System.out.println("Ingresar clave");
        clave = reg.nextLine();

        System.out.println("Creando Datos de ingreso");

        System.out.println("Ingresar Nombre");
        nombre = reg.nextLine();
        System.out.println("Ingrese Apellido");
        apellido = reg.nextLine();
        System.out.println("Ingrese DNI");
        dni = reg.nextInt();
        System.out.println("Ingrese Telefono");
        reg.nextLine();
        telefono = reg.nextLine();
        System.out.println("Ingrese Localidad");
        localidad = reg.nextLine();
        System.out.println("Ingrese Domicilio");
        domicilio = reg.nextLine();


        ResultSet rs;
        Statement stmt;
        Connection conn = TestDatabase.ConnectDB() ;
        try{
            String query ="SELECT * from Clientes WHERE email ='"+email+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next() == false){
                String query2 = "insert into Clientes values (null, '"+nombre+"', '"+apellido+"', '"+domicilio+"', '"+telefono+"', '"+localidad+"', '"+dni+"', '"+email+"', '"+clave+"')";
                rs = stmt.executeQuery(query2);
                System.out.println("Registro completo");
                return true;

            }
            else {
                System.out.println("El email ya esta registrado");
                return false;}
        }catch(HeadlessException | SQLException e){
        };
        return false;
    }
}
