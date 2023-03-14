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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField txtDividendo, txtDivisor, txtCociente, txtResiduo;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDividendo = new JLabel("Dividendo :");
		lblDividendo.setBounds(30,30,80,30);
		contentPane.add(lblDividendo);
		
		JLabel lblDivisor = new JLabel("Divisor :");
		lblDivisor.setBounds(30,70,80,30);
		contentPane.add(lblDivisor);
		
		JLabel lblCociente = new JLabel("Cociente :");
		lblCociente.setBounds(30,110,80,30);
		contentPane.add(lblCociente);
		
		JLabel lblResiduo = new JLabel("Residuo :");
		lblResiduo.setBounds(30,150,80,30);
		contentPane.add(lblResiduo);
		
		Insets insets = new Insets(5,5,5,5);
		
		txtDividendo = new JTextField();
		txtDividendo.setBounds(120,30,80,30);
		txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDividendo.setMargin(insets);
		contentPane.add(txtDividendo);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(120,70,80,30);
		txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDivisor.setMargin(insets);
		contentPane.add(txtDivisor);
		
		txtCociente = new JTextField();
		txtCociente.setBounds(120,110,80,30);
		txtCociente.setFocusable(false);
		txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCociente.setMargin(insets);
		contentPane.add(txtCociente);

		txtResiduo = new JTextField();
		txtResiduo.setBounds(120,150,80,30);
		txtResiduo.setFocusable(false);
		txtResiduo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResiduo.setMargin(insets);
		contentPane.add(txtResiduo);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70,200,100,30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() { @Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}

	protected void btnCalcular_Click() {
		int dividendo = Integer.parseInt( txtDividendo.getText() );
		int divisor   = Integer.parseInt( txtDivisor.getText() );
		
		int cociente = 1;
		for ( ; (dividendo = (dividendo - divisor)) >= divisor; cociente++ );
		
		//while ( (dividendo = (dividendo - divisor)) >= divisor ) cociente++;
		
		txtCociente.setText( "" + cociente);
		txtResiduo.setText( "" + dividendo);

	}

}
