package exercicioFiguras;

public class Triangulo extends Poligonos {

	// CONSTRUTOR
	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {

		return (super.getAltura() * super.getBase()) / 2;

	}

	@Override

	public double perimetro() {

		return super.getBase() + super.getBase() + super.getBase();
	}

}
