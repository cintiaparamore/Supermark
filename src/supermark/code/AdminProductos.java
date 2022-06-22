import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
			
		Producto produ = new Producto();
		
		Scanner teclado = new Scanner(System.in);
		
		Scanner tecladoString = new Scanner(System.in);
		
		tecladoString.useDelimiter("\n"); // Para que me tome espacios entre palabras
		
						
		boolean salir = false;
		int opcion;
		
		while (!salir) {
			
			  System.out.println("---------------------------------------");
			  System.out.println("----- ADMINISTRACI�N DE PRODUCTOS -----");
			  System.out.println("---------------------------------------");
			  System.out.println("-(1)- Agregar");	
		      System.out.println("-(2)- Modificar");
		      System.out.println("-(3)- Eliminar");
		      System.out.println("-(4)- Listar todos productos");
		      System.out.println("-(5)- Listar un producto");
		      System.out.println("-(6)- Salir");	
		      System.out.println("---------------------------------------");
		      
		      try {
		    	  System.out.println("Elije una opci�n: ");
		    	  opcion = teclado.nextInt();
		    	  
		    	  switch (opcion) {
		    	      
		    	  	  case 1: //Opci�n de Agregar productos
		    		  
		    	  		String nprodu, mprodu, dprodu;
		    	  		Double pprodu;
		    	  		int sprodu, cprodu;
		    	  		
	    	    	    System.out.println("Ingrese un nombre de producto: ");
	    	    	    nprodu = tecladoString.nextLine(); 
	    	    	    
	    	    	    System.out.println("Ingrese la marca del producto: ");
	    	    	    mprodu = tecladoString.nextLine();
		    	  		  
	    	    	    System.out.println("Ingrese una descripci�n del producto: ");
	    	    	    dprodu = tecladoString.nextLine();  
	    	    	    
	    	    	    System.out.println("Ingrese el precio del producto: ");
	    	    	    pprodu = teclado.nextDouble();
	    	    	    
	    	    	    System.out.println("Ingrese stock del producto: ");
	    	    	    sprodu = teclado.nextInt(); 
	    	    	    
	    	    	    System.out.println("Ingrese la categoria del producto: ");
	    	    	    cprodu = teclado.nextInt();
	    	    	    
	    	    	    	  
		    	  		produ.agregarProducto(nprodu,mprodu,dprodu,pprodu,sprodu,cprodu);
		    	  		
		    	  				    	  		
		    	  		break;
		    	  		
		    	      case 2: //Opci�n de Modificar productos
		    	    	
		    	    	    
		    	    	    int modprodu;
		    	    	    System.out.println("Ingrese el c�digo del producto que desea modificar: ");
		    	    	    modprodu = teclado.nextInt();
		    	    	    produ.listarUnProducto(modprodu);
		    	    	    
		    	    	    int res;
		    	    	    System.out.println("�Qu� desea modificar?\n (1)--> Nombre del producto\n (2)--> Precio del producto");
		    	    	    res = teclado.nextInt();
		    	    	    
		    	    	    switch (res) {
		    	    	     
		    	    	      case 1: // Nombre
		    	    	    	    String nuevonombre;
				    	    	    System.out.println("Ingrese el nuevo nombre del producto: ");
				    	    	    nuevonombre = tecladoString.nextLine();
					    	    	produ.modificarNombreProducto(modprodu, nuevonombre); 
		    	    	    	    break;
		    	    	    	    
		    	    	      case 2: // Precio
		    	    	    	    Double nuevoprecio;
				    	    	    System.out.println("Ingrese el nuevo precio del producto: ");
				    	    	    nuevoprecio = teclado.nextDouble();
					    	    	produ.modificarPrecioProducto(modprodu, nuevoprecio); 
		    	    	    	    break;
		    	    	    	    
		    	    	      default:
		    	    	    	  System.out.println("Ingrese una opci�n v�lida.");
		    	    	    	
		    	    	    	
		    	    	    }
		    	    	    
		    	    	    
		    	    	    
		    	    	  
		    	    	  
		    	    	break;
		    	    	
		    	    	
		    	      case 3: //Opci�n de Eliminar producto
		    	    	  
		    	    	  int eliminaprodu;
		    	    	    System.out.println("Ingrese el codigo del producto que desea eliminar: ");
		    	    	    eliminaprodu = teclado.nextInt();
			    	    	
		    	    	    produ.listarUnProducto(eliminaprodu);
			    	    	
		    	    	    System.out.println("�Esta seguro que desea elimiar el producto?\nSI-->(1)\nNO-->(2)");
		    	    		int respuesta;
		    	    		respuesta = teclado.nextInt();
		    	    		
		    	    		if (respuesta == 1) {
		    	    			
		    	    			produ.eliminarProducto(eliminaprodu);
		    	    				    	    			
		    	    		} 
		    	    		
		    	    	    
		    	    		
			    	    	break;
		    	    	
			    	    	
		    	      case 4: //Opci�n de Listar productos
		    	    	  
		    	    	produ.listarProductos();
		    	    	
		    	    	break;	
		    	    		
		    	    	
		    	      case 5: //Opci�n de Listar un producto
		    	    	    
		    	    	    int cod;
		    	    	    System.out.println("Ingrese un c�digo de producto: ");
		    	    	    cod = teclado.nextInt();
			    	    	
		    	    	    produ.listarUnProducto(cod);
			    	    	
		    	    	  
		    	    	    
			    	    	break;	
			    	    	
		    	      case 6: //Opci�n para salir 
		    	    	salir = true;
		    	    	break;
		    	    	  
		    	    	
		    	      default:
		    	    	System.out.println("Ingrese n�meros del 1 al 6.");
		    	    	  
		    	  }
		    	  
		    	  
		      } catch(InputMismatchException e) {
		    	  System.out.println("��� S�lo se permiten n�meros del 1 al 6 !!!");
		    	  teclado.next();
		    	  
		      }
		      
		     
		      
		      
		      
		      
		}
	}

}
