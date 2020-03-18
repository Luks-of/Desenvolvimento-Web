package exercicioFiguras;

public class Esfera implements Solidos{
	
	private double raio;
	
	public Esfera () {}

	public Esfera(double raio) {
		
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double volume () {
		
		return  (4 *Math.pow(raio, 2))/3;
	}

}
