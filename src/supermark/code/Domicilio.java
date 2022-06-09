package supermark.code;

public class Domicilio {

	private String calle;
	private Integer nro;
	private Integer piso;
	private Integer nroDpto;
	private Domicilio domicilio;
	

	}
	public Domicilio(String calle, Integer nro, Integer piso, Integer nroDpto) {
		super();
		this.calle = calle;
		this.nro = nro;
		this.piso = piso;
		this.nroDpto = nroDpto;
		this.domicilio= domicilio;
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
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	
	}
}