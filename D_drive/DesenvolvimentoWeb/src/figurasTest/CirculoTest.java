package figurasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicioFiguras.Circulo;

class CirculoTest {

	Circulo circulo;

	@BeforeEach
	void preparacao() {

		circulo = new Circulo(3);
	}

	@Test
	void test_area_circulo() {

		double resultado = circulo.area();
		assertEquals(28.274, resultado, 0.001);
	}

	@Test
	void test_perimetro_circulo() {

		double resultado = circulo.perimetro();
		assertEquals(18.849, resultado, 0.001);
	}
	
	@Test
	void test_perimetro() {
		
		double resultado = circulo.perimetro();
		assertFalse (resultado == 0);
	}
	
	@Test
	void test_area() {
		
		double resultado = circulo.area();
		assertTrue (resultado == 28.274333882308138);
	}
	

}
