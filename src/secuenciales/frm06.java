package secuenciales;

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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblRadio, lblAltura, lblVolumen, lblAreaTotal;
	JTextField txtRadio, txtAltura, txtVolumen, txtAreaTotal;
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
		setBounds(0, 0, 250, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblRadio = new JLabel("Radio :");
		lblRadio.setBounds(30, 30, 60, 30);
		contentPane.add(lblRadio);
		
		lblAltura = new JLabel("Altura :");
		lblAltura.setBounds(30, 70, 60, 30);
		contentPane.add(lblAltura);
		
		lblVolumen = new JLabel("Volúmen :");
		lblVolumen.setBounds(30, 110, 60, 30);
		contentPane.add(lblVolumen);
		
		lblAreaTotal = new JLabel("Área Total :");
		lblAreaTotal.setBounds(30, 150, 60, 30);
		contentPane.add(lblAreaTotal);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(100, 30, 60, 30);
		txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(5,5,5,5));
		contentPane.add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(100, 70, 60, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5,5,5,5));
		contentPane.add(txtAltura);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(100, 110, 60, 30);
		txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVolumen.setMargin(new Insets(5,5,5,5));
		txtVolumen.setFocusable(false);
		contentPane.add(txtVolumen);
		
		txtAreaTotal = new JTextField();
		txtAreaTotal.setBounds(100, 150, 60, 30);
		txtAreaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaTotal.setMargin(new Insets(5,5,5,5));
		txtAreaTotal.setFocusable(false);
		contentPane.add(txtAreaTotal);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60,200,100,30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
		
	private void btnCalcular_Click() {
		int radio = Integer.parseInt( txtRadio.getText() );
		int altura = Integer.parseInt( txtAltura.getText() );
		
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
		double areaTotal = 2 * Math.PI * radio * ( radio + altura );
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtVolumen.setText( df.format(volumen) );
		txtAreaTotal.setText( df.format(areaTotal) );
		
	}
	
}
