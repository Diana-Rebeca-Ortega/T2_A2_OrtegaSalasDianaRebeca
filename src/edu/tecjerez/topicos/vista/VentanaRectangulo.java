package edu.tecjerez.topicos.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import edu.tecjerez.topicos.figuras.figuras;
import edu.tecjerez.topicos.figuras.triangulo;
import edu.tecjerez.topicos.figuras.figuras.Rectangulo;

public class VentanaRectangulo {
	figuras.Rectangulo r1 = new figuras().new Rectangulo();
public void InterfasTriangulo(JPanel panelRectangulo, JPanel panel1) {
	
	
	
	JLabel txtFormulaHeron = new JLabel ("Calculo de area de un Rectangulo");
	txtFormulaHeron.setBounds(30,00, 600,200);	
	txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
	txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\rec.png"));
	txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
	txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
	panelRectangulo.add(txtFormulaHeron);
	
	JLabel txtLadoA =new JLabel ("Ingresa lado B:");
	txtLadoA.setBounds(20,170,300,20);
	panelRectangulo.add(txtLadoA);
	
	JTextField cajaA = new JTextField(30);
	cajaA.setBounds(115,170,200,20);
	panelRectangulo.add(cajaA);
	
	JLabel txtLadoB =new JLabel ("Ingresa lado H:");
	txtLadoB.setBounds(20,190,300,20);
	panelRectangulo.add(txtLadoB);
	
	JTextField cajaB = new JTextField(30);
	cajaB.setBounds(115,190,200,20);
	panelRectangulo.add(cajaB);
	
	
	JButton btnCAceptar= new JButton(" Aceptar");
	btnCAceptar.setBounds(140,230,150,20);
	panelRectangulo.add(btnCAceptar);
	JLabel txtResultado =new JLabel ("Resultado:");
	btnCAceptar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			txtResultado.setText( "Resultado: "+ 
			r1.obtenerAreaRectangulo(
			
					Double.parseDouble(cajaA.getText()),
					Double.parseDouble(cajaB.getText())
					));
			
		}
	});
	
	
	txtResultado.setBounds(20,250,300,20);
	panelRectangulo.add(txtResultado);
	
	

	
	panel1.add(panelRectangulo);
	panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
	panel1.repaint();
	
	
}
	
	
}
	
	

