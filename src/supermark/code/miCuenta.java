package supermark.code;

public class miCuenta {
	private Usuario usuario;
	private Carrito carrito;
	private Compra compra;
	
	public miCuenta(Usuario usuario, Carrito carrito, Compra compra) {
		super();
		this.usuario = usuario;
		this.carrito = carrito;
		this.compra = compra;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public void mostrar() {
	
		System.out.println("Mi Usuario: "+this.usuario);
		System.out.println("Mis compras: "+this.compra);
		
	}
}