package exercicioFiguras;

public abstract class Poligonos extends Figura{
	
	private double base;
	private double altura;


	public Poligonos(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	


	public double getBase() {
		return base;
	}
	
	
	public double getAltura() {
		return altura;
	}

	
	
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public abstract double area();
	
	@Override
	public abstract double perimetro();

}
