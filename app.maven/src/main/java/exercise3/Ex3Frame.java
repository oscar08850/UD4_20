package exercise3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ex3Frame extends JFrame {

	private JPanel contentPane;
	int cont1=0, cont2=0;

	/**
	 * Create the frame.
	 */
	public Ex3Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(71, 61, 107, 34);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(246, 61, 107, 34);
		contentPane.add(btn2);
		
		JLabel etiqueta1 = new JLabel("Boton 1: 0 veces");
		etiqueta1.setBounds(71, 16, 108, 34);
		contentPane.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Boton 2: 0 veces");
		etiqueta2.setBounds(248, 16, 105, 34);
		contentPane.add(etiqueta2);
		
		//evento boton 1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont1++;
				etiqueta1.setText("Boton 1: " + cont1 + " veces");
			}
		});
		
		//evento boton 2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont2++;
				etiqueta2.setText("Boton 2: " + cont2 + " veces");
			}
		});
		
		setVisible(true);
	}
}
