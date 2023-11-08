package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _01 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtUnidades, txtPrecio, txtCompra, txtDescuento, txtTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01 frame = new _01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades : ");
		lblUnidades.setBounds(30, 30, 80, 25);
		getContentPane().add(lblUnidades);
		
		JLabel lblPrecio = new JLabel("Precio : ");
		lblPrecio.setBounds(30, 60, 80, 25);
		getContentPane().add(lblPrecio);
		
		JLabel lblCompra = new JLabel("Compra : ");
		lblCompra.setBounds(30, 90, 80, 25);
		getContentPane().add(lblCompra);
		
		JLabel lblDescuento = new JLabel("Descuento : ");
		lblDescuento.setBounds(30, 120, 80, 25);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotal = new JLabel("Total : ");
		lblTotal.setBounds(30, 150, 80, 25);
		getContentPane().add(lblTotal);
		
		Insets insets = new Insets(2, 5, 2, 5);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(120, 30, 60, 25);
		txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUnidades.setMargin( insets );
		getContentPane().add(txtUnidades);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(120, 60, 60, 25);
		txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrecio.setMargin( insets );
		txtPrecio.setFocusable(false);
		getContentPane().add(txtPrecio);
		
		txtCompra = new JTextField();
		txtCompra.setBounds(120, 90, 60, 25);
		txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCompra.setMargin( insets );
		txtCompra.setFocusable(false);
		getContentPane().add(txtCompra);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(120, 120, 60, 25);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin( insets );
		txtDescuento.setFocusable(false);
		getContentPane().add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(120, 150, 60, 25);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin( insets );
		txtTotal.setFocusable(false);
		getContentPane().add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed(); } });
	}
	
	private void btnCalcular_actionPerformed() {
		int unidades = Integer.parseInt( txtUnidades.getText() );

		int precio = unidades <= 25 ? 27 : unidades >= 51 ? 23 : 25;

		int compra = unidades * precio;
		double descuento = ( unidades >= 50 ? 0.15 : 0.05 ) * compra;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtPrecio.setText( df.format(precio) );
		txtCompra.setText( df.format(compra) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(compra - descuento) );
	}

}