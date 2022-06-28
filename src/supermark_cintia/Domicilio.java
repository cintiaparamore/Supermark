package supermark_cintia;

public class Domicilio {

	private String calle1;
	private String calle2;
	private Integer nro_calle;
	private Integer manzana;
	private Integer nro_piso;
	private Integer nro_Dpto;
	private String barrio;
	
	public Domicilio(String calle1, String calle2, Integer nro_calle, Integer manzana, Integer nro_piso, Integer nro_Dpto,
			String barrio) {
		super();
		this.calle1 = calle1;
		this.calle2 = calle2;
		this.nro_calle = nro_calle;
		this.manzana = manzana;
		this.nro_piso = nro_piso;
		this.nro_Dpto = nro_Dpto;
		this.barrio = barrio;
	}

	public String getCalle1() {
		return calle1;
	}

	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}

	public String getCalle2() {
		return calle2;
	}

	public void setCalle2(String calle2) {
		this.calle2 = calle2;
	}

	public Integer getNro_calle() {
		return nro_calle;
	}

	public void setNro_calle(Integer nro_calle) {
		this.nro_calle = nro_calle;
	}

	public Integer getManzana() {
		return manzana;
	}

	public void setManzana(Integer manzana) {
		this.manzana = manzana;
	}

	public Integer getNro_piso() {
		return nro_piso;
	}

	public void setNro_piso(Integer nro_piso) {
		this.nro_piso = nro_piso;
	}

	public Integer getNro_Dpto() {
		return nro_Dpto;
	}

	public void setNro_Dpto(Integer nro_Dpto) {
		this.nro_Dpto = nro_Dpto;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	public void mostrar() {

		System.out.println("Calle 1ra: " + this.calle1);
		System.out.println("Calle 2da: "+this.calle2);
		System.out.println("Numero de calle: " + this.nro_calle);
		System.out.println("Manzana: "+this.manzana);
		System.out.println("Numero de piso: " + this.nro_piso);
		System.out.println("Numero de Dpto.: " + this.nro_Dpto);
		System.out.println("Barrio: " + this.barrio);

	}

	/*
	 * public static void main(String arg[]) { Domicilio p1 = new
	 * Domicilio("Caseros", 1685, 5, null, null, "Chacabuco"); p1.mostrar();
	 * 
	 * }
	 */

}