package vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static List<Vehiculo> camionetas = new ArrayList<Vehiculo> ();
	
	public Camioneta() {
		super();
		camionetas.add(this);
	}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, nombre, precio, peso, fabricante);
		this.setVelocidadMaxima(90);
		this.setTraccion("4X4");
		this.volco = volco;
		camionetas.add(this);
		Pais.anadirAPais(this.fabricante.getPais());
		Fabricante.anadirAFabricante(fabricante);
	}
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int cantidadCamionetas() {
		return camionetas.size();
	}
}
