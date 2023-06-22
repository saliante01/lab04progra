package org.example;

public class Pantalla {

	private String marca;
	private String modelo;
	private String ano;
	public Computador computador;
	public Pantalla(String marca, String modelo, String ano, Computador computador) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.computador = computador;
	}
}