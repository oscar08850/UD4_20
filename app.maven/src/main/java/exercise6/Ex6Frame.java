package exercise6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex6Frame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Ex6Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(247, 104, 70, 15);
		contentPane.add(lblResultado);

		JLabel lblAlturametros = new JLabel("Altura (metros)");
		lblAlturametros.setBounds(25, 59, 130, 33);
		contentPane.add(lblAlturametros);

		JLabel lblPesokg = new JLabel("Peso(Kg)");
		lblPesokg.setBounds(260, 68, 70, 15);
		contentPane.add(lblPesokg);

		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(207, 108, 70, 15);
		contentPane.add(lblImc);

		JEditorPane editorAltura = new JEditorPane();
		editorAltura.setBounds(145, 59, 107, 21);
		contentPane.add(editorAltura);

		JEditorPane editorPeso = new JEditorPane();
		editorPeso.setBounds(333, 59, 107, 21);
		contentPane.add(editorPeso);

		JButton btnCalcularImc = new JButton("Calcular IMC");
		btnCalcularImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double altura = Double.parseDouble(editorAltura.getText());
					double peso = Double.parseDouble(editorPeso.getText());
					double resultado = (peso / (altura * altura));
					resultado = Math.round(resultado * 100.0) / 100.0;

					lblResultado.setText(String.valueOf(resultado));
					System.out.println(editorAltura.getText());

				} catch (Exception e) {
					System.out.println("Exception " + e);
				}

			}
		});
		btnCalcularImc.setBounds(35, 99, 120, 33);
		contentPane.add(btnCalcularImc);

		setVisible(true);

	}
}
