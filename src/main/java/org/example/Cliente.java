package org.example;

public class Cliente {

	private String nombre;
	private String apellido;
	private String email;
	private String contacto;
	private String estadoCivil;
	private String ciudad;
	public Tienda tienda;

	public Cliente(String nombre,String apellido,String email,String contacto,String estadoCivil){
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.contacto=contacto;
		this.estadoCivil=estadoCivil;
		this.ciudad=ciudad;
		this.tienda=tienda;
	}
}