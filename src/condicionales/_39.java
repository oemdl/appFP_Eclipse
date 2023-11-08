package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _39 extends JFrame {
	private static final long serialVersionUID = 1L;

	JTextField txtHoras, txtTMalos, txtTBuenos, txtGrado;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_39 frame = new _39();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _39() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHoras = new JLabel("Horas Tardanza :");
		lblHoras.setBounds(40, 40, 120, 30);
		getContentPane().add(lblHoras);
	
		JLabel lblTMalos = new JLabel("Tornillos Malos :");
		lblTMalos.setBounds(40, 80, 120, 30);
		getContentPane().add(lblTMalos);
		
		JLabel lblTBuenos = new JLabel("Tornillos Buenos :");
		lblTBuenos.setBounds(40, 120, 120, 30);
		getContentPane().add(lblTBuenos);
		
		JLabel lblGrado = new JLabel("Grado : ");
		lblGrado.setBounds(40, 160, 120, 30);
		getContentPane().add(lblGrado);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(150, 40, 60, 30);
		txtHoras.setHorizontalAlignment( SwingConstants.RIGHT );
		txtHoras.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtHoras);
		
		txtTMalos = new JTextField();
		txtTMalos.setBounds(150, 80, 60, 30);
		txtTMalos.setHorizontalAlignment( SwingConstants.RIGHT );
		txtTMalos.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtTMalos);
		
		txtTBuenos = new JTextField();
		txtTBuenos.setBounds(150, 120, 60, 30);
		txtTBuenos.setHorizontalAlignment( SwingConstants.RIGHT );
		txtTBuenos.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtTBuenos);
		
		txtGrado = new JTextField();
		txtGrado.setBounds(150, 160, 60, 30);
		txtGrado.setFocusable(false);
		txtGrado.setHorizontalAlignment( SwingConstants.RIGHT );
		txtGrado.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtGrado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	protected void btnCalcular_actionPerformed() {
		boolean bHoras = Double.parseDouble( txtHoras.getText() ) < 1.5;   
		boolean bTMalos = Double.parseDouble( txtTMalos.getText() ) < 300;   
		boolean bTBuenos = Double.parseDouble( txtTBuenos.getText() ) > 10000;   
		
		if ( !bHoras && !bTMalos && !bTBuenos ) txtGrado.setText("5");
		else if (  bHoras && !bTMalos && !bTBuenos ) txtGrado.setText("7");
		else if ( !bHoras &&  bTMalos && !bTBuenos ) txtGrado.setText("8");
		else if ( !bHoras && !bTMalos &&  bTBuenos ) txtGrado.setText("9");
		else if (  bHoras &&  bTMalos && !bTBuenos ) txtGrado.setText("12");
		else if (  bHoras && !bTMalos &&  bTBuenos ) txtGrado.setText("13");
		else if ( !bHoras &&  bTMalos &&  bTBuenos ) txtGrado.setText("15");
		else if (  bHoras &&  bTMalos &&  bTBuenos ) txtGrado.setText("20");
	}

}
