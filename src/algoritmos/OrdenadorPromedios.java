package algoritmos;

import java.util.Comparator;

import model.Alumno;

public class OrdenadorPromedios implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return (int) Math.round(((o2.getPromedio() - o1.getPromedio())* 100));
	}

}
