package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _30 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtCuota, txtDia, txtPago;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_30 frame = new _30();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 220, 300);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCuota= new JLabel("Cuota :");
		lblCuota.setBounds(40, 40, 60, 30);
		getContentPane().add(lblCuota);
		
		JLabel lblDia = new JLabel("Dia :");
		lblDia.setBounds(40, 80, 60, 30);
		getContentPane().add(lblDia);
		
		JLabel lblPago = new JLabel("Pago :");
		lblPago.setBounds(40, 120, 60, 30);
		getContentPane().add(lblPago);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(100, 40, 60, 30);
		txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuota.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtCuota);
		
		txtDia = new JTextField();
		txtDia.setBounds(100, 80, 60, 30);
		txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtDia);
		
		txtPago = new JTextField();
		txtPago.setBounds(100, 120, 60, 30);
		txtPago.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPago.setMargin( new Insets(5, 5, 5, 5) );
		txtPago.setFocusable(false);
		getContentPane().add(txtPago);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 180, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}
	
	private void btnCalcular_actionPerformed() {
		int cuota = Integer.parseInt( txtCuota.getText() );
		int dia = Integer.parseInt( txtDia.getText() );
		
		double descuento = 0;
		if ( dia <= 10) descuento = -Math.max(5, 0.02 * cuota);
		else if ( dia >= 20 ) descuento = Math.max(10, 0.03 * cuota);
	
		DecimalFormat df = new DecimalFormat("##.00");
		txtPago.setText( df.format( cuota + descuento ) );
	}

}