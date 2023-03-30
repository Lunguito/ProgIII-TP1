package algoritmos;

import java.util.Comparator;

import model.Profesor;

public class OrdenadorProfesores implements Comparator<Profesor>{

	@Override
	public int compare(Profesor o1, Profesor o2) {
		int a = o1.getApellido().compareTo(o2.getApellido());
		if(a != 0) {
			return a;
		} else {
			return o1.getNombre().compareTo(o2.getNombre());
		}
	}

}
