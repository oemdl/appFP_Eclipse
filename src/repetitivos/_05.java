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

public class _05 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero;
	JTextArea txaRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_05 frame = new _05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 420);
		setLocationRelativeTo( null );
		setLayout(null);

		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(40, 40, 60, 30);
		getContentPane().add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setBounds(100, 40, 50, 30);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);

		txaRpta = new JTextArea();
		txaRpta.setMargin( new Insets(5,10,5,5));

		JScrollPane scPane = new JScrollPane(txaRpta);
		scPane.setBounds(40, 80, 150, 240);
		getContentPane().add(scPane);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 330, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		txaRpta.setText("");

		/*
		for( int i = 1; i <= 12; i++ )
			txaRpta.append( "" + numero + " x " + ( i < 10 ? "  " : "" ) + i + " = " + ( numero * i < 10 ? "  " : "" )  + ( numero * i) + "\n" );
		*/

		int i = 1;
		while ( i <= 12 )
			txaRpta.append( "" + numero + " x " + ( i < 10 ? "  " : "" ) + i + " = " + ( numero * i < 10 ? "  " : "" )  + ( numero * i++) + "\n" );
	}

}