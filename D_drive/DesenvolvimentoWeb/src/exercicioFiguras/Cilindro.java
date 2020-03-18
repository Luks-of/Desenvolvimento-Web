package exercicioFiguras;

public class Cilindro implements Solidos{
	
	private double raio;
	private double altura;
	
	
	public Cilindro(double raio, double altura) {

		this.raio = raio;
		this.altura = altura;
	}
	
	
	public double getAltura() {
		return altura;
	}

	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double volume() {
		
		return Math.PI * Math.pow(raio, 2) * altura;	
	}

}
