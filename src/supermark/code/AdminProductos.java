package supermark.code;

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
		boolean salirmodi = false;
		int opcion;

		while (!salir) {

			System.out.println("---------------------------------------");
			System.out.println("----- ADMINISTRACIÓN DE PRODUCTOS -----");
			System.out.println("---------------------------------------");
			System.out.println("-(1)- Agregar");
			System.out.println("-(2)- Modificar");
			System.out.println("-(3)- Eliminar");
			System.out.println("-(4)- Listar todos productos");
			System.out.println("-(5)- Listar un producto");
			System.out.println("-(6)- Salir");
			System.out.println("---------------------------------------");

			try {
				System.out.println("Elije una opción: ");
				opcion = teclado.nextInt();

				salirmodi = false;

				switch (opcion) {

				case 1: // Opción de Agregar productos

					String nprodu, mprodu, dprodu;
					Double pprodu;
					int sprodu, cprodu;

					System.out.println("Ingrese un nombre de producto: ");
					nprodu = tecladoString.nextLine();

					System.out.println("Ingrese la marca del producto: ");
					mprodu = tecladoString.nextLine();

					System.out.println("Ingrese una descripción del producto: ");
					dprodu = tecladoString.nextLine();

					System.out.println("Ingrese el precio del producto: ");
					pprodu = teclado.nextDouble();

					System.out.println("Ingrese stock del producto: ");
					sprodu = teclado.nextInt();

					System.out.println("Ingrese el ID de la Categoria del producto: ");
					System.out.println("ID : 1. Alimentos 2. Bebidas 3. Limpieza");
					cprodu = teclado.nextInt();

					produ.agregarProducto(nprodu, mprodu, dprodu, pprodu, sprodu, cprodu);

					break;

				case 2: // Opción de Modificar productos

					int modprodu;
					System.out.println("Ingrese el código del producto que desea modificar: ");
					modprodu = teclado.nextInt();
					produ.listarUnProducto(modprodu);

					int res;

					while (!salirmodi) {

						System.out.println(
								"¿Qué desea modificar?\n (1)--> Nombre del producto\n (2)--> Marca del producto\n"
										+ " (3)--> Descripcion del producto\n (4)--> Precio del Producto\n (5)--> Stock del Producto\n"
										+ " (6)--> Categoría del Prodcuto\n (7)--> Salir de modificación");

						res = teclado.nextInt();

						try {
							// System.out.println("Elije una opción: ");
							// res = teclado.nextInt();

							switch (res) {

							case 1: // Nombre
								String nuevonombre;
								System.out.println("Ingrese el nuevo nombre del producto: ");
								nuevonombre = tecladoString.nextLine();
								produ.modificarNombreProducto(modprodu, nuevonombre);
								salirmodi = true;
								break;

							case 2: // Marca
								String nuevamarca;
								System.out.println("Ingrese la nueva marca del producto: ");
								nuevamarca = tecladoString.nextLine();
								produ.modificarMarcaProducto(modprodu, nuevamarca);
								salirmodi = true;
								break;

							case 3: // Descripcion
								String nuevadescripcion;
								System.out.println("Ingrese la nueva descripcion del producto: ");
								nuevadescripcion = tecladoString.nextLine();
								produ.modificarDescripcionProducto(modprodu, nuevadescripcion);
								salirmodi = true;
								break;

							case 4: // Precio
								Double nuevoprecio;
								System.out.println("Ingrese el nuevo precio del producto: ");
								nuevoprecio = teclado.nextDouble();
								produ.modificarPrecioProducto(modprodu, nuevoprecio);
								salirmodi = true;
								break;

							case 5: // Stock
								int nuevostock;
								System.out.println("Ingrese el nuevo stock del producto: ");
								nuevostock = teclado.nextInt();
								produ.modificarStockProducto(modprodu, nuevostock);
								salirmodi = true;
								break;

							case 6: // Categoria
								int nuevacategoria;
								System.out.println("Ingrese la nueva categoria del producto: ");
								nuevacategoria = teclado.nextInt();
								produ.modificarCategoriaProducto(modprodu, nuevacategoria);
								salirmodi = true;
								break;

							case 7: // Opción para salir
								salirmodi = true;
								break;

							default:
								System.out.println("Ingrese una opción válida.");
							}

						} catch (InputMismatchException e) {
							System.out.println("¡¡¡ Sólo se permiten números del 1 al 7 !!!");
							res = teclado.nextInt();
							salirmodi = false;
						}

					} // del while

					break;

				case 3: // Opción de Eliminar producto

					int eliminaprodu;
					System.out.println("Ingrese el codigo del producto que desea eliminar: ");
					eliminaprodu = teclado.nextInt();

					produ.listarUnProducto(eliminaprodu);

					System.out.println("¿Esta seguro que desea elimiar el producto?\nSI-->(1)\nNO-->(2)");
					int respuesta;
					respuesta = teclado.nextInt();

					if (respuesta == 1) {
						produ.eliminarProducto(eliminaprodu);
					}

					break;

				case 4: // Opción de Listar productos

					produ.listarProductos();

					break;

				case 5: // Opción de Listar un producto

					int cod;
					System.out.println("Ingrese un codigo de producto: ");
					cod = teclado.nextInt();

					produ.listarUnProducto(cod);

					break;

				case 6: // Opción para salir
					salir = true;
					System.out.println("¡Hasta Luego!. Vuelva a ingresar al menu principal");
					break;

				default:
					System.out.println("Ingrese números del 1 al 6.");

				}

			} catch (InputMismatchException e) {
				System.out.println("¡¡¡ Sólo se permiten números del 1 al 6 !!!");
				teclado.next();

			}

		}
	}

}
