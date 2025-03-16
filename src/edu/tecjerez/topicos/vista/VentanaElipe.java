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
import edu.tecjerez.topicos.figuras.DosDimensiones.Conicos;
import edu.tecjerez.topicos.figuras.DosDimensiones.Conicos.Circulo;

class VentanaElipe {
	Conicos.Elipse e1 = new Conicos().new Elipse();
	protected void InterfasElipse(JPanel panelElipse, JPanel panel1) {



		JLabel txtFormulaHeron = new JLabel ("Calculo de area de una elipse");
		txtFormulaHeron.setBounds(30,00, 500,200);	
		txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
		txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\elipse.png"));
		txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
		txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
		panelElipse.add(txtFormulaHeron);

		JLabel txtLadoA =new JLabel ("Ingresa semieje Mayor:");
		txtLadoA.setBounds(20,170,300,20);
		panelElipse.add(txtLadoA);

		JTextField cajaA = new JTextField(30);
		cajaA.setBounds(165,170,200,20);
		panelElipse.add(cajaA);

		JLabel txtLadoB =new JLabel ("Ingresa semieje Menor:");
		txtLadoB.setBounds(20,190,300,20);
		panelElipse.add(txtLadoB);

		JTextField cajaB = new JTextField(30);
		cajaB.setBounds(165,190,200,20);
		panelElipse.add(cajaB);



		JButton btnCAceptar= new JButton(" Aceptar");
		btnCAceptar.setBounds(140,230,150,20);
		panelElipse.add(btnCAceptar);
		JLabel txtResultado =new JLabel ("Resultado:");
		btnCAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText( "Resultado: "+ 
						e1.obtenerAreaElipse(
								Double.parseDouble(cajaA.getText()),
								Double.parseDouble(cajaB.getText())
								)
						);

			}
		});


		txtResultado.setBounds(20,250,300,20);
		panelElipse.add(txtResultado);




		panel1.add(panelElipse);
		panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
		panel1.repaint();


	}


}



