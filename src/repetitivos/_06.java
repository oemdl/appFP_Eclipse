package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _06 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtInicio, txtFin;
	JTextArea txaRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_06 frame = new _06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(40, 40, 60, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblInicio = new JLabel("Inicio :");
		lblInicio.setBounds(40, 80, 60, 30);
		getContentPane().add(lblInicio);
		
		JLabel lblFin = new JLabel("Fin :");
		lblFin.setBounds(40, 120, 60, 30);
		getContentPane().add(lblFin);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 40, 50, 30);
		txtNumero.setMargin( new Insets( 5, 10, 5, 10 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);

		txtInicio = new JTextField();
		txtInicio.setBounds(100, 80, 50, 30);
		txtInicio.setMargin( new Insets( 5, 10, 5, 10 ));
		txtInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtInicio);

		txtFin = new JTextField();
		txtFin.setBounds(100, 120, 50, 30);
		txtFin.setMargin( new Insets( 5, 10, 5, 10 ));
		txtFin.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtFin);

		txaRpta = new JTextArea();
		txaRpta.setMargin( new Insets(5,10,5,5));
		
		JScrollPane sp = new JScrollPane(txaRpta);
		sp.setBounds(30, 160, 150, 250);
		getContentPane().add(sp);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 430, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		int inicio = Integer.parseInt( txtInicio.getText() );
		int fin = Integer.parseInt( txtFin.getText() );
		txaRpta.setText("");

		for( int i=inicio; i <= fin; i++ )
			txaRpta.append( "" + numero + " x " + i + " = " + ( numero * i) + "\n" );

	}

}