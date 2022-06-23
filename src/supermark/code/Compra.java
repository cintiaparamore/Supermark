package supermark.code;

import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Carrito> mis_Compras;
	
	
	public Compra(ArrayList<Carrito> mis_Compras) {
		super();
		this.mis_Compras = mis_Compras;
	}

	public ArrayList<Carrito> getmis_Compra() {
		return mis_Compras;
	}

	public void setmis_Compras(ArrayList<Carrito> mis_Compras) {
		this.mis_Compras = mis_Compras;
	}
	
	public void mostrar() {

		System.out.println("Lista de Compras: " + this.mis_Compras);
	
	}
}