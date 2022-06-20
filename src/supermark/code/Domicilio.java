package supermark.code;

public class Domicilio {

	private String calle;
	private Integer nro_calle;
	private Integer manzana;
	private Integer nro_piso;
	private Integer nro_Dpto;
	private String barrio;
	

	public Domicilio(String calle, Integer nro_calle, Integer manzana, Integer nro_piso, Integer nro_Dpto,
			String barrio) {
		super();
		this.calle = calle;
		this.nro_calle = nro_calle;
		this.manzana = manzana;
		this.nro_piso = nro_piso;
		this.nro_Dpto = nro_Dpto;
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
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

		System.out.println("Calle: " + this.calle);
		System.out.println("Numero de calle: " + this.nro_calle);
		System.out.println("Manzana: "+this.manzana);
		System.out.println("Numero de piso: " + this.nro_piso);
		System.out.println("Numero de Dpto.: " + this.nro_Dpto);
		System.out.println("Barrio: " + this.barrio);

	}

	public static void main(String arg[]) {
		Domicilio p1 = new Domicilio("Caseros", 1685, 5, null, null, "Chacabuco");
		p1.mostrar();

	}

}