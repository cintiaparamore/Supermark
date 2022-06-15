package supermark.code;

public class Domicilio {

	private String calle;
	private Integer nro;
	private Integer piso;
	private Integer nroDpto;
	private String barrio;
	private String localidad;
	
	public Domicilio(String calle, Integer nro, Integer piso, Integer nroDpto, Domicilio domicilio, String barrio,
			String localidad) {
		super();
		this.calle = calle;
		this.nro = nro;
		this.piso = piso;
		this.nroDpto = nroDpto;
		this.barrio = barrio;
		this.localidad = localidad;
	}


	public String getBarrio() {
		return barrio;
	}


	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNro() {
		return nro;
	}
	public void setNro(Integer nro) {
		this.nro = nro;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public Integer getNroDpto() {
		return nroDpto;
	}
	public void setNroDpto(Integer nroDpto) {
		this.nroDpto = nroDpto;
	}

}