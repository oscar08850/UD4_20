package exercise4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Ex4Frame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Ex4Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(147, 25, 236, 214);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(40, 121, 70, 15);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}
}
