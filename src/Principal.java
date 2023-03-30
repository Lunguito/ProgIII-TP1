import java.util.*;
import algoritmos.*;
import model.*;

public class Principal {

	public static void main(String[] args) {
		List<Persona> lista = generatePersonas();
		List<Alumno> listaAlumnos = new ArrayList<>();
		List<Profesor> listaProfesores = new ArrayList<>();

		for (Persona p : lista) {
			if (p instanceof Alumno) {
				listaAlumnos.add((Alumno) p);
			} else {
				listaProfesores.add((Profesor) p);
			}
		}

		System.out.println("Punto A: Ordenar los alumnos por apellido y nombre");
		Collections.sort(listaAlumnos);
		for (Persona o : listaAlumnos) {
			System.out.println(o);
		}
		System.out.println("--------------------------------------------------\n\n");

		System.out.println("Punto B: Ordenar los profesores por apellido y nombre");
		Collections.sort(listaProfesores, new OrdenadorProfesores());
		for (Persona o : listaProfesores) {
			System.out.println(o);
		}
		System.out.println("--------------------------------------------------\n\n");

		System.out.println("Punto C: Identificar el mayor promedio de toda la lista completa");
		Collections.sort(listaAlumnos, new OrdenadorPromedios());
		System.out.println(String.format("El promedio más alto es : %.2f; del alumno: %s",
				listaAlumnos.get(0).getPromedio(), listaAlumnos.get(0).toString()));
		System.out.println("--------------------------------------------------\n");

		System.out.println("Punto D: Identificar el menor promedio de toda la lista completa");
		System.out.println(String.format("El promedio más bajo es : %.2f; del alumno: %s",
				listaAlumnos.get(listaAlumnos.size() - 1).getPromedio(),
				listaAlumnos.get(listaAlumnos.size() - 1).toString()));
		System.out.println("--------------------------------------------------\n");

		System.out.println(
				"Punto E: Identificar los alumnos que tienen un promedio mayor a 7, y esa lista ordenada por mayor promedio.");
		for (Alumno a : listaAlumnos) {
			if (a.getPromedio() > 7) {
				System.out.println(String.format("%s, Promedio: %.2f", a, a.getPromedio()));
			}
		}
		System.out.println("--------------------------------------------------\n");

		System.out.println("Punto F: Identificar los profesores cuyo título sea “Ing. en Sistemas”");
		for (Profesor p : listaProfesores) {
			if (p.getTitulo().equals("ING. EN SISTEMAS")) {
				System.out.println(p.getTitulo() + ". " + p);
			}
		}
		System.out.println("--------------------------------------------------\n");

		System.out.println("Punto G: Ordenar los profesores de Mayor a Menor, imprimiendo sus datos por pantalla");
		Collections.sort(listaProfesores, new OrdenarEdadProfesores());
		for (Profesor p : listaProfesores) {
			System.out.println("Edad: " + p.getEdad() + ". " + p);
		}
		System.out.println("--------------------------------------------------\n");
	}

	static Random rnd = new Random();

	private static List<Persona> generatePersonas() {
		List<Persona> lista = new ArrayList();
		String[] apellidos = { "Moreira", "Bochini", "Fernandez", "Alcaráz", "Ferrari", "Tentor", "Musich", "Raltieri",
				"Rodriguez", "Beder", "Montes de Oca", "Benavidez", "Edul", "Domanpalooza", "Azzaro" };
		String[] nombres = { "Mariano", "Augusto", "Maria", "Ramón", "Oscar", "Franchesca", "Irina", "Martina", "Pilar",
				"Matias", "Tomás", "Pedro", "Facundo" };

		for (int i = 0; i < 18; i++) {
			Alumno a = new Alumno(apellidos[rnd.nextInt(apellidos.length)], nombres[rnd.nextInt(nombres.length)],
					rnd.nextInt(8000000, 60000000));
			a.setEdad(rnd.nextInt(18, 85));
			a.setMateriasAprobadas(12);
			a.setNroLE(rnd.nextInt(14000, 25000));
			a.setPromedio(rnd.nextDouble(10.0));
			if (a.getEdad() % 2 == 0) {
				a.setSexo('M');
			} else {
				a.setSexo('H');
			}

			lista.add(a);
		}

		Profesor p1 = new Profesor("Carpio", "Mariano Claudio", 30675834);
		p1.setEdad(46);
		p1.setLegajo(10438);
		p1.setSexo('H');
		p1.setTitulo("Ing. en Sistemas");

		lista.add(p1);

		Profesor p2 = new Profesor("Zapata Icart", "Ernesto A", 23835943);
		p2.setEdad(50);
		p2.setLegajo(8698);
		p2.setSexo('H');
		p2.setTitulo("-");

		lista.add(p2);

		return lista;

	}
}
