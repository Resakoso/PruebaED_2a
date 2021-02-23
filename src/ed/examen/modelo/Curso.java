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
	 * @param dni Aquí se iserta el dni de la persona
	 *  
	 * @throws Exception Comprueba que el dni esta bien de lo contrario lanza un error.
	 * 	
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Un metodo para añadir un alumno.
	 * 
	 * @param p Añades aqui la persona
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * Un booleano que compruebe si el dni que metes está registrado.
	 * 
	 * @param dni Introduce el dni.
	 * 
	 * @return Devuelve true si el dni insertado coincide con uno de la lista.
	 */
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
	
	
	/**
	 * Un constructor que inicializa un arrayList
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}

	
	
	/**
	 * @return Devuelve la longitud de la lista 
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	/**
	 * Muestra todos los alumnos en la lista
	 */
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}

	public List<Persona> getListaAlumnos() {
		return listaAlumnos;
	}
	
}
