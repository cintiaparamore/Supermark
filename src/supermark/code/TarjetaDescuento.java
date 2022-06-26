package supermark.code;

public class TarjetaDescuento {
	private Integer id_td;
	private Integer puntos;
	private Cliente cliente;

	public TarjetaDescuento(Integer id_td, Integer puntos, Cliente cliente) {
		super();
		this.id_td = id_td;
		this.puntos = puntos;
		this.cliente = cliente;
	}

	public Integer getId_td() {
		return id_td;
	}

	public void setId_td(Integer id_td) {
		this.id_td = id_td;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void acumula_puntos(Integer punto) {
		int puntaje = this.getPuntos() + punto;
	}

	public double porcentaje(double total) {

		double totalfinal = 0;
		double descuento;
		double puntaje = this.getPuntos();
		if (puntaje == 5) {
			descuento = total * 0.05;
			totalfinal = total - descuento;
		}

		else {
			if (puntaje == 10) {
				descuento = total * 0.1;
				totalfinal = total - descuento;
			} else {
				if (puntaje == 15) {
					descuento = total * 0.15;
					totalfinal = total - descuento;
					puntaje = 0;

				}
			}

		}
		return totalfinal;
	}
}
