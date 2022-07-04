package supermark_cintia;

public class ProductoStock extends Producto {
	
	private Double costo;

	public ProductoStock(int codigo, String nombre, String marca, String descripcion, Double precio, Integer stock,
			String categoria, Double costo) {
		super(codigo, nombre, marca, descripcion, precio, stock, categoria);
		
		this.costo = costo;
	}



	public Double getCosto() {
		return costo;
	}



	public void setCosto(Double costo) {
		this.costo = costo;
	}



	public void mostrar() {

		System.out.println("Costo: " + this.costo );
	
	}
	public String crearQueryInsert() {
		
		return "insert into productos (fecha, nombre, marca, descripcion, precio, stock, id_categoria) values (now(), '"+super.getNombre()+"','"+super.getMarca()+"','"+super.getDescripcion()+"','"+super.getPrecio()+"','"+"
	}
}
