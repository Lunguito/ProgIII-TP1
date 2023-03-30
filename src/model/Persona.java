package model;

import java.util.Comparator;

public abstract class Persona {
	private int dni, edad, id;
	private String apellido, nombre;
	private char sexo;
	private static int ID;

	public Persona(String ap, String nom, int dni) {
		this.dni = dni;
		apellido = ap;
		nombre = nom;
		this.id = ++ID;
	}

	@Override
	public String toString() {
		return apellido + ", " + nombre + ". DNI: " + dni;
	}

	public Persona() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
