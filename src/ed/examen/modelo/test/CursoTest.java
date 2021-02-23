package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ed.examen.modelo.*;


import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
	
	Curso c = new Curso();

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
		Persona p = new Persona("123456789Z", "Carlos", "Saenz");
		int sizeBefore=c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter=c.numeroAlumnos();
		assertEquals(sizeBefore,sizeAfter-1);
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
