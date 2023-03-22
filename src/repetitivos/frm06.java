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

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField txtNumero, txtInicio, txtFin;
	JTextArea txaRpta;
	JButton btnCalcular;

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
		setBounds(0, 0, 250, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setLocationRelativeTo( null );
		this.setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 60, 30);
		contentPane.add(lblNumero);
		
		JLabel lblInicio = new JLabel("Inicio :");
		lblInicio.setBounds(30, 70, 60, 30);
		contentPane.add(lblInicio);
		
		JLabel lblFin = new JLabel("Fin :");
		lblFin.setBounds(30, 110, 60, 30);
		contentPane.add(lblFin);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 50, 30);
		txtNumero.setMargin( new Insets( 5, 5, 5, 5 ));
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtNumero);

		txtInicio = new JTextField();
		txtInicio.setBounds(100, 70, 50, 30);
		txtInicio.setMargin( new Insets( 5, 5, 5, 5 ));
		txtInicio.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtInicio);

		txtFin = new JTextField();
		txtFin.setBounds(100, 110, 50, 30);
		txtFin.setMargin( new Insets( 5, 5, 5, 5 ));
		txtFin.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtFin);

		txaRpta = new JTextArea();
		txaRpta.setMargin( new Insets(5,10,5,5));
		
		JScrollPane scPane = new JScrollPane(txaRpta);
		scPane.setBounds(30, 150, 150, 250);
		contentPane.add(scPane);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 420, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}

	private void btnCalcular_Click() {
		int numero = Integer.parseInt( txtNumero.getText() );
		int inicio = Integer.parseInt( txtInicio.getText() );
		int fin = Integer.parseInt( txtFin.getText() );
		txaRpta.setText("");
		
		for( int i=inicio; i <= fin; i++ ) 
			txaRpta.append( "" + numero + " x " + i + " = " + ( numero * i) + "\n" );

	}

}