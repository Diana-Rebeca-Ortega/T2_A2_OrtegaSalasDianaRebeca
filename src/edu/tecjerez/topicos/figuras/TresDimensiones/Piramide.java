package edu.tecjerez.topicos.figuras.TresDimensiones;

public class Piramide {
	   double area;

	    public double obtenerAreaPiramide(double a, double b, double c, double h) {
	    	  double s = (a + b + c) / 2;
	          double areaBase = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	          double volumen = (1.0 / 3.0) * areaBase * h;

	        return volumen;
	    }

}
