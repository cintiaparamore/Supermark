package supermark_cintia;

import java.util.Scanner;

public class RegistrarProducto {
	public boolean registar() {
		
		String[]campos= {"Nombre *:", "Marca *:", "Descripcion *:", "Precio *:", "Stock *:", "Categoria *:", "Costo *:"};
		String []datos = new String [7];
		Scanner leerScanner=new Scanner(System.in);
		
		System.out.println("Formulario de Registro de un Nuevo Producto");
		
		for(int i=0;i<campos.length; i++) {
			System.out.println(campos[i]);
			datos[i]=leerScanner.nextLine();
		}
		
		if() {
			
		}
		
	}

}
