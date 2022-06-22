package supermark.code;

import org.mariadb.jdbc.Connection;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu.bienvenida();
    }

    public static void bienvenida() {
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
               if (Registro.registrarDatos() == true){
                   bienvenida();
               }
               else bienvenida();
            } else System.out.println("Que tenga buen dia");
        } else login();
    }

    public static void login(){
        String email;
        String clave;
        String clavedb;

        System.out.println("Ingrese email");
        Scanner leer = new Scanner(System.in);
        email = leer.nextLine();
        System.out.println("Ingrese su clave");
        clave = leer.nextLine();


        ResultSet rs;
        Statement stmt;
        Connection conn = TestDatabase.ConnectDB() ;
        try{
            String query ="SELECT clave from Clientes WHERE email ='"+email+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        }catch(HeadlessException | SQLException e){
        }
    }
}