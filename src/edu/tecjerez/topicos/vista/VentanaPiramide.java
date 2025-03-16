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


import edu.tecjerez.topicos.figuras.TresDimensiones.Piramide;


public class VentanaPiramide {
		Piramide p1 = new Piramide();
	public void InterfasPiramide(JPanel panelPiramide, JPanel panel1) {
		
		
		
		JLabel txtFormulaHeron = new JLabel ("Calculo de area de una Piramide Triangular");
		txtFormulaHeron.setBounds(30,00, 500,200);	
		txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
		txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\piramide.png"));
		txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
		txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
		panelPiramide.add(txtFormulaHeron);
		
		JLabel txtLadoA =new JLabel ("Ingresa lado A de la base:");
		txtLadoA.setBounds(20,160,300,20);
		panelPiramide.add(txtLadoA);
		
		JTextField cajaA = new JTextField(30);
		cajaA.setBounds(185,160,200,20);
		panelPiramide.add(cajaA);
		
		JLabel txtLadoB =new JLabel ("Ingresa lado B de la base:");
		txtLadoB.setBounds(20,180,300,20);
		panelPiramide.add(txtLadoB);
		
		JTextField cajaB = new JTextField(30);
		cajaB.setBounds(185,180,200,20);
		panelPiramide.add(cajaB);
		
		JLabel txtLadoC =new JLabel ("Ingresa lado C de la base:");
		txtLadoC.setBounds(20,200,300,20);
		panelPiramide.add(txtLadoC);
		
		JTextField cajaC = new JTextField(30);
		cajaC.setBounds(185,200,200,20);
		panelPiramide.add(cajaC);
		
		JLabel txtaltura =new JLabel ("Ingresa altura de la piramide");
		txtaltura.setBounds(20,220,300,20);
		panelPiramide.add(txtaltura);
		
		JTextField cajaAltura = new JTextField(30);
		cajaAltura.setBounds(185,220,200,20);
		panelPiramide.add(cajaAltura);
		
		JButton btnCAceptar= new JButton(" Aceptar");
		btnCAceptar.setBounds(140,240,150,20);
		panelPiramide.add(btnCAceptar);
		JLabel txtResultado =new JLabel ("Resultado:");
		btnCAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText( "Resultado: "+ 
				p1.obtenerAreaPiramide(
						Double.parseDouble(cajaA.getText()),
						Double.parseDouble(cajaB.getText()),
						Double.parseDouble(cajaC.getText()),
						Double.parseDouble(cajaAltura.getText())
						
						)
						);
				
			}
		});
		
		
		txtResultado.setBounds(20,260,300,20);
		panelPiramide.add(txtResultado);
		
		

		
		panel1.add(panelPiramide);
		panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
		panel1.repaint();
		
		
	}
		
		
	}
		
		

