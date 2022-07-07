package supermark_cintia;

import java.util.ArrayList;

public class miCuenta {
	
	private Cliente cliente;
	private Carrito carrito;
	
	private ArrayList <Carrito> historial;
	
	public miCuenta(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.carrito = new Carrito();
		
		obtenerHistorial();
	}


	private void obtenerHistorial() {
		CrudConsultasBD crudbd = new CrudConsultasBD("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/bd_supermarket", "root", "blackpink94");
		if(crudbd.conectar()) {
			
			//Para realizar la consulta del historia de venta del ID cliente nro .....
			String r=crudbd.select("select ventas.id_ventas, ventas.fecha, productos.nombre, productos.marca, productos.precio, detalle_ventas.cantidad from clientes inner join ventas using (id) inner join detalle_ventas using (id_ventas)\r\n"
					+ "inner join productos using (codigo) where id=1;"+crudbd.select("select id from clientes where clientes.email='cintiaparamore@gmail.com';'"+this.cliente.getEmail())+"';");
			
			if(r.equals("")) {
				System.out.println("No hay nada para mostrar");
			}
			else {
					String [] registros=r.split(";");
					String [] registro;
					String [] registro2;
					
					this.historial=new ArrayList<Carrito>();
					int i=0;
					
					
					while(i<registros.length) {
						
						registro=registros[i].split(",");
						registro2=registros[i+1].split(",");
						
						this.historial.add(new Carrito(Integer.parseInt(registro[0]),registro[1]));
						
		/*				while(registro[0].equals()) {
							
						}*/
					}
			}
		}
	}

}