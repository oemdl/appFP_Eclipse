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

public class _02 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtMultiplicando, txtMultiplicador, txtProducto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 250);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 60, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 60, 60, 25);
		getContentPane().add(lblN2);
		
		JLabel lblProducto = new JLabel("Producto :");
		lblProducto.setBounds(30, 90, 80, 25);
		getContentPane().add(lblProducto);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(100, 30, 50, 25);
		txtMultiplicando.setMargin( new Insets( 2, 5, 2, 5 ));
		txtMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtMultiplicando);
		
		txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(100, 60, 50, 25);
		txtMultiplicador.setMargin( new Insets( 2, 5, 2, 5 ));
		txtMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtMultiplicador);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(100, 90, 50, 25);
		txtProducto.setMargin( new Insets( 2, 5, 2, 5 ));
		txtProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtProducto.setFocusable(false);
		getContentPane().add(txtProducto);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 130, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int Multiplicando = Integer.parseInt( txtMultiplicando.getText() );
		int Multiplicador = Integer.parseInt( txtMultiplicador.getText() );
		
		//for ( int Nx = Multiplicando, veces = 1; veces++ < Multiplicador; Multiplicando += Nx );
		
		for( int Nx = Multiplicando; Multiplicador-- > 1; Multiplicando += Nx );
		
		//int Nx = Multiplicando;
		//while ( Multiplicador-- > 1 ) Multiplicando += Nx;
		
		txtProducto.setText( "" + Multiplicando );
	}

}