package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _23 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMatematica, txtFisica, txtPropina, txtReloj;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_23 frame = new _23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMatematica = new JLabel("Matemática :");
		lblMatematica.setBounds(40, 40, 80, 30);
		getContentPane().add(lblMatematica);
		
		JLabel lblFisica = new JLabel("Física :");
		lblFisica.setBounds(40, 80, 80, 30);
		getContentPane().add(lblFisica);
		
		JLabel lblPropina = new JLabel("Propina :");
		lblPropina.setBounds(40, 120, 80, 30);
		getContentPane().add(lblPropina);
		
		JLabel lblReloj = new JLabel("Reloj :");
		lblReloj.setBounds(40, 160, 80, 30);
		getContentPane().add(lblReloj);
		
		txtMatematica = new JTextField();
		txtMatematica.setBounds(120, 40, 80, 30);
		txtMatematica.setHorizontalAlignment( SwingConstants.RIGHT );
		txtMatematica.setMargin( new Insets(5, 8, 5, 8) ); 
		getContentPane().add(txtMatematica);
		
		txtFisica = new JTextField();
		txtFisica.setBounds(120, 80, 80, 30);
		txtFisica.setHorizontalAlignment( SwingConstants.RIGHT );
		txtFisica.setMargin( new Insets(5, 8, 5, 8) ); 
		getContentPane().add(txtFisica);
		
		txtPropina = new JTextField();
		txtPropina.setBounds(120, 120, 80, 30);
		txtPropina.setFocusable(false);
		txtPropina.setHorizontalAlignment( SwingConstants.RIGHT );
		txtPropina.setMargin( new Insets(5, 8, 5, 8) ); 
		getContentPane().add(txtPropina);
		
		txtReloj = new JTextField();
		txtReloj.setBounds(120, 160, 80, 30);
		txtReloj.setFocusable(false);
		txtReloj.setHorizontalAlignment( SwingConstants.CENTER );
		txtReloj.setMargin( new Insets(5, 8, 5, 8) ); 
		getContentPane().add(txtReloj);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(75, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	protected void btnCalcular_actionPerformed() {
		int matematica = Integer.parseInt( txtMatematica.getText() );
		int fisica = Integer.parseInt( txtMatematica.getText() );
		
		// validar datos
		if ( matematica < 0 || matematica > 20 || 
			 fisica < 0 || fisica > 20 	) {
			txtMatematica.setText("");
			txtFisica.setText("");
			txtMatematica.requestFocus();
			JOptionPane.showMessageDialog(this, "Notas invï¿½lidas");
		}
			
		double propina = matematica + fisica * 0.50;
		if ( matematica > 17 ) propina += (matematica - 17) * 2;
		if ( fisica > 15 ) propina += (fisica - 15) * 2;

		txtPropina.setText( new DecimalFormat("#0.00").format(propina) );
		txtReloj.setText( ( matematica + fisica ) / 2 > 16 ? "Si" : "No" );
	}
	
}