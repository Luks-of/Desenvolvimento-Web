package exercicioFiguras;

import java.util.ArrayList;
import java.util.Scanner;

public class Geometria {

	public static void main(String args[]) {

//		ArrayList<Figura> lista = new ArrayList<Figura>();
//
//		lista.add(new Circulo(3));
//		lista.add(new Losango(1,2));
//		lista.add(new Quadrado(2,2));
//		lista.add(new Triangulo (6.93,8));
//		lista.add(new Cubo(5,5,5));
//
//		for (Figura e : lista) {
//
//			System.out.println(e.area());
//			System.out.println(e.perimetro());
//		}

		ArrayList<Diagonal> lista2 = new ArrayList<Diagonal>();

		lista2.add(new Quadrado(4, 4));
		lista2.add(new Retangulo(16, 7));

		for (Diagonal d : lista2) {

			System.out.println(d.calcDiagonal());
		}
//
//		ArrayList<Solidos> lista3 = new ArrayList<Solidos>();
//
//		lista3.add(new Cubo(4));
//		lista3.add(new Cilindro(10, 10));
//		lista3.add(new Piramede(10, 10));
//
//		for (Solidos s : lista3) {
//
//			System.out.println(s.volume());
//		}

	}

}
