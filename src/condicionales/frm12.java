package condicionales;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblNumero, lblRpta;
	JTextField txtNumero, txtRpta;
	JButton btnCalcular;
	
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
		setBounds(0, 0, 250, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(btnCalcular);
		
		lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30,30,60,30);
		contentPane.add(lblNumero);
		
		lblRpta = new JLabel("Rpta :");
		lblRpta.setBounds(30,70,60,30);
		contentPane.add(lblRpta);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100,30,60,30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtNumero);

		txtRpta = new JTextField();
		txtRpta.setBounds(100,70,60,30);
		txtRpta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRpta.setMargin(new Insets(5, 5, 5, 5));
		txtRpta.setFocusable(false);
		contentPane.add(txtRpta);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50,120,100,30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				btnCalcular_Click(); } } );
	} 

	private void btnCalcular_Click() {
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
		txtRpta.setText(sDia);
		*/

		/*
		String sDia = "";
		switch (numero) {
			case 1 : sDia = "Lunes"; break;
			case 2 : sDia = "Martes"; break;
			case 3 : sDia = "Miércoles"; break;
			case 4 : sDia = "Jueves"; break;
			case 5 : sDia = "Viernes"; break;
			case 6 : sDia = "Sábado"; break;
			case 7 : sDia = "Domingo"; break;			 
			default: sDia = "Error";
		}
		txtRpta.setText(sDia);
		*/

		String[] aDias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		txtRpta.setText( numero >= 1 && numero <= 7 ? aDias[numero - 1] : "Error" );
		
	}
	
}

