package secuenciales;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm04 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JLabel lblPies, lblPulgadas, lblMetros;
	JTextField txtPies, txtPulgadas, txtMetros;
	JButton btnCalcular;
	
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
		setBounds(0, 0, 270, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);

		lblPies = new JLabel("Pies :");
		lblPies.setBounds(30,30,60,30);
		contentPane.add(lblPies);

		lblPulgadas = new JLabel("Pulgadas :");
		lblPulgadas.setBounds(30,65,60,30);
		contentPane.add(lblPulgadas);

		lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(30,100,60,30);
		contentPane.add(lblMetros);
	
		txtPies = new JTextField();
		txtPies.setBounds(120,30,80,30);
		txtPies.setMargin(new Insets(5,5,5,5));
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(txtPies);
	
		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(120,65,80,30);
		txtPulgadas.setMargin(new Insets(5,5,5,5));
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(txtPulgadas);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(120,100,80,30);
		txtMetros.setMargin(new Insets(5,5,5,5));
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setFocusable(false);
		contentPane.add(txtMetros);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(85,150,100,30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
	}

	protected void btnCalcular_Click() {
		int pies = Integer.parseInt( txtPies.getText() );
		int pulgadas = Integer.parseInt( txtPulgadas.getText() );
		
		double metros = (pies * 12 + pulgadas) * 2.54 / 100;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtMetros.setText( df.format(metros) );
	}

}
