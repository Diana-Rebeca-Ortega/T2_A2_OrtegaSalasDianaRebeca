package edu.tecjerez.topicos.figuras.TresDimensiones;

public class Piramide {
	   double area;

	    public double obtenerAreaPiramide(double a, double b, double c, double h) {
	        // Calcula el perímetro de la base
	        double perimetroBase = a + b + c;

	        // Calcula la altura lateral
	        double alturaLateral = Math.sqrt(Math.pow(h, 2) + (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) / 4);

	        // Calcula el área de la pirámide
	        double areaPiramide = Math.sqrt(Math.pow(h, 2) + (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) / 4) * perimetroBase / 2;

	        return areaPiramide;
	    }

}
