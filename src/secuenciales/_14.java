package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtN1, txtN2, txtN3, txtN4, txtN5, txtRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 300);
		setLayout(null);
		setLocationRelativeTo(null);
		Insets insets = new Insets(2, 5, 2, 5 );
		
		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 50, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 60, 50, 25);
		getContentPane().add(lblN2);
		
		JLabel lblN3 = new JLabel("N3 :");
		lblN3.setBounds(30, 90, 50, 25);
		getContentPane().add(lblN3);
		
		JLabel lblN4 = new JLabel("N4 :");
		lblN4.setBounds(30, 120, 50, 25);
		getContentPane().add(lblN4);
		
		JLabel lblN5 = new JLabel("N5 :");
		lblN5.setBounds(30, 150, 50, 25);
		getContentPane().add(lblN5);
		
		JLabel lblRpta = new JLabel("Rpta :");
		lblRpta.setBounds(30, 180, 50, 25);
		getContentPane().add(lblRpta);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 50, 25);
		txtN1.setHorizontalAlignment( SwingConstants.RIGHT );
		txtN1.setMargin( insets );
		getContentPane().add(txtN1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(100, 60, 50, 25);
		txtN2.setHorizontalAlignment( SwingConstants.RIGHT );
		txtN2.setMargin( insets );
		getContentPane().add(txtN2);
		
		txtN3 = new JTextField();
		txtN3.setBounds(100, 90, 50, 25);
		txtN3.setHorizontalAlignment( SwingConstants.RIGHT );
		txtN3.setMargin( insets );
		getContentPane().add(txtN3);
		
		txtN4 = new JTextField();
		txtN4.setBounds(100, 120, 50, 25);
		txtN4.setHorizontalAlignment( SwingConstants.RIGHT );
		txtN4.setMargin( insets );
		getContentPane().add(txtN4);
		
		txtN5 = new JTextField();
		txtN5.setBounds(100, 150, 50, 25);
		txtN5.setHorizontalAlignment( SwingConstants.RIGHT );
		txtN5.setMargin( insets );
		getContentPane().add(txtN5);
		
		txtRpta = new JTextField();
		txtRpta.setBounds(100, 180, 50, 25);
		txtRpta.setFocusable(false);
		txtRpta.setHorizontalAlignment( SwingConstants.RIGHT );
		getContentPane().add(txtRpta);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
	
		btnCalcular.addActionListener( new ActionListener() { 
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}

	protected void btnCalcular_actionPerformed() {
		int n1 = Integer.parseInt( txtN1.getText() );
		int n2 = Integer.parseInt( txtN2.getText() );
		int n3 = Integer.parseInt( txtN3.getText() );
		int n4 = Integer.parseInt( txtN4.getText() );
		int n5 = Integer.parseInt( txtN5.getText() );

		int[] numeros = { n1,n2,n3,n4,n5 };
		Arrays.sort(numeros);
		double promedio = (numeros[2] + numeros[3] + numeros[4]) / 3.0 ;
		
		txtRpta.setText( new DecimalFormat("##.00").format(promedio) );
	}
	
}
