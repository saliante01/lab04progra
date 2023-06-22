package org.example;

public class Notebook extends DispositivoTecnologico {


	private String resolucionPantalla;
	private String tipoTeclado;
	private String bateria;

	public Notebook(String marca, String memoriaRAM, String memoriaROM, String procesador, String modelo, String anoFabricacion, int precio, String resolucionPantalla, String tipoTeclado, String bateria) {
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}
}