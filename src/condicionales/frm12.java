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

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtDia;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 200);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número : ");
		lblNumero.setBounds(30, 30, 60, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblDia = new JLabel("Día : ");
		lblDia.setBounds(30, 60, 60, 25);
		getContentPane().add(lblDia);
		
		Insets insets = new Insets(2, 5, 2, 5);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 60, 25);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin( insets );
		getContentPane().add(txtNumero);
		
		txtDia = new JTextField();
		txtDia.setBounds(100, 60, 60, 25);
		txtDia.setMargin( insets );
		txtDia.setFocusable(false);
		getContentPane().add(txtDia);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 100, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}
	
	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );

		/*
		String sDia = "";
		if ( numero == 1 ) sDia = "Lunes";
		else if ( numero == 2 ) sDia = "Martes";
		else if ( numero == 3 ) sDia = "Miércoles";
		else if ( numero == 4 ) sDia = "Jueves";
		else if ( numero == 5 ) sDia = "Viernes";
		else if ( numero == 6 ) sDia = "Sábado";
		else if ( numero == 7 ) sDia = "Domingo";
		else sDia = "Error";
		txtDia.setText(sDia);
		*/

		/*
		String[] sDias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		if ( numero >= 1 && numero <= 7)
			txtDia.setText( sDias[ numero - 1 ] );
		else txtDia.setText( "Error" );

		*/

		String sDia = "";
		switch ( numero ) {
			case 1 : sDia = "Lunes"; break;
			case 2 : sDia = "Martes"; break;
			case 3 : sDia = "Miércoles"; break;
			case 4 : sDia = "Jueves"; break;
			case 5 : sDia = "Viernes"; break;
			case 6 : sDia = "Sábado"; break;
			case 7 : sDia = "Domingo"; break;
			default : sDia = "Error";
		}
		txtDia.setText( sDia );
	}

}