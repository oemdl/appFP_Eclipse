package repetitivos;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Insets;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class frm19 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JButton btn00,btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09;
	Insets insets = new Insets(2, 2, 2, 2);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 200, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);
		
		btn01 = new JButton();
		btn01.setBounds(30,30,30,30);
		btn01.setBorderPainted(false);
		btn01.setFocusPainted(false);
		btn01.setMargin(insets);
		contentPane.add(btn01);

		btn02 = new JButton();
		btn02.setBounds(70,30,30,30);
		btn02.setBorderPainted(false);
		btn02.setFocusPainted(false);
		btn02.setMargin(insets);
		contentPane.add(btn02);
		
		btn03 = new JButton();
		btn03.setBounds(110,30,30,30);
		btn03.setBorderPainted(false);
		btn03.setFocusPainted(false);
		btn03.setMargin(insets);
		contentPane.add(btn03);
		
		btn04 = new JButton();
		btn04.setBounds(30,70,30,30);
		btn04.setBorderPainted(false);
		btn04.setFocusPainted(false);
		btn04.setMargin(insets);
		contentPane.add(btn04);

		btn05 = new JButton();
		btn05.setBounds(70,70,30,30);
		btn05.setBorderPainted(false);
		btn05.setFocusPainted(false);
		btn05.setMargin(insets);
		contentPane.add(btn05);
		
		btn06 = new JButton();
		btn06.setBounds(110,70,30,30);
		btn06.setBorderPainted(false);
		btn06.setFocusPainted(false);
		btn06.setMargin(insets);
		contentPane.add(btn06);
		
		btn07 = new JButton();
		btn07.setBounds(30,110,30,30);
		btn07.setBorderPainted(false);
		btn07.setFocusPainted(false);
		btn07.setMargin(insets);
		contentPane.add(btn07);

		btn08 = new JButton();
		btn08.setBounds(70,110,30,30);
		btn08.setBorderPainted(false);
		btn08.setFocusPainted(false);
		btn08.setMargin(insets);
		contentPane.add(btn08);
		
		btn09 = new JButton();
		btn09.setBounds(110,110,30,30);
		btn09.setBorderPainted(false);
		btn09.setFocusPainted(false);
		btn09.setMargin(insets);
		contentPane.add(btn09);
		
		btn00 = new JButton();
		btn00.setBounds(30,150,110,30);
		btn00.setBorderPainted(false);
		btn00.setFocusPainted(false);
		btn00.setMargin(insets);
		contentPane.add(btn00);
		
		PanelNumeros();
		
	}
	
	private void PanelNumeros() {
		Component[] botones = contentPane.getComponents();
		String numeros = "", nx = "";
		
		for( Component btn : botones ) {
			while ( numeros.contains(nx = "" + new Random().nextInt(0,10)) );
			numeros += nx;
			((JButton) btn).setText(nx);
		}
		
	}
	
}
