package figurasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicioFiguras.Losango;

class LosangoTest {
	
	Losango losango;
	
	@BeforeEach
	void preparacao() {
		
		losango = new Losango(8,4);
	}

	@Test
	void test_losango_area() {
		
		double resultado = losango.area();
		assertEquals(32 ,resultado,0.001);
		
	}
	
	@Test
	void test_losango_perimetro() {
		
		double resultado = losango.perimetro();
		assertEquals(32, resultado);
	}
	
	@Test
	void test_perimetro() {
		
		double resultado = losango.perimetro();
		assertFalse (resultado != 32);
	}
	
	@Test
	void test_area() {
		
		double resultado = losango.area();
		assertTrue (resultado == 32);
	}

}
