package otros;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;

public class frmTR_2022_2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JPanel pnlLogin, pnlMenu, pnlClave, pnlPassword, pnlSaldo;
	JPasswordField txtDni, txtPassword;
	JTextField txtMonto;
	JButton btnContinuar;

	JLabel lblTitulo, lblSubTitulo, lblTextoRetiro, lblM03, lblM04;
	JButton btnMenu01,btnMenu02,btnMenu03,btnMenu04,btnMenu05,btnMenu06,btnMenu07,btnMenu08; 

	Insets insets = new Insets(5,2,5,2);
	String sDni,sTitulo,sSubTitulo;
	String[] aMenu;
	
	boolean bSoles = true, bFin = false;
	int Cancelar;
	double Monto = 0, Saldo = 100.00, Dolar = 3.60;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTR_2022_2 frame = new frmTR_2022_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frmTR_2022_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		// Login
		pnlLogin = new JPanel();
		pnlLogin.setBounds(0,0,500,400);
		pnlLogin.setLayout(null);
		contentPane.add(pnlLogin);
		
		JLabel lblM01 = new JLabel("Ingresa tu DNI"); 
		lblM01.setBounds(120,50,200,50);
		lblM01.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblM01.setForeground( Color.red );
		pnlLogin.add(lblM01);
		
		txtDni= new JPasswordField();
		txtDni.setBounds(120,120,200,50 );
		txtDni.setBorder(null);
		txtDni.setEchoChar('X');
		txtDni.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDni.setForeground(Color.red);
		txtDni.setHorizontalAlignment(SwingConstants.CENTER);
		txtDni.setOpaque(false);
		pnlLogin.add(txtDni);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(120,172,200,2);
		separator.setForeground(Color.red);
		pnlLogin.add(separator);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(320,300,150,50);
		btnContinuar.setBorderPainted(false);
		btnContinuar.setEnabled(false);
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnContinuar.setFocusPainted(false);
		pnlLogin.add(btnContinuar);
		
		txtDni.addKeyListener(new KeyAdapter() { @Override
			public void keyTyped(KeyEvent e) { txtDni_keyTyped(e); } });
		txtDni.addCaretListener(new CaretListener() { 
			public void caretUpdate(CaretEvent e) { txtDni_caretUpdate(); } });
		
		btnContinuar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { btnContinuar_Click(); } });
		
		// Menú
		pnlMenu = new JPanel();
		pnlMenu.setBounds(0,0,500,400);
		pnlMenu.setLayout(null);
		pnlMenu.setVisible(false);
		contentPane.add(pnlMenu);
		
		lblTitulo = new JLabel();
		lblTitulo.setBounds(30,10,400,30);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setForeground( Color.red );
		pnlMenu.add(lblTitulo);
		
		lblSubTitulo = new JLabel();
		lblSubTitulo.setBounds(30,40,400,30);
		lblSubTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnlMenu.add(lblSubTitulo);
		
		lblTextoRetiro = new JLabel(); 
		lblTextoRetiro.setBounds(50,40,400,100);
		lblTextoRetiro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTextoRetiro.setForeground( Color.red );
		lblTextoRetiro.setHorizontalAlignment(SwingConstants.CENTER);
		pnlMenu.add(lblTextoRetiro);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(210,105,80,30);
		txtMonto.setBorder(null);
		txtMonto.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMonto.setForeground(Color.red);
		txtMonto.setMargin( new Insets(5,5,5,5));
		txtMonto.setOpaque(false);
		txtMonto.setVisible(false);
		pnlMenu.add(txtMonto);
		
		btnMenu01 = new JButton();		
		btnMenu01.setBounds(30,100,200,50);
		btnMenu01.setBorderPainted(false);
		btnMenu01.setFocusPainted(false);
		btnMenu01.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu01.setIconTextGap(10);
		btnMenu01.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/left.png")));
		btnMenu01.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu01.setMargin( insets );
		pnlMenu.add(btnMenu01);
		
		btnMenu02 = new JButton();
		btnMenu02.setBounds(30,160,200,50);
		btnMenu02.setBorderPainted(false);
		btnMenu02.setFocusPainted(false);
		btnMenu02.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu02.setIconTextGap(10);
		btnMenu02.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/left.png")));
		btnMenu02.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu02.setMargin( insets );
		pnlMenu.add(btnMenu02);
		
		btnMenu03 = new JButton();
		btnMenu03.setBounds(30,220,200,50);
		btnMenu03.setBorderPainted(false);
		btnMenu03.setFocusPainted(false);
		btnMenu03.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu03.setIconTextGap(10);
		btnMenu03.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/left.png")));
		btnMenu03.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu03.setMargin( insets );
		pnlMenu.add(btnMenu03);
		
		btnMenu04 = new JButton();
		btnMenu04.setBounds(30,280,200,50);
		btnMenu04.setBorderPainted(false);
		btnMenu04.setFocusPainted(false);
		btnMenu04.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu04.setIconTextGap(10);
		btnMenu04.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/left.png")));
		btnMenu04.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu04.setMargin( insets );
		pnlMenu.add(btnMenu04);
		
		btnMenu05 = new JButton();
		btnMenu05.setBounds(250,100,200,50);
		btnMenu05.setBorderPainted(false);
		btnMenu05.setFocusPainted(false);
		btnMenu05.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu05.setIconTextGap(10);
		btnMenu05.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/right.png")));
		btnMenu05.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMenu05.setHorizontalTextPosition(SwingConstants.LEFT);
		btnMenu05.setMargin( insets );
		pnlMenu.add(btnMenu05);
		
		btnMenu06 = new JButton();
		btnMenu06.setBounds(250,160,200,50);
		btnMenu06.setBorderPainted(false);
		btnMenu06.setFocusPainted(false);
		btnMenu06.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu06.setIconTextGap(10);
		btnMenu06.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/right.png")));
		btnMenu06.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMenu06.setHorizontalTextPosition(SwingConstants.LEFT);
		btnMenu06.setMargin( insets );
		pnlMenu.add(btnMenu06);
		
		btnMenu07 = new JButton();
		btnMenu07.setBounds(250,220,200,50);
		btnMenu07.setBorderPainted(false);
		btnMenu07.setFocusPainted(false);
		btnMenu07.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu07.setIconTextGap(10);
		btnMenu07.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/right.png")));
		btnMenu07.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMenu07.setHorizontalTextPosition(SwingConstants.LEFT);
		btnMenu07.setMargin( insets );
		pnlMenu.add(btnMenu07);
		
		btnMenu08 = new JButton();
		btnMenu08.setBounds(250,280,200,50);
		btnMenu08.setBorderPainted(false);
		btnMenu08.setFocusPainted(false);
		btnMenu08.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenu08.setIconTextGap(10);
		btnMenu08.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/right.png")));
		btnMenu08.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMenu08.setHorizontalTextPosition(SwingConstants.LEFT);
		btnMenu08.setMargin( insets );
		pnlMenu.add(btnMenu08);

		txtMonto.addKeyListener(new KeyAdapter() { @Override
			public void keyTyped(KeyEvent e) { txtMonto_keyTyped(e); } });
		
		btnMenu01.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu01); } });
		btnMenu02.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu02); } });
		btnMenu03.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu03); } });
		btnMenu04.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu04); } });
		btnMenu05.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu05); } });
		btnMenu06.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu06); } });
		btnMenu07.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu07); } });
		btnMenu08.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { btnMenu_Click(btnMenu08); } });

		// Panel de contraseña
		pnlClave = new JPanel();
		pnlClave.setBounds(0,0,500,400);
		pnlClave.setLayout(null);
		pnlClave.setVisible(false);
		contentPane.add(pnlClave);

		pnlPassword = new JPanel();
		pnlPassword.setBounds(250,0,230,350);
		pnlPassword.setBorder(null);
		pnlPassword.setBackground(Color.darkGray);
		pnlPassword.setLayout(null);
		pnlClave.add(pnlPassword);
		
		JLabel imgClave = new JLabel();
		imgClave.setBounds(10,10,230,350);
		imgClave.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/right.png")));
		pnlClave.add(imgClave);
		
		JLabel lblM02 = new JLabel("Ingresa tu clave"); 
		lblM02.setBounds(50,50,200,50);
		lblM02.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblM02.setForeground( Color.red );
		pnlPassword.add(lblM02);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(70,100,100,30 );
		txtPassword.setBorder(null);
		txtPassword.setEchoChar('X');
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPassword.setForeground(Color.red);
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setOpaque(false);
		pnlPassword.add(txtPassword);
		
		JSeparator separatorClave = new JSeparator();
		separatorClave.setBounds(70,150,100,2);
		separatorClave.setForeground(Color.red);
		pnlPassword.add(separatorClave);

		txtPassword.addKeyListener(new KeyAdapter() { @Override
			public void keyTyped(KeyEvent e) { txtPassword_keyTyped(e); } });
		txtPassword.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) { txtPassword_caretUpdate(); } });
		
		// Ver saldo por pantalla
		pnlSaldo = new JPanel();
		pnlSaldo.setBounds(0,0,500,400);
		pnlSaldo.setLayout(null);
		pnlSaldo.setVisible(false);
		contentPane.add(pnlSaldo);

		JLabel imgSaldo = new JLabel();
		imgSaldo.setBounds(10,10,230,350);
		imgSaldo.setIcon(new ImageIcon(frmTR_2022_2.class.getResource("/otros/right.png")));
		pnlSaldo.add(imgSaldo);
		
		lblM03 = new JLabel(); 
		lblM03.setBounds(250,50,250,80);
		lblM03.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblM03.setForeground( Color.red );
		pnlSaldo.add(lblM03);

		lblM04 = new JLabel(); 
		lblM04.setBounds(300,250,250,50);
		pnlSaldo.add(lblM04);
		
	}

	// Panel Login
	private void txtDni_caretUpdate() {
		btnContinuar.setEnabled( txtDni.getPassword().length == 8 );
	}

	private void txtDni_keyTyped(KeyEvent e) {
		if ( !Character.isDigit( e.getKeyChar() ) || txtDni.getPassword().length == 8 )
			e.consume();
	}

	private void btnContinuar_Click() {
		pnlLogin.setVisible(false);
		pnlMenu.setVisible(true);

		sTitulo = "Menú Principal";
		sSubTitulo = "Seleccione transacción deseada";
		aMenu = new String[] { "Retiro","","","","Adelanto de Sueldo","Transferencias","Consultas","Más Operaciones" };
		setBotones();
	}

	// Panel Menu -> Otras cantidades
	private void txtMonto_keyTyped(KeyEvent e) {
		if ( txtMonto.getText().equals("0") ) txtMonto.setText("");
		if ( !Character.isDigit( e.getKeyChar() ) )
			e.consume();
	}
		
	// Panel Clave
	private void txtPassword_caretUpdate() {
		if ( String.valueOf( txtPassword.getPassword() ).equals("1234") ) {
			pnlClave.setVisible(false);
			pnlMenu.setVisible(true);
			sTitulo = "";
			sSubTitulo = "";
			txtMonto.setText("");
			txtMonto.setVisible(false);
			
			if ( Saldo - Monto > 0 ) {
				Saldo -= Monto;
				lblTextoRetiro.setText( "<html><p>Sé parte del cambio, cuidemos al planeta</p><p>Indícanos cómo deseas recibir tu saldo</p></html>" );
				aMenu = new String[] { "","","Imprimir voucher","En pantalla","","","","No ver saldo" };
			} else {
				Monto = 0;
				lblTextoRetiro.setText( "<html><p>No cuenta con saldo suficiente para esta operación</p><p>Pulse \"Continuar\" para regresar al menú principal</p></html>" );
				aMenu = new String[] { "","","","","","","","Continuar" };
			}			
			
			setBotones();
			btnMenu01.setVisible(false);
			btnMenu02.setVisible(false);
			btnMenu03.setVisible(Monto > 0);
			btnMenu04.setVisible(Monto > 0);
			btnMenu05.setVisible(false);
			btnMenu06.setVisible(false);
			btnMenu07.setVisible(false);		
		}
	}

	private void txtPassword_keyTyped(KeyEvent e) {
		if ( !Character.isDigit( e.getKeyChar() ) || txtPassword.getPassword().length == 4 )
			e.consume();
	}

	private void btnMenu_Click(JButton btn) {
		String sTexto = btn.getText();
		
		if ( sTexto.isEmpty() ) return;
		
		if ( sTexto.contains("Retiro") ) {
			Cancelar = 1;
			sTitulo = "Retiro";
			sSubTitulo = "Seleccione el tipo de moneda a retirar";
			aMenu = new String[] { "","Soles ( S/ )","Doláres ( USD )","","","","","Cancelar" };
			setBotones();
			btnMenu01.setVisible(false);
			btnMenu05.setVisible(false);
			
		} else if ( sTexto.contains("Soles") || sTexto.contains("Doláres") ) {
			bSoles = sTexto.contains("Soles");
			Cancelar = 2;
			sTitulo = "Retiro en Soles";
			sSubTitulo = "";
			aMenu = new String[] { "Ahorro S/","","","","","","","Cancelar" };
			setBotones();
			
		} else if ( sTexto.contains("Ahorro S/") ) {
			Cancelar = 3;
			sTitulo = "Retiro";
			sSubTitulo = "Seleccione el Monto a Retirar";
			if ( bSoles ) aMenu = new String[] { "S/ 20","S/ 50","S/ 100","S/ 200","S/ 500","S/ 3000","Otras Cantidades","Cancelar" };
			else aMenu = new String[] { "USD 20","S/ 50","S/ 100","S/ 200","S/ 500","S/ 3000","Otras Cantidades","Cancelar" };
			setBotones();
			lblTextoRetiro.setText("");
			txtMonto.setVisible(false);
			
		} else if ( sTexto.startsWith("S/") || sTexto.startsWith("USD") ) {
			pnlMenu.setVisible(false);
			pnlClave.setVisible(true);
			txtPassword.setText("");
			txtPassword.requestFocus();
			
			Monto =  Double.parseDouble( sTexto.substring( bSoles ? 3 : 4 ) );
			
		} else if ( sTexto.contains("Otras Cantidades") ) {
			Cancelar = 4;
			sTitulo = "";
			sSubTitulo = "";
			if ( bSoles ) lblTextoRetiro.setText( "<html><p>&nbsp;&nbsp;&nbsp;Ingresa monto a retirar en soles</p><p>min: S/ 20 - max: S/ 3000 (6am - 10pm)</p><p>min: S/ 20 - max: S/ 500 (10pm - 6am)</p><pre>          S/</pre></html>" );
			else lblTextoRetiro.setText( "<html><p>&nbsp;&nbsp;&nbsp;Ingresa monto a retirar en soles</p><p>min: S/ 20 - max: S/ 3000 (6am - 10pm)</p><p>min: S/ 20 - max: S/ 500 (10pm - 6am)</p><pre>          S/</pre></html>" );
			txtMonto.setText("0");
			txtMonto.setVisible(true);
			txtMonto.requestFocus();
			aMenu = new String[] { "","","","","","Confirmar","Corregir","Cancelar" };
			
			setBotones();
			btnMenu01.setVisible(false);
			btnMenu02.setVisible(false);
			btnMenu03.setVisible(false);
			btnMenu04.setVisible(false);
			btnMenu05.setVisible(false);
			
		} else if ( sTexto.contains("Confirmar") ) {
			pnlMenu.setVisible(false);
			pnlClave.setVisible(true);
			txtPassword.setText("");
			txtPassword.requestFocus();
			Monto =  Double.parseDouble( txtMonto.getText() );
			if ( !bSoles ) Monto *= Dolar;
			
		} else if ( sTexto.contains("Corregir") ) {
			txtMonto.setText("0");
			txtMonto.requestFocus();
			
		} else if ( sTexto.contains("En pantalla") ) {
			pnlMenu.setVisible(false);
			pnlSaldo.setVisible(true);
			DecimalFormat df = new DecimalFormat("##.00");
			lblM03.setText("<html><p>Retira tu efectivo</p></br><p>No olvides tu tarjeta y</p><p>verifica tu dinero</p></html>" );
			lblM04.setText("<html><p>Monto S/ " + df.format(Monto) +"</p><p>Saldo contable S/ " + df.format(Saldo) + "</p><p>Saldo Disponible S/ " +  df.format(Saldo) + "</p></html>" );
			
			try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
			
			
		} if ( sTexto.contains("Continuar") ) {
			lblTextoRetiro.setText("");
			btnContinuar_Click();
			
		} else if ( sTexto.contains("Cancelar") )
			if ( Cancelar == 1 ) btnContinuar_Click();
			else {
				btnMenu01.setText( Cancelar == 2 ? "Retiro" : Cancelar == 3 ? "Soles" : "Ahorro S/");
				btnMenu_Click(btnMenu01);
			}
		
	}
	 
	private void setBotones() {
		lblTitulo.setText( sTitulo );
		lblSubTitulo.setText( sSubTitulo );
		JButton[] aBotones = { btnMenu01,btnMenu02,btnMenu03,btnMenu04,btnMenu05,btnMenu06,btnMenu07,btnMenu08 };
		
		for( int i = 0; i < aBotones.length; i++ ) {
			aBotones[i].setText( aMenu[i] );
			aBotones[i].setVisible(true);
		}
	}
	
}

/*
 Tareas para TR :
	0. Saldo Inicial = 100.00
	2. Verificar con vídeo el texto en Dolar "USD $ ..." linea 419 y 425
	3. Completar los retiros en doláres -> línea 414
	4. Actualizar el mensaje para doláres -> línea 432
	5. Monto si el Doláres -> Monto * Dolar 
	6. Agregar imagen  pnlPassword, pnlSaldo, pnlMenu cuando se muestra "imprimir voucher"
	7. Al pnlSaldo agregar btnContinuar_Menu -> btnContinuar_Click()
	8. pnlSaldo -> Imprimir voucher == En pantalla,  No ver Saldo --> btnContinuar_Click()
*/