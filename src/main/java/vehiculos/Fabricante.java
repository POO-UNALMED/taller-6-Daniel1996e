package vehiculos;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static HashMap<Fabricante, Integer> fabricantes = new HashMap<Fabricante, Integer> ();
	
	public Fabricante() {
		fabricantes.put(this, 0);
	}
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.put(this, 0);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static void anadirAFabricante(Fabricante fabricante) {
		fabricantes.replace(fabricante, fabricantes.get(fabricante) + 1);
	}
	public static Fabricante fabricaMayorVentas() {
		Fabricante key = Collections.max(fabricantes.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
		return key;
	}
}
