package ed.examen.modelo.test;

import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;
import ed.examen.modelo.Curso;
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
		fail("Not yet implemented");
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
