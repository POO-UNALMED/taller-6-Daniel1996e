package vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Vehiculo {
	protected String placa;
	private int puertas;
	private int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	private String traccion;
	protected Fabricante fabricante;
	private static int cantidadVehiculos;
	private static List<Vehiculo> vehiculos = new ArrayList<Vehiculo> ();
	
	public Vehiculo() {
		
	}
	public Vehiculo(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	public Vehiculo(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		cantidadVehiculos = cantidadVehiculos;
	}
	
	public void addToVehiculos(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	public int sizeVehiculos() {
		return vehiculos.size();
	}
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantidadAutomoviles() +
				"\nCamionetas: " + Camioneta.cantidadCamionetas() + 
				"\nCamiones: " + Camion.cantidadCamiones();
	}
	
	public static int getCantidadVehiculos() {
		return Automovil.cantidadAutomoviles() + Camioneta.cantidadCamionetas() + Camion.cantidadCamiones();
	}
}
