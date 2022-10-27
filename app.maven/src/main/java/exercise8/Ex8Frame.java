package exercise8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex8Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private JTextField textFieldResultado;


	/**
	 * Create the frame.
	 */
	public Ex8Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMoneda = new JButton("Euros a ptas");
		btnMoneda.setBounds(36, 81, 107, 23);
		contentPane.add(btnMoneda);
		
		JButton btnCambio = new JButton("Cambiar");
		btnCambio.setBounds(167, 81, 107, 23);
		contentPane.add(btnCambio);
		
		JLabel lblCantidad = new JLabel("Cantidad a convertir:");
		lblCantidad.setBounds(10, 35, 134, 14);
		contentPane.add(lblCantidad);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(143, 32, 86, 20);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(250, 35, 63, 14);
		contentPane.add(lblResultado);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setBounds(323, 32, 86, 20);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(302, 81, 107, 23);
		contentPane.add(btnBorrar);
		
		//evento cambio euros a ptas
		btnMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnMoneda.getText().equals("Euros a ptas")) {
					
					try {
						
						double resultado = Double.parseDouble(textFieldCantidad.getText()) * 166.386;
						resultado = Math.round(resultado * 100.0) / 100.0;
						textFieldResultado.setText(Double.toString(resultado));
						
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Error, dame un numero");
						textFieldCantidad.setText("");
						textFieldResultado.setText("");
					}
					
					
				}else {
					
					try {
						
						double resultado = Double.parseDouble(textFieldCantidad.getText()) / 166.386;
						resultado = Math.round(resultado * 100.0) / 100.0;
						textFieldResultado.setText(Double.toString(resultado));
						
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Error, dame un numero");
						textFieldCantidad.setText("");
						textFieldResultado.setText("");
					}
					
					
				}
			}
		});
		
		//evento para cambiar la moneda
		btnCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnMoneda.getText().equals("Euros a ptas")) {
					
					btnMoneda.setText("Ptas a euros");
					
				}else {
					
					btnMoneda.setText("Euros a ptas");
				}
			}
		});
		
		//evento para borrar cantidad
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldCantidad.setText("");
				textFieldResultado.setText("");
			}
		});
		
		setVisible(true);
	}
}
