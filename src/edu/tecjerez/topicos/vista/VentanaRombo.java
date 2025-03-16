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
import edu.tecjerez.topicos.figuras.DosDimensiones.Poligono;
import edu.tecjerez.topicos.figuras.figuras.Rectangulo;

	public class VentanaRombo {
		Poligono.Rombo R1 = new Poligono().new Rombo();
		protected void InterfasRombo(JPanel panelRombo, JPanel panel1) {
		
		
		
		JLabel txtFormulaHeron = new JLabel ("Calculo de area de un Rombo");
		txtFormulaHeron.setBounds(30,00, 500,200);	
		txtFormulaHeron.setFont(new Font("Georgia", Font.BOLD, 16));
		txtFormulaHeron.setIcon(new ImageIcon("C:\\Users\\Marcelo\\eclipse-workspace\\Sesion10_Componentes y librerias\\src\\edu\\tecjerez\\topicos\\vista\\ICONOS\\rombo.png"));
		txtFormulaHeron.setHorizontalTextPosition( SwingConstants.CENTER );// Texto en el centro y debajo del icono
		txtFormulaHeron.setVerticalTextPosition( SwingConstants.BOTTOM );// Texto en el centro y debajo del icono
		panelRombo.add(txtFormulaHeron);
		
		JLabel txtLadoA =new JLabel ("Ingresa diagonal 1:");
		txtLadoA.setBounds(20,180,300,20);
		panelRombo.add(txtLadoA);
		
		JTextField cajaA = new JTextField(30);
		cajaA.setBounds(125,180,200,20);
		panelRombo.add(cajaA);
		
		JLabel txtLadoB =new JLabel ("Ingresa diagonal 2:");
		txtLadoB.setBounds(20,200,300,20);
		panelRombo.add(txtLadoB);
		
		JTextField cajaB = new JTextField(30);
		cajaB.setBounds(125,200,200,20);
		panelRombo.add(cajaB);
		
		JButton btnCAceptar= new JButton(" Aceptar");
		btnCAceptar.setBounds(140,230,150,20);
		panelRombo.add(btnCAceptar);
		JLabel txtResultado =new JLabel ("Resultado:");
		btnCAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText( "Resultado: "+ 
				R1.obtenerAreaRombo(
						Double.parseDouble(cajaA.getText()),
						Double.parseDouble(cajaB.getText())
						)
						);
				
			}
		});
		
		
		txtResultado.setBounds(20,250,300,20);
		panelRombo.add(txtResultado);
		
		

		
		panel1.add(panelRombo);
		panel1.revalidate();//para que el panel no se abra en miniatura y se actualice el nuevo panel 
		panel1.repaint();
		
		
	}
		
		
	}
		
		

