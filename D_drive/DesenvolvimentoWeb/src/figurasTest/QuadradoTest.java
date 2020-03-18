package figurasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exercicioFiguras.Quadrado;

class QuadradoTest {
	
	Quadrado quadrado;

	@BeforeEach
	void preparacao() {
		
		quadrado = new Quadrado(4,4);
	}
	
	@Test
	void test_calcular_area() {
		
		double resultado = quadrado.area();
		assertEquals(16, resultado);
	}
	
	@Test
	void test_calcular_perimetro() {
		
		double resultado = quadrado.perimetro();
		assertEquals(16, resultado);
	}
	
	@Test
	void test_perimetro() {
		
		double resultado = quadrado.perimetro();
		assertFalse (resultado != 16);
	}
	
	@Test
	void test_area() {
		
		double resultado = quadrado.area();
		assertTrue (resultado == 16);
	}
	
	@Test
	void test_diagonal() {
		double resultado = quadrado.calcDiagonal();
		assertTrue(resultado > 5.0 && resultado < 6.0);
	}
	
	
}
