package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _07 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtBase, txtAltura, txtArea, txtPerimetro;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_07 frame = new _07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblBase = new JLabel("Base :");
		lblBase.setBounds(40, 40, 80, 30);
		getContentPane().add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setBounds(40, 80, 80, 30);
		getContentPane().add(lblAltura);
		
		JLabel lblArea = new JLabel("Area :");
		lblArea.setBounds(40, 120, 80, 30);
		getContentPane().add(lblArea);
		
		JLabel lblPerimetro = new JLabel("Perímetro :");
		lblPerimetro.setBounds(40, 160, 80, 30);
		getContentPane().add(lblPerimetro);

		txtBase = new JTextField();
		txtBase.setBounds(120, 40, 60, 30);
		txtBase.setHorizontalAlignment( SwingConstants.RIGHT );
		txtBase.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtBase);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(120, 80, 60, 30);
		txtAltura.setHorizontalAlignment( SwingConstants.RIGHT );
		txtAltura.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtAltura);
		
		txtArea = new JTextField();
		txtArea.setBounds(120, 120, 60, 30);
		txtArea.setFocusable(false);
		txtArea.setHorizontalAlignment( SwingConstants.RIGHT );
		txtArea.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtArea);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(120, 160, 60, 30);
		txtPerimetro.setFocusable(false);
		txtPerimetro.setHorizontalAlignment( SwingConstants.RIGHT );
		txtPerimetro.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtPerimetro);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 100, 220, 100, 30);
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int base = Integer.parseInt( txtBase.getText() );
		int altura = Integer.parseInt( txtAltura.getText() );
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		txtArea.setText( "" + area);
		txtPerimetro.setText( "" + perimetro);		
	}

}