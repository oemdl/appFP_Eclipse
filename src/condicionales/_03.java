package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtNumero, txtRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 200);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 60, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblRpta = new JLabel("Rpta :");
		lblRpta.setBounds(30, 60, 60, 25);
		getContentPane().add(lblRpta);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 60, 25);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtNumero);

		txtRpta = new JTextField();
		txtRpta.setBounds(100, 60, 60, 25);
		txtRpta.setMargin(new Insets(2, 2, 2, 2));
		txtRpta.setFocusable(false);
		getContentPane().add(txtRpta);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 100, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				btnCalcular_actionPerformed(); } } );
	} 

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		
		String sAngulo = "Error";
		if ( numero == 0 ) sAngulo = "Nulo";
		else if ( numero > 0 && numero < 90) sAngulo = "Agudo";
		else if ( numero == 90) sAngulo = "Recto";
		else if ( numero > 90 && numero < 180) sAngulo = "Obtuso";
		else if ( numero == 180) sAngulo = "Llano";
		else if ( numero > 180 && numero < 360) sAngulo = "Cóncavo";
		else if ( numero == 360) sAngulo = "Completo";
		txtRpta.setText(sAngulo);
	}
	
}