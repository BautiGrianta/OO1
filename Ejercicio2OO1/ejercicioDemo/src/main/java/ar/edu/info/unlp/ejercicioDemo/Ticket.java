package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int cantidadDeProductos, double precioTotal, double pesoTotal) {
		fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double impuesto() {
		return precioTotal * 0.21;
	}
}
