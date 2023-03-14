package clases;

public class clsString {
	char[] aTexto;
	
	public clsString(char[] cs) {
		this.aTexto = cs;
	}
	
	public char charAt(int index) {
		return aTexto[index];
	}
	
	public String concat(String t1) {
		return String.valueOf(aTexto) + t1;
	}
	
	public String toLowerCase() {
		String rpta = "";
		for ( char car : aTexto ) {
			if (car >= 'A' && car <= 'Z' ) car += 32;
			else switch (car) {
			case 'Á' : car = 'á'; break;
			case 'É' : car = 'é'; break;
			case 'Í' : car = 'í'; break;
			case 'Ó' : car = 'ó'; break;
			case 'Ú' : car = 'ú'; break;
			case 'Ñ' : car = 'ñ'; break;
			}
			rpta += car;
		}
		return rpta;
	}
	
	public String toUpperCase() {
		String rpta = "";
		for ( char car : aTexto ) {
			if (car >= 'a' && car <= 'z' ) car -= 32;
			else switch (car) {
			case 'á' : car = 'Á'; break;
			case 'é' : car = 'É'; break;
			case 'í' : car = 'Í'; break;
			case 'ó' : car = 'Ó'; break;
			case 'ú' : car = 'Ú'; break;
			case 'ñ' : car = 'Ñ'; break;
			}
			rpta += car;
		}
		
		return rpta;
	}
	
	public boolean isEmpty() {
		return aTexto.length == 0;
	}
	
	public boolean isBlank() {
		if ( aTexto.length == 0 ) return true;
		boolean isBlanco = true;
		int index = -1;
		while ( ++index < aTexto.length && isBlanco )
			isBlanco = aTexto[index] == 32;
		
		return isBlanco;
	}
}
