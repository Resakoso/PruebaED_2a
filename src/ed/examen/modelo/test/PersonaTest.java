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
		assertEquals("12345678s", p.getDni());
	}

	@Test
	void testSetDni() {
		//Clase v�lida
				try {
					p.setDni("12345678Q");
				} catch (Exception e) {
					e.printStackTrace();
				}
				assertEquals("12345678Q", p.getDni());
				
				//Clase inv�lida
				boolean exceptionLanzada= false;
				
				try {
					p.setDni("123456789");
				} catch (Exception e) {
					exceptionLanzada= true;
				}
				assertTrue(exceptionLanzada);
	}

	@Test
	void testGetNombre() {
		assertEquals("nombre", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("allan");
		assertEquals("allan", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("apellido1",p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("lopez");
		assertEquals("lopez", p.getApellido1());
	}

}
