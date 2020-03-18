package exercicioFiguras;

public class Quadrado extends Poligonos implements Diagonal{
	
	
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		
		return super.getAltura()*super.getAltura();
	}
	
	@Override
	public double perimetro() {
		
		return super.getAltura() * 4;
	}
	
	@Override
	public double calcDiagonal() {
		
		return super.getBase() * Math.sqrt(2);
	}
}	


