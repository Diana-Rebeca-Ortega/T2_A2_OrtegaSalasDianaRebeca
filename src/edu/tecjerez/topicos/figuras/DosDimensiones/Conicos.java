package edu.tecjerez.topicos.figuras.DosDimensiones;

public class Conicos {
	public class Circulo {

		double area;
		public double obtenerAreaCirculo(double radio) {
			area= Math.PI * (radio*radio);
			return area;	
		}
	}
	public class Elipse {
		double area;
		public double obtenerAreaElipse(double semiejeMayor, double semiejeMenor) {
			area= Math.PI *( semiejeMayor*semiejeMenor);
			return area;	
		}
	}
}
