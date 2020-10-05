package vehiculo;

import java.util.HashMap;
import java.util.*;

public class Pais {
	private String nombre;
	private static HashMap<Pais, Integer> paises = new HashMap<Pais, Integer> ();
	
	public Pais() {
		paises.put(this, 0);
	}
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.put(this, 0);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void añadirAPais(Pais pais) {
		paises.replace(pais, paises.get(pais) + 1);
	}
	public static Pais paisMasVendedor() {
		Pais key = Collections.max(paises.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
		return key;
	}
}
