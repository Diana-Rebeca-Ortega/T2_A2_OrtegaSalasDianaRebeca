package edu.tecjerez.topicos.figuras;

public class triangulo {

	public double obtenerAreaTriangulo(double ladoA, double ladoB, double ladoC ) {
		double s = (ladoA + ladoB+ ladoC) / 2;
		double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

		return area;

	}

}
