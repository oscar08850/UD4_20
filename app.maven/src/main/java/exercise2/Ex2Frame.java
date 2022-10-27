package exercise2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2Frame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Ex2Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(188, 34, 107, 34);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(305, 34, 107, 34);
		contentPane.add(btn2);
		
		JLabel etiqueta = new JLabel("Has pulsado:");
		etiqueta.setBounds(10, 34, 168, 34);
		contentPane.add(etiqueta);
		
		//evento boton 1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado: " +btn1.getText());
			}
		});
		
		//evento boton 2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado: " +btn2.getText());
			}
		});
		
		setVisible(true);
	}
}
