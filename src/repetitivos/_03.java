package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _03 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtDivisores;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_03 frame = new _03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 180);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 60, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblDivisores = new JLabel("Divisores :");
		lblDivisores.setBounds(30, 60, 70, 25);
		getContentPane().add(lblDivisores);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 50, 25);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);
		
		txtDivisores = new JTextField();
		txtDivisores.setBounds(100, 60, 120, 25);
		txtDivisores.setFocusable(false);
		txtDivisores.setMargin( new Insets( 2, 5, 2, 5 ));
		getContentPane().add(txtDivisores);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 100, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );

		int tope = numero / ( numero % 2 + 2 );
		String sDivisores = "1";

		for ( int i=2; i <= tope; i++ )
			if ( numero % i == 0 )
				sDivisores += "," + i;

		txtDivisores.setText( sDivisores + "," + numero );

		txtDivisores.setText( strDivisores(numero, 1, "") );
	}

	protected String strDivisores(int numero, int contador, String rpta ) {
		if ( numero == contador ) return rpta += numero;
		if ( numero % contador == 0 ) rpta += contador + ",";
		return strDivisores(numero, contador + 1, rpta);
	}

}