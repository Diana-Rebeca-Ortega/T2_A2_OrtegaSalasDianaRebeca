package edu.tecjerez.topicos.figuras;

public class figuras {
	//CLASS INTERNA
	 public class Rectangulo {
		//Obtencion del area del rextangulo
		
		double base;
		double altura;
		double area;
		public double obtenerAreaRectangulo(double base, double altura) {
			area= base*altura;
			return area;	
		}
	}
}
