package otros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class frmTR_2022_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox chkP1, chkP2, chkP3, chkP4;
	private JTextField txtC1, txtC2, txtC3, txtC4, txtImporte, txtDescuento, txtTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTR_2022_1 frame = new frmTR_2022_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frmTR_2022_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 540, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblFactura = new JLabel("FACTURA",SwingConstants.CENTER);
		lblFactura.setBounds(10,1,498,80);
		lblFactura.setBorder(BorderFactory.createLineBorder(Color.black));
		lblFactura.setFont( new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblFactura);
		
		JLabel lblSN = new JLabel("S/N",SwingConstants.CENTER);
		lblSN.setBounds(10,90,30,30);
		lblSN.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblSN);
		
		JLabel lblDescripcion = new JLabel("Descripcion",SwingConstants.CENTER);
		lblDescripcion.setBounds(40,90,150,30);
		lblDescripcion.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("Precio",SwingConstants.CENTER);
		lblPrecio.setBounds(190,90,120,30);
		lblPrecio.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad",SwingConstants.CENTER);
		lblCantidad.setBounds(310,90,100,30);
		lblCantidad.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblCantidad);
		
		JLabel lblSubTotal = new JLabel("Sub Total",SwingConstants.CENTER);
		lblSubTotal.setBounds(410,90,100,30);
		lblSubTotal.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblSubTotal);

		chkP1 = new JCheckBox();
		chkP1.setBounds(10,120,30,30);
		chkP1.setHorizontalAlignment(SwingConstants.CENTER);
		chkP1.setBorderPainted(true);
		chkP1.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(chkP1);

		JLabel lblP1 = new JLabel(" Amoxicilina 500 mg");
		lblP1.setBounds(40,120,150,30);
		lblP1.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP1);
		
		JLabel lblP11 = new JLabel("80.00", SwingConstants.CENTER);
		lblP11.setBounds(190,120,120,30);
		lblP11.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP11);
		
		txtC1 = new JTextField();
		txtC1.setBounds(310,120,100,30);
		txtC1.setFocusable(false);
		txtC1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtC1);
		
		JLabel lblST1 = new JLabel("", SwingConstants.CENTER);
		lblST1.setBounds(410,120,100,30);
		lblST1.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblST1);

		chkP2 = new JCheckBox();
		chkP2.setBounds(10, 150, 30, 30);
		chkP2.setHorizontalAlignment(SwingConstants.CENTER);
		chkP2.setBorderPainted(true);
		chkP2.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(chkP2);
		
		JLabel lblP2 = new JLabel(" Ibuprofeno 125 mg");
		lblP2.setBounds(40,150,150,30);
		lblP2.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP2);		

		JLabel lblP22 = new JLabel("50.00", SwingConstants.CENTER);
		lblP22.setBounds(190,150,120,30);
		lblP22.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP22);

		txtC2 = new JTextField();
		txtC2.setBounds(310,150,100,30);
		txtC2.setFocusable(false);
		txtC2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtC2);
				
		JLabel lblST2 = new JLabel("", SwingConstants.CENTER);
		lblST2.setBounds(410,150,100,30);
		lblST2.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblST2);

		chkP3 = new JCheckBox();
		chkP3.setBounds(10, 180, 30, 30);
		chkP3.setHorizontalAlignment(SwingConstants.CENTER);
		chkP3.setBorderPainted(true);
		chkP3.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(chkP3);
		
		JLabel lblP3 = new JLabel(" Antagina 100 mg");
		lblP3.setBounds(40,180,150,30);
		lblP3.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP3);		
		
		JLabel lblP33 = new JLabel("60.00", SwingConstants.CENTER);
		lblP33.setBounds(190,180,120,30);
		lblP33.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP33);
		
		txtC3 = new JTextField();
		txtC3.setBounds(310,180,100,30);
		txtC3.setFocusable(false);
		txtC3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtC3);

		JLabel lblST3 = new JLabel("", SwingConstants.CENTER);
		lblST3.setBounds(410,180,100,30);
		lblST3.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblST3);

		chkP4 = new JCheckBox();
		chkP4.setBounds(10, 210, 30, 30);
		chkP4.setHorizontalAlignment(SwingConstants.CENTER);
		chkP4.setBorderPainted(true);
		chkP4.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(chkP4);
		
		JLabel lblP4 = new JLabel(" Penicilina 1000 mg");
		lblP4.setBounds(40,210,150,30);
		lblP4.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP4);		
		
		JLabel lblP44 = new JLabel("40.00", SwingConstants.CENTER);
		lblP44.setBounds(190,210,120,30);
		lblP44.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblP44);
		
		txtC4 = new JTextField();
		txtC4.setBounds(310,210,100,30);
		txtC4.setFocusable(false);
		txtC4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtC4);

		JLabel lblST4 = new JLabel("", SwingConstants.CENTER);
		lblST4.setBounds(410,210,100,30);
		lblST4.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblST4);
		
		JPanel pnlGrupo = new JPanel();
		pnlGrupo.setBorder(new TitledBorder(null, "  Totales y descuentos  ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlGrupo.setBounds(10,260,230,150);
		pnlGrupo.setLayout(null);
		contentPane.add(pnlGrupo);
		
		JLabel lblImporte = new JLabel("Importe parcial : S/");
		lblImporte.setBounds(10,20,100,30);
		pnlGrupo.add(lblImporte);
		
		JLabel lblDescuento = new JLabel("Descuento       : S/");
		lblDescuento.setBounds(10,60,100,30);
		pnlGrupo.add(lblDescuento);
		
		JLabel lblTotal = new JLabel("Total a Pagar    : S/");
		lblTotal.setBounds(10,100,100,30);
		pnlGrupo.add(lblTotal);
		
		txtImporte = new JTextField();
		txtImporte.setBounds(130,20,80,30);
		txtImporte.setFocusable(false);
		txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlGrupo.add(txtImporte);

		txtDescuento = new JTextField();
		txtDescuento.setBounds(130,60,80,30);
		txtDescuento.setFocusable(false);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlGrupo.add(txtDescuento);

		txtTotal = new JTextField();
		txtTotal.setBounds(130,100,80,30);
		txtTotal.setFocusable(false);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlGrupo.add(txtTotal);

		JPanel pnlOpciones = new JPanel();
		pnlOpciones.setBorder(new TitledBorder(null, "  Opciones  ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlOpciones.setBounds(250,300,270,110);
		pnlOpciones.setLayout(null);
		contentPane.add(pnlOpciones);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setIcon(new ImageIcon("calcular64.png"));
		btnCalcular.setBounds(10, 20, 80, 80);
		pnlOpciones.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		//btnNuevo.setIcon(new ImageIcon("calcular64.png"));
		btnNuevo.setBounds(95, 20, 80, 80);
		pnlOpciones.add(btnNuevo);

		JButton btnSalir = new JButton("Salir");
		//btnSalir.setIcon(new ImageIcon("calcular64.png"));
		btnSalir.setBounds(180, 20, 80, 80);
		pnlOpciones.add(btnSalir);

		chkP1.addChangeListener(new ChangeListener() { public void stateChanged(ChangeEvent e) { chk_StateChanged( txtC1, chkP1 ); } });
		chkP2.addChangeListener(new ChangeListener() { public void stateChanged(ChangeEvent e) { chk_StateChanged( txtC2, chkP2 ); } });
		chkP3.addChangeListener(new ChangeListener() { public void stateChanged(ChangeEvent e) { chk_StateChanged( txtC3, chkP3 ); } });
		chkP4.addChangeListener(new ChangeListener() { public void stateChanged(ChangeEvent e) { chk_StateChanged( txtC4, chkP4 ); } });

		btnCalcular.addActionListener( new ActionListener() { @Override public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
		btnNuevo.addActionListener( new ActionListener() { @Override public void actionPerformed(ActionEvent e) { btnNuevo_Click(); } });
		btnSalir.addActionListener( new ActionListener() { @Override public void actionPerformed(ActionEvent e) { btnSalir_Click(); } });
		
	}

	protected void chk_StateChanged(JTextField txt, JCheckBox chk) {
		txt.setFocusable( chk.isSelected() );
		if ( chk.isSelected() ) txt.requestFocus();	
		else txt.setText("");
	}

	protected void btnCalcular_Click() {
		if ( ( chkP1.isSelected() && !txtC1.getText().equals("") ) ||
			 ( chkP2.isSelected() && !txtC2.getText().equals("") )	
				) { 
			//calcular totales
		}
		else JOptionPane.showMessageDialog(this, "Seleccione un producto e ingresa una cantidad");
	}

	protected void btnNuevo_Click() {
		chkP1.setSelected(false);  // todos chk
		
		txtC1.setText(""); // todos txtCx
	}

	protected void btnSalir_Click() {
		if ( JOptionPane.showConfirmDialog(this, "Desea salir de la app", "Salir",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE  ) == JOptionPane.YES_OPTION )
			System.exit(EXIT_ON_CLOSE);
		
	}

}
