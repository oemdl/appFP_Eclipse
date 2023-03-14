package recursividad;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField txtN1, txtN2, txtProducto;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setLocationRelativeTo( null );
		this.setLayout(null);
		
		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 60, 30);
		contentPane.add(lblN1);
		
		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 65, 60, 30);
		contentPane.add(lblN2);
		
		JLabel lblProducto = new JLabel("Producto :");
		lblProducto.setBounds(30, 100, 80, 30);
		contentPane.add(lblProducto);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 50, 30);
		txtN1.setMargin( new Insets( 5, 5, 5, 5 ));
		txtN1.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtN1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(100, 65, 50, 30);
		txtN2.setMargin( new Insets( 5, 5, 5, 5 ));
		txtN2.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtN2);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(100, 100, 50, 30);
		txtProducto.setMargin( new Insets( 5, 5, 5, 5 ));
		txtProducto.setHorizontalAlignment(JTextField.RIGHT);
		txtProducto.setFocusable(false);
		contentPane.add(txtProducto);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}

	private void btnCalcular_Click() {
		int N1 = Integer.parseInt( txtN1.getText() );
		int N2 = Integer.parseInt( txtN2.getText() );
			
		txtProducto.setText( "" + Multiplicar(N1,N2) );	
	}

	private int Multiplicar(int n1, int n2) {
		if ( n2 == 1 ) return n1;
		return n1 + Multiplicar(n1, n2 - 1);
	}
	
}