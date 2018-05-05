package org.posJava.aula2;

public class Testes2 {

	public static void main(String[] args) {
		String searchMe= "peter piper picked a peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		
		for (int i =0; i<max; i++) {
			if (searchMe.charAt(i) != 'p') 
				continue;
			
			numPs++;
			
		}

		System.out.println("numero de Ps " + numPs);
		
	}

}
