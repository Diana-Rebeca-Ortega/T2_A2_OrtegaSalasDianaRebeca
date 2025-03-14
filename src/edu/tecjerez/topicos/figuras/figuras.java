package edu.tecjerez.topicos.figuras;

public class figuras {
	//CLASS INTERNA
	 public class Rectangulo {
		//Obtencion del area del rextangulo
		double area;
		double base;
		double altura;
		
		public double obtenerAreaRectangulo(double area, double base, double altura) {
			area= base*altura;
			return area;	
		}
	}
}
