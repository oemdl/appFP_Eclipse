package secuenciales;

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

public class _03 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;

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
		setBounds(0, 0, 250, 300);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblKilometros = new JLabel("Kilometros :");
		lblKilometros.setBounds(30, 30, 70, 25);
		getContentPane().add(lblKilometros);

		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(30, 60, 70, 25);
		getContentPane().add(lblPies);
		
		JLabel lblMillas = new JLabel("Millas :");
		lblMillas.setBounds(30, 90, 70, 25);
		getContentPane().add(lblMillas);
		
		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(30, 120, 70, 25);
		getContentPane().add(lblMetros);
		
		JLabel lblYardas = new JLabel("Yardas :");
		lblYardas.setBounds(30, 150, 60, 25);
		getContentPane().add(lblYardas);
		
		txtKilometros = new JTextField();
		txtKilometros.setBounds(110, 30, 70, 25);
		txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKilometros.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtKilometros);

		txtPies = new JTextField();
		txtPies.setBounds(110, 60, 70, 25);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtPies);
		
		txtMillas = new JTextField();
		txtMillas.setBounds(110, 90, 70, 25);
		txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMillas.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtMillas);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(110, 120, 70, 25);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtMetros);
		
		txtYardas = new JTextField();
		txtYardas.setBounds(110, 150, 70, 25);
		txtYardas.setFocusable(false);
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYardas.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtYardas);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int kilometros = Integer.parseInt( txtKilometros.getText() );
		int pies = Integer.parseInt( txtPies.getText() );
		int millas = Integer.parseInt( txtMillas.getText() );
		
		double metros = kilometros * 1000 + ( pies * 12 * 2.54 / 100 ) + millas * 1609;
		double yardas = metros * 1.09;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMetros.setText( df.format(metros) );
		txtYardas.setText( df.format(yardas) );
	}

}