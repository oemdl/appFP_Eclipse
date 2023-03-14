package clases;

public class Recursividad {

	public int Multiplicar(int n1, int n2) {
		if ( n2 == 1 ) return n1;
		return n1 + Multiplicar(n1, n2 - 1);
	}
	
}
