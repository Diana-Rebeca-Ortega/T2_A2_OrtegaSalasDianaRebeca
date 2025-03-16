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
import edu.tecjerez.topicos.figuras.DosDimensiones.Conicos;
import edu.tecjerez.topicos.figuras.figuras.Rectangulo;

class VentanaCirculo {
	Conicos.Circulo c1 = new Conicos().new Circulo();
	protected void InterfasCirculo(JPanel panelCirculo, JPanel panel1) {



		JLabel txtFormulaHeron = new JLabel ("Calculo de area de un circulo");
		txtFormulaHeron.setBounds(30,00, 500,200);	
		txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
		txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\circulo.png"));
		txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
		txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
		panelCirculo.add(txtFormulaHeron);

		JLabel txtLadoA =new JLabel ("Ingresa radio:");
		txtLadoA.setBounds(20,170,300,20);
		panelCirculo.add(txtLadoA);

		JTextField cajaA = new JTextField(30);
		cajaA.setBounds(115,170,200,20);
		panelCirculo.add(cajaA);


		JButton btnCAceptar= new JButton(" Aceptar");
		btnCAceptar.setBounds(140,230,150,20);
		panelCirculo.add(btnCAceptar);
		JLabel txtResultado =new JLabel ("Resultado:");
		btnCAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText( "Resultado: "+ 
						c1.obtenerAreaCirculo(
								Double.parseDouble(cajaA.getText()))
						);

			}
		});


		txtResultado.setBounds(20,250,300,20);
		panelCirculo.add(txtResultado);




		panel1.add(panelCirculo);
		panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
		panel1.repaint();


	}


}



