package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _12 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtDia;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_12 frame = new _12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 220, 220);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número : ");
		lblNumero.setBounds(40, 40, 60, 30);
		getContentPane().add(lblNumero);
		
		JLabel lblDia = new JLabel("Día : ");
		lblDia.setBounds(40, 80, 60, 30);
		getContentPane().add(lblDia);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 40, 60, 25);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin( new Insets(5, 8, 5, 8) );
		getContentPane().add(txtNumero);
		
		txtDia = new JTextField();
		txtDia.setBounds(100, 80, 60, 30);
		txtDia.setFocusable(false);
		txtDia.setMargin( new Insets(5, 8, 5, 8) );
		getContentPane().add(txtDia);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70, 140, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				btnCalcular_actionPerformed(); } });
	}
	
	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );

		/*
		if ( numero == 1 ) txtDia.setText("Lunes");
		else if ( numero == 2 ) txtDia.setText("Martes");
		else if ( numero == 3 ) txtDia.setText("Miércoles");
		else if ( numero == 4 ) txtDia.setText("Jueves");
		else if ( numero == 5 ) txtDia.setText("Viernes");
		else if ( numero == 6 ) txtDia.setText("Sábado");
		else if ( numero == 7 ) txtDia.setText("Domingo");
		else txtDia.setText("Error");		
		
		String[] aDias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		if ( numero >= 1 && numero <= 7 ) 
			txtDia.setText( aDias[ numero - 1 ] );
		else txtDia.setText( "Error" );
		
		*/
		
		String[] aDias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		txtDia.setText( numero >= 1 && numero <= 7 ? aDias[ numero - 1 ]  : "Error" );
		
		/*
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
		*/
	}

}