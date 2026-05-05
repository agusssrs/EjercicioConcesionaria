package Modules;

public class Auto {
	private int idAuto;
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	private boolean vendido;
	
	public Auto(int idAuto, String marca, String modelo, int anio, double precio) {
		this.idAuto = idAuto;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}
	
	public void marcarVendido() {
		vendido = true;
	}
	
	public boolean isVendido() {
		return vendido;
	}

	public int getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	@Override
	public String toString() {
		return "ID: " + idAuto + " | " + marca + " " + modelo + " | Anio: " + anio + " | Precio: $" + precio + " | Vendido:" + vendido;
	}
	
}
