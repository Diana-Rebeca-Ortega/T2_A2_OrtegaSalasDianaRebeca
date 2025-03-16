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


import edu.tecjerez.topicos.figuras.TresDimensiones.Cono;


public class VentanaCono {
		Cono c1 = new Cono();
	public void InterfasCono(JPanel panelCono, JPanel panel1) {
		
		
		
		JLabel txtFormulaHeron = new JLabel ("Calculo de volumen de un Cono");
		txtFormulaHeron.setBounds(30,00, 500,200);	
		txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
		txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\cono.png"));
		txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
		txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
		panelCono.add(txtFormulaHeron);
		
		JLabel txtLadoA =new JLabel ("Ingresa radio:");
		txtLadoA.setBounds(20,180,300,20);
		panelCono.add(txtLadoA);
		
		JTextField cajaA = new JTextField(30);
		cajaA.setBounds(125,180,200,20);
		panelCono.add(cajaA);
		
		JLabel txtLadoB =new JLabel ("Ingresa altura:");
		txtLadoB.setBounds(20,200,300,20);
		panelCono.add(txtLadoB);
		
		JTextField cajaB = new JTextField(30);
		cajaB.setBounds(125,200,200,20);
		panelCono.add(cajaB);
		
		JButton btnCAceptar= new JButton(" Aceptar");
		btnCAceptar.setBounds(140,230,150,20);
		panelCono.add(btnCAceptar);
		JLabel txtResultado =new JLabel ("Resultado:");
		btnCAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText( "Resultado: "+ 
				c1.obtenerAreaCono(
						Double.parseDouble(cajaA.getText()),
						Double.parseDouble(cajaB.getText())
						)
						);
				
			}
		});
		
		
		txtResultado.setBounds(20,250,300,20);
		panelCono.add(txtResultado);
		
		

		
		panel1.add(panelCono);
		panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
		panel1.repaint();
		
		
	}
		
		
	}
		
		

