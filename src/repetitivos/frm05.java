package repetitivos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField txtNumero;
	JTextArea txaRpta;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setLocationRelativeTo( null );
		this.setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 60, 30);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 50, 30);
		txtNumero.setMargin( new Insets( 5, 5, 5, 5 ));
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtNumero);

		txaRpta = new JTextArea();
		txaRpta.setMargin( new Insets(5,10,5,5));
		
		JScrollPane scPane = new JScrollPane(txaRpta);
		scPane.setBounds(30, 70, 150, 240);
		contentPane.add(scPane);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 320, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}

	private void btnCalcular_Click() {
		int numero = Integer.parseInt( txtNumero.getText() );
		txaRpta.setText("");
		
		/*
		for( int i = 1; i < 13; i++ ) 
			txaRpta.append( "" + numero + " x " + ( i < 10 ? "  " : "" ) + i + " = " + ( numero * i < 10 ? "  " : "" )  + ( numero * i) + "\n" );
		*/
		
		int i = 1;
		while ( i < 13 )
			txaRpta.append( "" + numero + " x " + ( i < 10 ? "  " : "" ) + i + " = " + ( numero * i < 10 ? "  " : "" )  + ( numero * i++) + "\n" );
	
	}

}