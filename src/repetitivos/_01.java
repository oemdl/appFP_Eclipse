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

public class _01 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtDividendo, txtDivisor, txtCociente, txtResiduo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01 frame = new _01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDividendo = new JLabel("Dividendo :");
		lblDividendo.setBounds(40, 40, 80, 30);
		getContentPane().add(lblDividendo);
		
		JLabel lblDivisor = new JLabel("Divisor :");
		lblDivisor.setBounds(40, 80, 80, 30);
		getContentPane().add(lblDivisor);
		
		JLabel lblCociente = new JLabel("Cociente :");
		lblCociente.setBounds(40, 120, 80, 30);
		getContentPane().add(lblCociente);
		
		JLabel lblResiduo = new JLabel("Residuo :");
		lblResiduo.setBounds(40, 160, 80, 30);
		getContentPane().add(lblResiduo);
		
		Insets insets = new Insets(2, 5, 2, 5);
		
		txtDividendo = new JTextField();
		txtDividendo.setBounds( 120, 40, 60, 30);
		txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDividendo.setMargin(insets);
		getContentPane().add(txtDividendo);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(120, 80, 60, 30);
		txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDivisor.setMargin(insets);
		getContentPane().add(txtDivisor);
		
		txtCociente = new JTextField();
		txtCociente.setBounds(120, 120, 60, 30);
		txtCociente.setFocusable(false);
		txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCociente.setMargin(insets);
		getContentPane().add(txtCociente);

		txtResiduo = new JTextField();
		txtResiduo.setBounds(120, 160, 60, 30);
		txtResiduo.setFocusable(false);
		txtResiduo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResiduo.setMargin(insets);
		getContentPane().add(txtResiduo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } } );
	}

	protected void btnCalcular_actionPerformed() {
		int dividendo = Integer.parseInt( txtDividendo.getText() );
		int divisor   = Integer.parseInt( txtDivisor.getText() );
		
		/*
		int cociente = 0;
		while ( dividendo >= divisor ) {
			dividendo -= divisor;
			cociente++;
		}
		*/
		
		/*
		int cociente = 0;
		for( ; dividendo >= divisor ; ) {
			dividendo -= divisor;
			cociente++;
		}
		*/
		
		//int cociente = 0;
		//for( ; dividendo >= divisor ; dividendo -= divisor, cociente++ );
		
		
		//int cociente = 1;
		//while ( (dividendo -= divisor) >= divisor ) cociente++;
		
		int cociente = 1;
		for ( ; (dividendo -= divisor) >= divisor ; cociente++ );
		
		txtCociente.setText( "" + cociente);
		txtResiduo.setText( "" + dividendo);
	}
}