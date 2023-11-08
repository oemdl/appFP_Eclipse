package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class _02 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtUnidades;
	JTextArea txaRpta;

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
		setBounds(0, 0, 250, 320);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades : ");
		lblUnidades.setBounds(30, 30, 80,25);
		getContentPane().add(lblUnidades);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(120, 30, 50, 25);
		txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUnidades.setMargin( new Insets(2, 5, 2, 5) );
		getContentPane().add(txtUnidades);
		
		txaRpta = new JTextArea();
		txaRpta.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txaRpta.setFocusable(false);
		
		JScrollPane jsPane = new JScrollPane(txaRpta);
		jsPane.setBounds(40, 60, 150, 150);
		getContentPane().add(jsPane);
				
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}
	
	private void btnCalcular_actionPerformed() {
		int unidades = Integer.parseInt( txtUnidades.getText() );
		
		int precio = 20;
		int compra = unidades * precio;
		int caramelos = unidades <= 50 ? 5 : unidades > 100 ? 15 : 10;
		double descuento = ( compra <= 500 ? 0.12 : compra > 700 ? 0.16 : 0.14 ) * compra;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.setText("");
		txaRpta.append( " Precio    : " + df.format(precio) + "\n" );
		txaRpta.append( " Compra    : " + df.format(compra) + "\n" );
		txaRpta.append( " Descuento : " + df.format(descuento) + "\n" );
		txaRpta.append( " Total     : " + df.format(compra - descuento) + "\n" );
		txaRpta.append( " Caramelos : " + df.format(caramelos) + "\n" );
	}

}