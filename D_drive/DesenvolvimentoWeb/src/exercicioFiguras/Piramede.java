package exercicioFiguras;

public class Piramede implements Solidos{
	
	private double base;
	private double altura;
	
	public Piramede() {}
	
	public Piramede(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	public double volume () {
		
		return ((base * base) * altura) / 3;
	}
	
	
	
	

}
