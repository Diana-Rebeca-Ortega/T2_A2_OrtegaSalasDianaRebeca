package edu.tecjerez.topicos.vista;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import edu.tecjerez.topicos.figuras.figuras;
import edu.tecjerez.topicos.figuras.triangulo;
import edu.tecjerez.topicos.figuras.DosDimensiones.Conicos;


public class VentanaInicio extends JFrame {
	JMenu btnOtras;
	JMenuItem Triangulo;
	//VENTANAS
	VentanaTriangulo ventanitaTriangulo = new VentanaTriangulo();
	VentanaRectangulo ventanitaRectangulo = new VentanaRectangulo();
	VentanaCirculo venCirculo= new  VentanaCirculo();
	VentanaElipe venElipse = new VentanaElipe();
	VentanaRombo venRombo = new VentanaRombo();
	VentanaCono venCono = new VentanaCono();
	VentanaPiramide venPiramide = new VentanaPiramide();
	//LOGICA 
	//triangulo t1 = new triangulo();
	//figuras.Rectangulo r1 = new figuras().new Rectangulo();
	





	public VentanaInicio() {
		getContentPane().setBackground(new Color (255, 249, 176) );
		setSize(700, 530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Calculando AREAS de Figuras ");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel titulo = new JLabel ("CALCULO DE AREAS MÁGICAS");
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(130, 15, 600, 40);
		add(titulo);

		JButton cajaGeometria = new JButton("GEOMETRÍA");
		cajaGeometria.setFont(new Font("Georgia", Font.BOLD, 20));
		cajaGeometria.setBackground(new Color (255,190,229));
		cajaGeometria.setBounds(10, 55, 300, 40);
		add(cajaGeometria);

		JButton cajaFiguras = new JButton("FIGURAS");
		cajaFiguras.setFont(new Font("Georgia", Font.BOLD, 20));
		cajaFiguras.setBackground(new Color (255,190,229));
		cajaFiguras.setBounds(350,55, 300, 40);
		add(cajaFiguras);

		cajaFiguras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JDesktopPane desktopPane = new JDesktopPane();

				JInternalFrame    InternalFrame = new JInternalFrame();
				InternalFrame.setSize(670,350);//medida del internal frame

				InternalFrame.setVisible(true);//para que se vea la ventana 
				InternalFrame.setClosable(true);
				InternalFrame.setMaximizable(true);
				InternalFrame.setIconifiable(true);
				InternalFrame.setResizable(true);
				desktopPane.setBackground(new Color (255, 249, 176));//color de fondo al cerrar la ventana
				desktopPane.setBounds(10, 100, 670, 360);//Medida de donde puede ser visible el Internal FRame
				desktopPane.add(InternalFrame);
				add(desktopPane);

				//****************Panel 1---------------------------------------------------------------				
				JPanel panel1 = new JPanel();
				panel1.setLayout(null);
				panel1.setBounds(5, 5, 770, 150);
				panel1.setBackground(new Color(255, 236  , 247));

				JMenuBar menuBar = new JMenuBar();//DECLARACION DEL MENU BAR
				menuBar.setBounds(0, 0, 830,30);


				JMenu btnDosDimensiones  = new JMenu("2D");/////////////////////////////////////////////////
				menuBar.add(btnDosDimensiones);

				JMenu Conicos = new JMenu ("Conicos");
				btnDosDimensiones.add(Conicos);

				JMenuItem Circulo = new JMenuItem ("Circulo");
				Conicos.add(Circulo);
				Circulo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelCirculo = new JPanel();
						panelCirculo.setLayout(null);
						panelCirculo.setBounds(30,30, 600, 280);
						panelCirculo.setBackground(new Color(213, 229, 213 ));
						venCirculo.InterfasCirculo(panelCirculo, panel1);
						
					}
				});

				JMenuItem Elipse = new JMenuItem ("Elipse");
				Conicos.add(Elipse);
				Elipse.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelElipse = new JPanel();
						panelElipse.setLayout(null);
						panelElipse.setBounds(30,30, 600, 280);
						panelElipse.setBackground(new Color(112, 227, 213 ));
						venElipse.InterfasElipse(panelElipse, panel1);
						
					}
				});

				JMenu Poligono = new JMenu ("Poligono");
				btnDosDimensiones.add(Poligono);

				JMenuItem Rombo = new JMenuItem ("Rombo");
				Poligono.add(Rombo);
				Rombo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelRombo = new JPanel();
						panelRombo.setLayout(null);
						panelRombo.setBounds(30,30, 600, 280);
						panelRombo.setBackground(new Color(219, 178, 245 ));
						venRombo.InterfasRombo(panelRombo, panel1);
						
					}
				});

				JMenu btnTresDimensiones= new JMenu("3D");///////////////////////////////////////////////
				menuBar.add(btnTresDimensiones);

				JMenuItem Cono = new JMenuItem ("Cono");
				btnTresDimensiones.add(Cono);
				Cono.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelCono = new JPanel();
						panelCono.setLayout(null);
						panelCono.setBounds(30,30, 600, 280);
						panelCono.setBackground(new Color(219, 178, 245 ));
						venCono.InterfasCono(panelCono, panel1);
						
					}
				});

				JMenuItem Piramide = new JMenuItem ("Piramide");
				btnTresDimensiones.add(Piramide);
				Piramide.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelPiramide = new JPanel();
						panelPiramide.setLayout(null);
						panelPiramide.setBounds(30,30, 600, 280);
						panelPiramide.setBackground(new Color(230, 70, 165 ));
						venPiramide.InterfasPiramide(panelPiramide, panel1);
						
					}
				});
				

				btnOtras = new JMenu("Otras");/////////////////////////////////////////////BOTON OTROS
				menuBar.add(btnOtras);

				Triangulo = new JMenuItem ("Triangulo");
				btnOtras.add(Triangulo);
				
				Triangulo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelTriangulo = new JPanel();
						panelTriangulo.setLayout(null);
						panelTriangulo.setBounds(30,30, 600, 280);
						panelTriangulo.setBackground(new Color(255, 193, 180 ));
						ventanitaTriangulo.InterfasTriangulo(panelTriangulo, panel1);

					}

				});

				JMenuItem Rectangulo = new JMenuItem ("Rectangulo");
				btnOtras.add(Rectangulo);
				Rectangulo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel panelRectangulo = new JPanel();
						panelRectangulo.setLayout(null);
						panelRectangulo.setBounds(30,30, 600, 280);
						panelRectangulo.setBackground(new Color(221, 235, 157 ));
						ventanitaRectangulo.InterfasTriangulo(panelRectangulo, panel1);
						
					}
				});

				setJMenuBar(menuBar);
				panel1.add(menuBar);
				InternalFrame.add(panel1);
			}

		});

	}



}
