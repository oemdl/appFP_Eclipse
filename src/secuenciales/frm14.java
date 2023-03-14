package secuenciales;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm14 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTiempo01, lblTiempo02, lblRpta;
	JTextField txtH1, txtH2, txtRpta;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 250, 250);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(contentPane);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		lblTiempo01 = new JLabel("Tiempo 01 :");
		lblTiempo01.setBounds(30, 30, 80, 30);
		contentPane.add(lblTiempo01);
		
		lblTiempo02 = new JLabel("Tiempo 02 :");
		lblTiempo02.setBounds(30, 65, 80, 30);
		contentPane.add(lblTiempo02);
		
		lblRpta = new JLabel("Rpta      :");
		lblRpta.setBounds(30, 100, 80, 30);
		contentPane.add(lblRpta);
		
		txtH1 = new JTextField();
		txtH1.setBounds(110, 30, 80, 30);
		contentPane.add(txtH1);
		
		txtH2 = new JTextField();
		txtH2.setBounds(110, 65, 80, 30);
		contentPane.add(txtH2);
		
		txtRpta = new JTextField();
		txtRpta.setBounds(110, 100, 80, 30);
		txtRpta.setFocusable(false);
		contentPane.add(txtRpta);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 150, 80, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
	
		btnCalcular.addActionListener( new ActionListener() { @Override public void actionPerformed(ActionEvent e) { btnCalcular_CLick(); } });
	}

	protected void btnCalcular_CLick() {	//  01234567
		String sT01 = txtH1.getText(); 		// "hh:mm:ss"
		String sT02 = txtH2.getText(); 		// "23:15:34"
		
		int H1 = Integer.parseInt( sT01.substring(0,2) );
		int M1 = Integer.parseInt( sT01.substring(3,5) );
		int S1 = Integer.parseInt( sT01.substring(6) );
		
		int H2 = Integer.parseInt( sT02.substring(0,2) );
		int M2 = Integer.parseInt( sT02.substring(3,5) );
		int S2 = Integer.parseInt( sT02.substring(6) );
		
		
		int Tiempo = H1 * 3600 + M1 * 60 + S1 + H2 * 3600 + M2 * 60 + S2;
		H1 = Tiempo / 3600;
		M1 = (Tiempo % 3600) / 60;
		S1 = Tiempo % 60;
		
		//txtRpta.setText( String.format("%s:%s:%s", H1, M1, S1) );
		txtRpta.setText(  "" + H1 + ":" + M1 + ":" + S1  );
	}

}
