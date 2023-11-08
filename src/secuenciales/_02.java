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

public class _02 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtMetros, txtCentimetros, txtPulgadas, txtPies, txtYardas;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 270, 300);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(30,30,60,25);
		getContentPane().add(lblMetros);
		
		JLabel lblCentimetros = new JLabel("Centimetros :");
		lblCentimetros.setBounds(30,60,80,25);
		getContentPane().add(lblCentimetros);

		JLabel lblPulgadas = new JLabel("Pulgadas :");
		lblPulgadas.setBounds(30,90,60,25);
		getContentPane().add(lblPulgadas);

		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(30,120,60,25);
		getContentPane().add(lblPies);

		JLabel lblYardas = new JLabel("Yardas :");
		lblYardas.setBounds(30,150,60,25);
		getContentPane().add(lblYardas);

		txtMetros = new JTextField();
		txtMetros.setBounds(120,30,80,25);
		txtMetros.setMargin(new Insets(2,5,2,5));
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtMetros);
		
		txtCentimetros = new JTextField();
		txtCentimetros.setBounds(120,60,80,25);
		txtCentimetros.setMargin(new Insets(2,5,2,5));
		txtCentimetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCentimetros.setFocusable(false);
		getContentPane().add(txtCentimetros);
		
		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(120,90,80,25);
		txtPulgadas.setMargin(new Insets(2,5,2,5));
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPulgadas.setFocusable(false);
		getContentPane().add(txtPulgadas);
		
		txtPies = new JTextField();
		txtPies.setBounds(120,120,80,25);
		txtPies.setMargin(new Insets(2,5,2,5));
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setFocusable(false);
		getContentPane().add(txtPies);
		
		txtYardas = new JTextField();
		txtYardas.setBounds(120,150,80,25);
		txtYardas.setMargin(new Insets(2,5,2,5));
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYardas.setFocusable(false);
		getContentPane().add(txtYardas);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(85,210,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}

	protected void btnCalcular_Click() {
		int metros = Integer.parseInt( txtMetros.getText() );
		
		double centimetros = metros * 100;
		double pulgadas = centimetros / 2.54;
		double pies = pulgadas / 12;
		double yardas = pies / 3;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtCentimetros.setText( df.format(centimetros) );
		txtPulgadas.setText( df.format(pulgadas) );
		txtPies.setText( df.format(pies) );
		txtYardas.setText( df.format(yardas) );
	}

}
