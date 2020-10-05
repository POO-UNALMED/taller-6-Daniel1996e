package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {
	private int puestos;
	private static List<Vehiculo> automoviles = new ArrayList<Vehiculo> ();
	
	public Automovil() {
		super();
		automoviles.add(this);
	}
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, nombre, precio, peso, fabricante);
		this.setPuertas(4);
		this.setVelocidadMaxima(100);
		this.setTraccion("FWD");
		this.puestos = puestos;
		automoviles.add(this);
		addToVehiculos(this);
		Pais.anadirAPais(this.fabricante.getPais());
		Fabricante.anadirAFabricante(fabricante);
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int cantidadAutomoviles() {
		return automoviles.size();
	}
}
