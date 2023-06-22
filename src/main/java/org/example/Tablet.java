package org.example;
import java.util.ArrayList;
public class Tablet extends DispositivoTecnologico {

	private String resolucionPantalla;
	private ArrayList accesoriosIncorporados = new ArrayList();
	public Tablet(String marca, String memoriaRAM, String memoriaROM, String procesador, String modelo, String anoFabricacion, int precio, String resolucionPantalla) {

		this.resolucionPantalla = resolucionPantalla;
	}

}