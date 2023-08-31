package ar.edu.info.unlp.ejercicioDemo;

public class Balanza {
	private  int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	public void agregarProducto(Producto producto) {
		cantidadDeProductos += 1;
		precioTotal += producto.getPrecio();
		pesoTotal += producto.getPeso();
		
	}
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(cantidadDeProductos, precioTotal, pesoTotal);
		return ticket;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
}

