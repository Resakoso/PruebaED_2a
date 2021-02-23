package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {

	Persona p = new Persona("12345678s", "nombre", "apellido1");
	
	@Test
	void testPersonaStringStringString() {
		assertEquals("12345678s", p.getDni());
		assertEquals("nombre", p.getNombre());
		assertEquals("apellido1", p.getApellido1());
	}

	@Test
	void testGetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
