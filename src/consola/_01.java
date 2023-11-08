package consola;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Varones : ");
		int varones = entrada.nextInt();
		
		System.out.print("Mujeres : ");
		int mujeres = entrada.nextInt();
		
		int total = varones + mujeres;
		
		double pVarones = varones * 100.0 / total;
		double pMujeres = mujeres * 100.0 / total;
		
		DecimalFormat df = new DecimalFormat("##.00");
		System.out.println("% Varones : " + df.format(pVarones) + " %");
		System.out.println("% Mujeres : " + df.format(pMujeres) + " %");
	}
}
