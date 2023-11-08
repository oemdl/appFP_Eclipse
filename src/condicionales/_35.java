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

public class _35 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtTipo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_35 frame = new _35();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _35() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 200);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(40, 40, 80, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblTipo = new JLabel("Tipo :");
		lblTipo.setBounds(40, 80, 80, 30);
		getContentPane().add(lblTipo);

		txtNumero = new JTextField();
		txtNumero.setBounds( 140, 40, 80, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT );
		txtNumero.setMargin( new Insets( 5, 5, 5, 5 ) );
		getContentPane().add(txtNumero);
		
		txtTipo = new JTextField();
		txtTipo.setBounds( 140, 80, 80, 30);
		txtTipo.setFocusable(false);
		getContentPane().add(txtTipo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 100, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			} });
	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );

		if ( numero > 99 && numero < 1000 ) {
			if ( numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0 ) txtTipo.setText("Administrativo");
			else if ( numero % 3 == 0 && numero % 5 == 0 ) txtTipo.setText("Directivo");
			else if ( numero % 2 == 0 ) txtTipo.setText("Vendedor");
			else if ( numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 ) txtTipo.setText("Seguridad");
			
		} else txtTipo.setText("Error");
		
	}

}