package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ed.examen.modelo.*;


import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
	
	Curso c = new Curso();
	Persona p = new Persona("123456789Z", "Carlos", "Saenz");
	
	@Test
	void testEliminarAlumno() {
		
		//clase valida
		boolean lanzaException= false;
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e) {
			lanzaException= true;
		}
		assertFalse(lanzaException);
		
		
		//clase invalida
		
		lanzaException = false;
		try {
			c.eliminarAlumno("1234567");
		} catch (Exception e) {
			lanzaException= true;
		}
		assertTrue(lanzaException);
	}

	@Test
	void testAniadirAlumno() {
		
		int sizeBefore=c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter=c.numeroAlumnos();
		assertEquals(sizeBefore,sizeAfter-1);
	}

	@Test
	void testEstaRegistrado() {
		assertFalse(c.estaRegistrado(p.getDni()));
		
	}

	@Test
	void testCurso() {
		//?¿?¿?¿
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
