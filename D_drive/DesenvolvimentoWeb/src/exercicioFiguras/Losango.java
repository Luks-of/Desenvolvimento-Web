	package exercicioFiguras;

public class Losango extends Poligonos{
	
	public Losango(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double area() {
		
		return super.getAltura() *super.getBase();
	}
	
	@Override
	public double perimetro() {
		
		return super.getBase() * 4;
	}
}
