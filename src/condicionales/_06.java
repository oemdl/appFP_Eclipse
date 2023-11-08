package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _06 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtE1, txtE2, txtE3;
	JLabel lblMM1, lblMM2, lblMM3;

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
		setBounds(0, 0, 250, 270);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblE1 = new JLabel("E1 :");
		lblE1.setBounds(40, 40, 60, 30);
		getContentPane().add(lblE1);
		
		JLabel lblE2 = new JLabel("E2 :");
		lblE2.setBounds(40, 80, 60, 30);
		getContentPane().add(lblE2);
		
		JLabel lblE3 = new JLabel("E3 :");
		lblE3.setBounds(40, 120, 60, 30);
		getContentPane().add(lblE3);
		
		lblMM1 = new JLabel();
		lblMM1.setBounds(160, 40, 60, 30);
		getContentPane().add(lblMM1);
		
		lblMM2 = new JLabel();
		lblMM2.setBounds(160, 80, 60, 30);
		getContentPane().add(lblMM2);
		
		lblMM3 = new JLabel();
		lblMM3.setBounds(160, 120, 60, 30);
		getContentPane().add(lblMM3);
		
		txtE1 = new JTextField();
		txtE1.setBounds(100, 40, 50, 30);
		txtE1.setMargin( new Insets( 5, 8, 5, 8 ));
		txtE1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtE1);
		
		txtE2 = new JTextField();
		txtE2.setBounds(100, 80, 50, 30);
		txtE2.setMargin( new Insets( 5, 8, 5, 8 ));
		txtE2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtE2);

		txtE3 = new JTextField();
		txtE3.setBounds(100, 120, 50, 30);
		txtE3.setMargin( new Insets( 5, 8, 5, 8 ));
		txtE3.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtE3);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70, 180, 100, 30);
		btnCalcular.setFocusPainted(false);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
	}

}