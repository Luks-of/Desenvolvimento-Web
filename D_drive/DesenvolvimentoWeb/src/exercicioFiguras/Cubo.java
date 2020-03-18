package exercicioFiguras;

public class Cubo implements Solidos{

	private double aresta;
	
	public Cubo() {}

	public Cubo(double aresta) {
		this.aresta = aresta;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	@Override
	public double volume() {
		
		return Math.pow(aresta,3);
	}


	

}
