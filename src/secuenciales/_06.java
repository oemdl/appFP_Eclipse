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

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtRadio, txtAltura, txtVolumen, txtAreaTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 250);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRadio = new JLabel("Radio :");
		lblRadio.setBounds(30, 30, 60, 25);
		getContentPane().add(lblRadio);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setBounds(30, 60, 60, 25);
		getContentPane().add(lblAltura);
		
		JLabel lblVolumen = new JLabel("Volúmen :");
		lblVolumen.setBounds(30, 90, 60, 25);
		getContentPane().add(lblVolumen);
		
		JLabel lblAreaTotal = new JLabel("Área Total :");
		lblAreaTotal.setBounds(30, 120, 70, 25);
		getContentPane().add(lblAreaTotal);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(100, 30, 60, 25);
		txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(100, 60, 60, 25);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtAltura);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(100, 90, 60, 25);
		txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVolumen.setMargin(new Insets(2, 5, 2, 5));
		txtVolumen.setFocusable(false);
		getContentPane().add(txtVolumen);
		
		txtAreaTotal = new JTextField();
		txtAreaTotal.setBounds(100, 120, 60, 25);
		txtAreaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaTotal.setMargin(new Insets(2, 5, 2, 5));
		txtAreaTotal.setFocusable(false);
		getContentPane().add(txtAreaTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50,160,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}
		
	private void btnCalcular_actionPerformed() {
		int radio = Integer.parseInt( txtRadio.getText() );
		int altura = Integer.parseInt( txtAltura.getText() );
		
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
		double areaTotal = 2 * Math.PI * radio * ( radio + altura );
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtVolumen.setText( df.format(volumen) );
		txtAreaTotal.setText( df.format(areaTotal) );
	}
	
}