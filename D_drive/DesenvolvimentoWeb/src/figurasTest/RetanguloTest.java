package figurasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicioFiguras.Retangulo;

class RetanguloTest {
	
	Retangulo retangulo;
	
	@BeforeEach
	void preparacao () {
		
		retangulo = new Retangulo(16, 7);
	}

	@Test
	void test_retangulo_area() {
		
		double resultado = retangulo.area();
		assertEquals(112, resultado, 0.001);
		
	}
	@Test
	void test_retangulo_perimetro() {
		
		double resultado = retangulo.perimetro();
		assertEquals(46, resultado, 0.001);
	}
	
	@Test
	void test_perimetro() {
		
		double resultado = retangulo.perimetro();
		assertFalse (resultado != 46);
	}
	
	@Test
	void test_area() {
		
		double resultado = retangulo.area();
		assertTrue (resultado == 112);
	}
	
	@Test
	void test_diagonal() {
		double resultado = retangulo.calcDiagonal();
		assertTrue(resultado > 17.0 && resultado < 18.0);
	}
	
	
}
	

