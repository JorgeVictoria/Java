package orientacionObjetos;

import java.util.Objects;

public class Empleado {
	
	//atributos
	private String nombre;
	private String ape1;
	private String ape2;
	private int edad;
	
	//-----------------------------------------------constructores-------------------------------------------------------
	
	//constructor vacio
	public Empleado() {
	}
	
	//constructor con algunos atributos
	public Empleado(String nombre, String ape1, String ape2) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
	}
	
	//cosntructor con todos los atributos
	public Empleado(String nombre, String ape1, String ape2, int edad) {
		this(nombre,ape1,ape2);	//aprovechamos el constructor anterior
		this.edad = edad;
	}

	//-----------------------------------------------Getters & Setters------------------------------------------------------
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	//-------------------------------------------------------------metodos--------------------------------------------------------------
	public void saludar() {
		System.out.println("Hola, soy un empleado.");
	}
	
	public void presentacion() {
		System.out.println("Hola, soy " + this.nombre + " " + this.ape1 + " " + this.ape2);
	}
	
	public String toString(){return "Empleado [nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", edad=" + edad + "]";}
	
}
