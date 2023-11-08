package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _04 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtN1, txtN2, txtN3, txtPromedio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_04 frame = new _04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 60, 25);
		getContentPane().add(lblN1);

		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 60, 60, 25);
		getContentPane().add(lblN2);

		JLabel lblN3 = new JLabel("N3 :");
		lblN3.setBounds(30, 90, 60, 25);
		getContentPane().add(lblN3);
	
		JLabel lblPromedio = new JLabel("Promedio :");
		lblPromedio.setBounds(30, 120, 70, 25);
		getContentPane().add(lblPromedio);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 60, 25);
		txtN1.setMargin(new Insets(2, 5, 2, 5));
		txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN1);
	
		txtN2 = new JTextField();
		txtN2.setBounds(100, 60, 60, 25);
		txtN2.setMargin(new Insets(2, 5, 2, 5));
		txtN2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN2);
		
		txtN3 = new JTextField();
		txtN3.setBounds(100, 90, 60, 25);
		txtN3.setMargin(new Insets(2, 5, 2, 5));
		txtN3.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN3);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(100, 120, 60, 25);
		txtPromedio.setMargin(new Insets(2, 5, 2, 5));
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setFocusable(false);
		getContentPane().add(txtPromedio);
		
	 	JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int N1 = Integer.parseInt( txtN1.getText() );
		int N2 = Integer.parseInt( txtN2.getText() );
		int N3 = Integer.parseInt( txtN3.getText() );
		
		if ( N3 > 10 ) N3 += 2;
		if ( N3 > 20 ) N3 = 20;
		
		double promedio = ( N1 + N2 + N3 ) / 3;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtPromedio.setText( df.format(promedio) );
	}

}