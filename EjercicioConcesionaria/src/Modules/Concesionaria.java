package Modules;

import java.util.ArrayList;
import java.util.List;

public class Concesionaria {
	private String nombre;
	private List<Auto> autos;
	private int proximoIdAuto;
	
	public Concesionaria(String nombre) {
		this.nombre = nombre;
		autos = new ArrayList<Auto>();
		this.proximoIdAuto = 0;
	}
	
	public boolean agregarAuto(String marca, String modelo, int anio, double precio) {
		/*
		int idAuto = 0;
		
		if(autos.size() > 0) {
			idAuto = autos.get(autos.size() - 1).getIdAuto() + 1;
		}
		*/
		
		Auto nuevo = new Auto(proximoIdAuto, marca, modelo, anio, precio);
		proximoIdAuto++;
		return autos.add(nuevo);
	}
	
	public Auto traerAuto(int idAuto) {
		Auto aux = null;
		int i = 0;
		
		while(i<autos.size() && aux == null) {
			if(autos.get(i).getIdAuto() == idAuto) {
				aux = autos.get(i);
			}
			
			i++;
		}
		
		return aux;
	}
	
	public boolean venderAuto(int idAuto) {
		Auto a = traerAuto(idAuto);
		boolean vendido = false;
		
		if(a != null) {
			a.marcarVendido();
			vendido = true;
		}
		
		return vendido;
	}
	
	public List<Auto> autosDisponibles(){
		List<Auto> listaAux = new ArrayList<Auto>();
		
		for(int i = 0; i < autos.size(); i++) {
			if(autos.get(i).isVendido() == false) {
				listaAux.add(autos.get(i));
			}
		}
		
		return listaAux;
	}
	
	public Auto autoMasCaro() {
		Auto aux = null;
		
		for(int i = 0; i < autos.size(); i++) {
			if(i==0) {
				aux = autos.get(i);
			} else {
				if(autos.get(i).getPrecio() > aux.getPrecio()) {
					aux = autos.get(i);
				}
			}
		}
		
		return aux;
	}
	
	public double valorTotalStock() {
		double total = 0;
		
		for (int i=0;i<autos.size(); i++) {
			if(autos.get(i).isVendido() == false) {
				total += autos.get(i).getPrecio();
			}
		}
		
		return total;
	}
	
	@Override
	public String toString() {

		String salida = "CONCESIONARIA: " + nombre + "\n\n";

		for (int i = 0; i < autos.size(); i++) {
			salida += autos.get(i) + "\n";
		}

		return salida;
	}
}
