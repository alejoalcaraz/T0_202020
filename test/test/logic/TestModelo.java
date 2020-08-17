package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		setUp2();
		assertEquals(100, modelo.darTamano());// TODO
	}

	@Test
	public void testAgregar() {
		modelo.agregar(1);
		assertEquals(1,modelo.darTamano());
		// TODO Completar la prueba
	}

	@Test
	public void testBuscar() {
		setUp2();
		assertNotNull("Error buscando",modelo.buscar(2));
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		modelo.eliminar(10);
		assertNotEquals(100, modelo.darTamano());
		// TODO Completar la prueba
		
	}

}
