package supermark.code;

import java.util.Scanner;

public class ConfirmacionDeCompra {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tarjetaDebito= 1;
		int tarjetaCredito=2;
		System.out.println("Elija 1 para abonar con Tarjeta de Debito ");
		System.out.println("Elija 2 para abonar con Tarjeta de Credito");
		int opcion1= sc.nextInt();
		//int opcion2= sc.nextInt();
		if ( opcion1== tarjetaDebito ) {
			System.out.println("Abona con debito");
			{
		//if (opcion2== tarjetaCredito) {
			//System.out.println("Abona con credito");
		}//
			}else {
				System.out.println("Abona con credito");
			}
		System.out.println("Continue con el pago");
		//System.out.println("Ingrese numero de tarjeta");
		//long numeroTarjeta = sc.nextLong ();
		Carrito totalFinal= new Carrito (null, null, null, opcion1);
		totalFinal.getTotal();
		float totalCompra= totalFinal.getTotal();
		System.out.println("Ingrese saldo de la tarjeta");
		double saldoTarjeta = sc.nextDouble();
		if (saldoTarjeta>= totalCompra)  {
			System.out.println("Elija cuotas");
		int Cuotas = sc.nextInt();
			System.out.println("Compra confirmada");

		} else {
			System.out.println("Compra Rechazada");
		}
	}
}


