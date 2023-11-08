package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _31 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtHoras, txtCategoria;
	JTextArea txaRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_31 frame = new _31();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblHoras = new JLabel("Horas :");
		lblHoras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblHoras);
		
		JLabel lblCategoria = new JLabel("Categoria :");
		lblCategoria.setBounds(50, 100, 80, 30);
		getContentPane().add(lblCategoria);

		txtHoras = new JTextField();
		txtHoras.setBounds(140, 50, 80, 30);
		txtHoras.setHorizontalAlignment( SwingConstants.RIGHT );
		txtHoras.setMargin( new Insets( 5, 5, 5, 5 ) );
		getContentPane().add(txtHoras);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(140, 100, 80, 30);
		txtCategoria.setHorizontalAlignment( SwingConstants.RIGHT );
		txtCategoria.setMargin( new Insets( 5, 5, 5, 5 ) );
		getContentPane().add(txtCategoria);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50, 150, 180, 150);
		txaRpta.setFocusable(false);
		txaRpta.setMargin( new Insets(10, 10, 10, 10));
		getContentPane().add(txaRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 100, 320, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			} });
	}

	protected void btnCalcular_actionPerformed() {
		int horas = Integer.parseInt( txtHoras.getText() );
		String sCategoria = txtCategoria.getText();
		
		double tarifa = 0;
		if ( sCategoria.equals("A") ) tarifa = 21;
		else if ( sCategoria.equals("B") ) tarifa = 19.5;
		else if ( sCategoria.equals("C") ) tarifa = 17;
		else tarifa = 15.5;

		double sbruto = horas * tarifa;
		double descuento = ( sbruto > 2500 ? 0.20 : 0.15 ) * sbruto;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append( "Horas        : " + horas + "\n");
		txaRpta.append( "Categoria    : " + sCategoria + "\n" );
		txaRpta.append( "Sueldo Bruto : " + df.format(sbruto) + "\n" );
		txaRpta.append( "Descuento    : " + df.format(descuento) + "\n" );
		txaRpta.append( "Sueldo Neto  : " + df.format(sbruto - descuento) );
	}

}