package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {

	private static final long serialVersionUID = 1L;

	JTextField txtPies, txtPulgadas, txtMetros;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 220);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(30,30,60,25);
		getContentPane().add(lblPies);

		JLabel lblPulgadas = new JLabel("Pulgadas :");
		lblPulgadas.setBounds(30,60,60,25);
		getContentPane().add(lblPulgadas);

		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(30,90,60,25);
		getContentPane().add(lblMetros);
	
		txtPies = new JTextField();
		txtPies.setBounds(100,30,60,25);
		txtPies.setMargin(new Insets(2,5,2,5));
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtPies);
	
		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(100,60,60,25);
		txtPulgadas.setMargin(new Insets(2,5,2,5));
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtPulgadas);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(100,90,60,25);
		txtMetros.setMargin(new Insets(2,5,2,5));
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setFocusable(false);
		getContentPane().add(txtMetros);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50,140,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}

	protected void btnCalcular_actionPerformed() {
		int pies = Integer.parseInt( txtPies.getText() );
		int pulgadas = Integer.parseInt( txtPulgadas.getText() );
		
		double metros = (pies * 12 + pulgadas) * 2.54 / 100;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtMetros.setText( df.format(metros) );
	}

}