package vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {
	private int ejes;
	private static List<Vehiculo> camiones = new ArrayList<Vehiculo> ();
	
	public Camion() {
		super();
		camiones.add(this);
	}
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, nombre, precio, peso, fabricante);
		this.setPuertas(2);
		this.setVelocidadMaxima(80);
		this.setTraccion("4X2");
		this.ejes = ejes;
		camiones.add(this);
		Pais.anadirAPais(this.fabricante.getPais());
		Fabricante.anadirAFabricante(fabricante);
	}
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int cantidadCamiones() {
		return camiones.size();
	}
}
