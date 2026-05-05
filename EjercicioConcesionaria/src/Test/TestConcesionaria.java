package Test;

import Modules.Concesionaria;

public class TestConcesionaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concesionaria c = new Concesionaria("Spaceship Motors");
		
		c.agregarAuto("Audi", "RS6", 2020, 60000);
		c.agregarAuto("Ferrari", "458", 2009, 250000);
		c.agregarAuto("Lamborghini", "Murcielago", 2007, 350000);
		
		System.out.println(c);
		
		System.out.println("\nVendido:");
		System.out.println(c.venderAuto(0));
		
		System.out.println("\nStock actual: \n");
		System.out.println(c);
		
		System.out.println("\nAuto mas caro:\n");
		System.out.println(c.autoMasCaro());
		
		System.out.println("\nValor total stock: $");
		System.out.println(c.valorTotalStock());
	}

}
