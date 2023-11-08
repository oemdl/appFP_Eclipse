package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _05 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtGB, txtMB, txtKB, txtBytes;

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
		setBounds(0, 0, 200, 250);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblGB = new JLabel("Gigabyte :");
		lblGB.setBounds(30, 30, 70, 25);
		getContentPane().add(lblGB);

		JLabel lblMB = new JLabel("Megabyte :");
		lblMB.setBounds(30, 60, 70, 25);
		getContentPane().add(lblMB);
		
		JLabel lblKB = new JLabel("Kilobyte :");
		lblKB.setBounds(30, 90, 70, 25);
		getContentPane().add(lblKB);
		
		JLabel lblBytes = new JLabel("Bytes :");
		lblBytes.setBounds(30, 120, 70, 25);
		getContentPane().add(lblBytes);
		
		txtGB = new JTextField();
		txtGB.setBounds(100, 30, 60, 25);
		txtGB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGB.setMargin(new Insets(2, 5, 2, 5));
		getContentPane().add(txtGB);

		txtMB = new JTextField();
		txtMB.setBounds(100, 60, 60, 25);
		txtMB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMB.setMargin(new Insets(2, 5, 2, 5));
		txtMB.setFocusable(false);
		getContentPane().add(txtMB);
		
		txtKB = new JTextField();
		txtKB.setBounds(100, 90, 60, 25);
		txtKB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKB.setMargin(new Insets(2, 5, 2, 5));
		txtKB.setFocusable(false);
		getContentPane().add(txtKB);
		
		txtBytes = new JTextField();
		txtBytes.setBounds(100, 120, 60, 25);
		txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBytes.setMargin(new Insets(2, 5, 2, 5));
		txtBytes.setFocusable(false);
		getContentPane().add(txtBytes);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50,160,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int gigabytes = Integer.parseInt( txtGB.getText() );
		
		int MB = gigabytes * 1024;
		int KB = MB * 1024;
		int Bytes = KB * 1024; 
		
		txtMB.setText( "" + MB );
		txtKB.setText( "" + KB );
		txtBytes.setText( "" + Bytes );
	}

}