package edu.tecjerez.topicos.vista;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import edu.tecjerez.topicos.figuras.figuras;
import edu.tecjerez.topicos.figuras.triangulo;

//import edu.tecjerez.topicos.figuras.circulo;




public class VentanaInicio extends JFrame{
	//circulo c1 = new circulo(); //No se puede usar porque el modificador de acceso es default 
	
	triangulo t1 = new triangulo();
	figuras f1 = new figuras();
	//Rectanguo r1 = new Rectangulo// no se puede instanciar una subclase de esta manera
	
	//FORMA CORRECTA DE instancias una clase interna ////siiiiiiiiiiiiiiiiiiiiiiiiii esta correcto 
	figuras.Rectangulo r1 = new figuras().new Rectangulo();
	
	public VentanaInicio() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
