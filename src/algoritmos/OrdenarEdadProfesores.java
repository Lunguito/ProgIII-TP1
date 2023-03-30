package algoritmos;

import java.util.Comparator;

import model.Profesor;

public class OrdenarEdadProfesores implements Comparator<Profesor> {

	@Override
	public int compare(Profesor o1, Profesor o2) {
		return o2.getEdad() - o1.getEdad();
	}

}
