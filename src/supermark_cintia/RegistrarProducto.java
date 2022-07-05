package supermark_cintia;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarProducto {
	public boolean registrar() {
		
		String[]campos= {"ID","Nombre *:", "Marca *:", "Descripcion *:", "Precio *:", "Stock *:", "Categoria *:", "Costo *:"};
		String []datos = new String [7];
		Scanner leerScanner=new Scanner(System.in);
		
		System.out.println("Formulario de Registro de un Nuevo Producto");
		
		for(int i=0;i<campos.length; i++) {
			System.out.println(campos[i]);
			datos[i]=leerScanner.nextLine();
		}
		
		ProductoStock nuevoProductoStock=new ProductoStock(Integer.parseInt(datos[0]),datos[1],datos[2],datos[3],Double.parseDouble(datos[4]),Integer.parseInt(datos[5]),datos[6],Double.parseDouble(datos[8]));
		CrudConsultasBD crudbd=new CrudConsultasBD("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/bd_supermarket" ,"root","blackpink94");
		
		if(crudbd.conectar()) {
			
			String string=crudbd.select("select codigo,nombre,marca,descripcion,precio,stock,categoria from productos;");
			
			String [] registros=string.split(";");
			ArrayList< Producto> productoStocks=new ArrayList<Producto>();
			
			for(int i=0;i<registros.length;i++) {
				String [] registro=registros[i].split(",");
				productoStocks.add(new Producto());
			
			}
			
			int i=0;
			while(i<productoStocks.size() && nuevoProductoStock.iguales(productoStocks.get(i))==false) {
				i++;
			}
			
			if(i>productoStocks.size()) {
				System.out.println("El producto ya se ecnuentra registrado el codigo es "+productoStocks.get(i).getId());
			}
			else {
				if(crudbd.insert(nuevoProductoStock.crearQueryInsert())) {
					System.out.println("El producto fue ingresado con existo");
					System.out.println("¿Desea seguir ingresando?[s(si)/n(no)]");
					
					if(new Scanner(System.in).nextLine().equalsIgnoreCase("s")) {
						registrar();
					}
					
					
				}
			}
		}
		else {
				rpta=false;
				System.out.println("Error en la conexion");
		}
		return rpta;
	}
	
}
