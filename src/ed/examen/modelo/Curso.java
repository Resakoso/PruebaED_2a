package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author javirsk00_
 *
 */
public class Curso {
	
	private List<Persona> listaAlumnos;

	
	/**
	 * @param dni
	 *  Aqu� se iserta el dni de la persona
	 * @throws Exception: Comprueva que el dni esta bien de lo contrario lanza un error.
	 * 	
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */

	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}

	/*
	 * Documentar y crear test unitario
	 * */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
