package clases;

import java.awt.EventQueue;

public class prueba {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clsString cString = new clsString("O��R".toCharArray());
					System.out.println( cString.toLowerCase() );
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
