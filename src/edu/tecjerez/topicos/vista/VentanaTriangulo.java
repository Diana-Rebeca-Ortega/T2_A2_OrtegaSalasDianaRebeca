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

import edu.tecjerez.topicos.figuras.triangulo;

class VentanaTriangulo{
	triangulo t1 = new triangulo();
	protected void InterfasTriangulo(JPanel panelTriangulo, JPanel panel1) {



		JLabel txtFormulaHeron = new JLabel ("Calculo de area de un triangulo con la formula de heron");
		txtFormulaHeron.setBounds(30,00, 500,200);	
		txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
		txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\Triangulo.png"));
		txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
		txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
		panelTriangulo.add(txtFormulaHeron);

		JLabel txtLadoA =new JLabel ("Ingresa lado A:");
		txtLadoA.setBounds(20,170,300,20);
		panelTriangulo.add(txtLadoA);

		JTextField cajaA = new JTextField(30);
		cajaA.setBounds(115,170,200,20);
		panelTriangulo.add(cajaA);

		JLabel txtLadoB =new JLabel ("Ingresa lado B:");
		txtLadoB.setBounds(20,190,300,20);
		panelTriangulo.add(txtLadoB);

		JTextField cajaB = new JTextField(30);
		cajaB.setBounds(115,190,200,20);
		panelTriangulo.add(cajaB);

		JLabel txtLadoC =new JLabel ("Ingresa lado C:");
		txtLadoC.setBounds(20,210,300,20);
		panelTriangulo.add(txtLadoC);

		JTextField cajaC = new JTextField(30);
		cajaC.setBounds(115,210,200,20);
		panelTriangulo.add(cajaC);

		JButton btnCAceptar= new JButton(" Aceptar");
		btnCAceptar.setBounds(140,230,150,20);
		panelTriangulo.add(btnCAceptar);
		JLabel txtResultado =new JLabel ("Resultado:");
		btnCAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText( "Resultado: "+ 
						t1.obtenerAreaTriangulo(
								Double.parseDouble(cajaA.getText()),
								Double.parseDouble(cajaB.getText()),
								Double.parseDouble(cajaC.getText()))
						);

			}
		});


		txtResultado.setBounds(20,250,300,20);
		panelTriangulo.add(txtResultado);




		panel1.add(panelTriangulo);
		panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
		panel1.repaint();


	}


}



