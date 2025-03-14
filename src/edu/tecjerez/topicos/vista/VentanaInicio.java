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

//import edu.tecjerez.topicos.figuras.circulo;




public class VentanaInicio extends JFrame {
	JMenu btnOtras;
	JMenuItem Triangulo;
	//circulo c1 = new circulo(); //No se puede usar porque el modificador de acceso es default 

	triangulo t1 = new triangulo();

	figuras f1 = new figuras();


	//Rectanguo r1 = new Rectangulo// no se puede instanciar una subclase de esta manera

	//FORMA CORRECTA DE instancias una clase interna ////siiiiiiiiiiiiiiiiiiiiiiiiii esta correcto 
	figuras.Rectangulo r1 = new figuras().new Rectangulo();


	Conicos conic = new Conicos();
	Conicos.Circulo c1 = new Conicos().new Circulo();




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

				JMenuItem Elipse = new JMenuItem ("Elipse");
				Conicos.add(Elipse);

				JMenu Poligono = new JMenu ("Poligono");
				btnDosDimensiones.add(Poligono);

				JMenuItem Rombo = new JMenuItem ("Rombo");
				Poligono.add(Rombo);

				JMenu btnTresDimensiones= new JMenu("3D");///////////////////////////////////////////////
				menuBar.add(btnTresDimensiones);

				JMenuItem Cono = new JMenuItem ("Cono");
				btnTresDimensiones.add(Cono);

				JMenuItem Piramide = new JMenuItem ("Piramide");
				btnTresDimensiones.add(Piramide);

				btnOtras = new JMenu("Otras");/////////////////////////////////////////////BOTON OTROS
				menuBar.add(btnOtras);

				Triangulo = new JMenuItem ("Triangulo");
				btnOtras.add(Triangulo);
				VentanaTriangulo ventanitaTriangulo = new VentanaTriangulo();
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

				setJMenuBar(menuBar);
				panel1.add(menuBar);
				InternalFrame.add(panel1);
			}

		});

	}



}
