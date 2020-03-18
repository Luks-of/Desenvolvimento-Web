package figurasTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicioFiguras.Triangulo;

class TrianguloTest {
	
	Triangulo triangulo;
	
	@BeforeEach
	void preparacao () {
		
		triangulo = new Triangulo (8, 6.93);
	}
	
	@Test
	
	void test_triangulo_area() {
		
		double resultado = triangulo.area();
		assertEquals(27.72, resultado,0.01);
	}
	
	@Test
	void test_triangulo_perimetro() {
		
		double resultado = triangulo.perimetro();
		assertEquals(24, resultado, 0.001);
	}
	
	@Test
	void test_perimetro() {
		
		double resultado = triangulo.perimetro();
		assertFalse (resultado != 24);
	}
	
	@Test
	void test_area() {
		
		double resultado = triangulo.area();
		assertTrue (resultado == 27.72);
	}
	
}
