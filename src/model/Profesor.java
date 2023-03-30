package model;

public class Profesor extends Persona {
	private int legajo;
	private String titulo;
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toUpperCase();
	}

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(String ap, String nom, int dni) {
		super(ap, nom, dni);
		// TODO Auto-generated constructor stub
	}
	
}
