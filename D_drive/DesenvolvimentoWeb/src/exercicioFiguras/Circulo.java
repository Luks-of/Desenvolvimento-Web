package exercicioFiguras;

public class Circulo extends Figura{
	
	private double raio;
	
	public Circulo() {}
	
	public Circulo(double raio) {
		
		this.raio = raio;
	}
	
	public double getRaio() {
		
		return this.raio;
	}
	
	public void SetRaio (double raio) {
		
		this.raio = raio;
	}
	
	@Override
	public double area() {
		
		return Math.PI * raio *raio;
	}
	
	@Override
	public double perimetro() {
		
		return Math.PI * 2 *raio;
	}
	
	

}
