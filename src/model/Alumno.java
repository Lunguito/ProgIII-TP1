package model;

import java.util.Comparator;

public class Alumno extends Persona implements Comparable<Alumno> {

	private int nroLE;
	private int materiasAprobadas;
	private double promedio;


	@Override
	public int compareTo(Alumno o) {
		int a = this.getApellido().compareTo(o.getApellido());
		if(a != 0) {
			return a;
		} else {
			return this.getNombre().compareTo(o.getNombre());
		}
	}

	
	public int getNroLE() {
		return nroLE;
	}

	public void setNroLE(int nroLE) {
		this.nroLE = nroLE;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public Alumno() {
		super();
	}

	public Alumno(String ap, String nom, int dni) {
		super(ap, nom, dni);
	}
}