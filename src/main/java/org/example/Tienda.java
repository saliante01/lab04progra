package org.example;
import java.util.ArrayList;
public class Tienda {

	private String direccion;
	private Catalogo catalogo;
	public ArrayList<Cliente> clientes = new ArrayList();


	public Tienda(String direccion) {
		this.direccion = direccion;
	}

	public Cliente AgregaCliente(String nombre, String apellido, String email, String contacto, String estadoCivil, String ciudad){
		Cliente cliente = new Cliente(nombre, apellido, email, contacto, estadoCivil, ciudad, this);
		this.clientes.add(cliente);
		return cliente;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

}