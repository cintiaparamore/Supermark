package supermark.code;

public class ProductoStock {
	
	private Integer stock;
	private Double precio;

	public ProductoStock(Integer stock, Double precio) {
		super();
		this.stock = stock;
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void mostrar() {

		System.out.println("Stock de productos: " + this.stock);
	    System.out.println("Precio: " + this.precio);
	
	}
}
