package exercicioFiguras;

public class Retangulo extends Poligonos implements Diagonal{
	
	public Retangulo (double base, double altura) {
		
		super(base, altura);
	}
	
	@Override
	public double area() {
		
		return super.getAltura()* super.getBase();
		
	}
	
	@Override
	public double perimetro() {
		
		return super.getAltura() + super.getAltura() + super.getBase() + super.getBase();
	}
	
	@Override
	public double calcDiagonal() {
		
		return Math.sqrt(Math.pow(getAltura(),2) + Math.pow(getBase(),2));
	}

}
