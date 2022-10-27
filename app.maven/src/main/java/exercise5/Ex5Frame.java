package exercise5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class Ex5Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ex5Frame() {

		setTitle("Todos los eventos del ratón");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.setText(textArea.getText() + "\n" + "El usuario ha pulsado el ratón en el campo de texto");

			}
		});
		textArea.setBounds(12, 44, 416, 214);
		contentPane.add(textArea);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.setText(textArea.getText() + "\n" + "El usuario ha pulsado el ratón en el componente");

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.setText(textArea.getText() + "\n" + "El usuario ha entrado con ratón en el componente");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				textArea.setText(textArea.getText() + "\n" + "El usuario ha salido con ratón del componente");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				textArea.setText(textArea.getText() + "\n" + "El usuario mantiene pulsado el ratón en el componente");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setText(textArea.getText() + "\n" + "El usuario ha soltado el ratón en el componente");
			}
		});
		btnLimpiar.setBounds(162, 0, 117, 25);
		contentPane.add(btnLimpiar);
		setVisible(true);
	}
}
