package exercise1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1Frame extends JFrame {

	private JPanel contentPane;
	private int sizeFont = 12;


	/**
	 * Create the frame.
	 */
	public Ex1Frame() {

		setTitle("Titulo Actividad 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEtiqueta = new JLabel("Etiqueta");
		lblEtiqueta.setBounds(24, 0, 399, 211);
		contentPane.add(lblEtiqueta);

		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sizeFont++;
				lblEtiqueta.setFont(new Font("Dialog", Font.BOLD, sizeFont));
			}
		});
		button.setBounds(265, 279, 117, 25);
		contentPane.add(button);

		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (sizeFont >= 1) { //Controlamos que el tamaño no baje de 0
					sizeFont--;
				}
				lblEtiqueta.setFont(new Font("Dialog", Font.BOLD, sizeFont));
			}
		});
		button_1.setBounds(426, 279, 117, 25);
		contentPane.add(button_1);

		setVisible(true);
	}

}
