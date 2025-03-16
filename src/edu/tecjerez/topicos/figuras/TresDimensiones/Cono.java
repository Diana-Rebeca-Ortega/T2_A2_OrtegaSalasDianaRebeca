package edu.tecjerez.topicos.figuras.TresDimensiones;

public class Cono {
	double area;
		public double obtenerAreaCono(double radio, double altura) {
			double aBase=Math.PI * Math.pow(radio, 2) ;
			double alateral= Math.PI * radio * Math.sqrt( Math.pow(altura, 2)+Math.pow(radio, 2));
			
			area= aBase+ alateral;
			return alateral;	
		
	}

}
