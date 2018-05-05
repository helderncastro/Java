package org.posJava.aula1;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Soma 4 + 5 =  " + soma(4,5));
		System.out.println("Subtrai 10 - 5 = " + subtrai(10,5));
		System.out.println("Multiplica 5 * 3 = " + multiplica(5,3));
		System.out.println("Divide 8 / 2 = " + divide(8,2));
		System.out.println("Potencia 4 ^ 3 = " + potencia(4,3));		
		System.out.println("Resto 8 / 3 = " + resto(8,3));
		
	}

	public static int proximo(int n) {
		return n+1;
	}

	public static int anterior(int n) {
		return n-1;
	}
		
	
	public static int soma(int n, int m){ // ok
      if (n == 0) {
    	  return (m);
      } else {
    	  return soma(anterior(n),proximo(m));
      }
    	  
	}
	
	public static int subtrai (int n, int m) { //ok
		if (m==0) {
			return(n);
		} else {
			return subtrai(anterior(n),anterior(m));
		}

	}
	
	public static int multiplica(int n, int m) { //ok
		if (m==1) {
			return n;
		}
		else {		
			return soma(n,multiplica(n,anterior(m)));
		}
	}
	
	public static int potencia(int m, int n) { //ok
		if (n==1) {
			return m;
		} else {
			return multiplica(m,multiplica(m,anterior(n)));
		}
				
	}
	
	public static int divide (int n, int m) { //ok
		if (n == 0 || n < m ) {
			return 0;
		}
		else if ( subtrai(n,m) == 0) {
			return 1; 
		} else {
			return (soma(1,divide(n - m,m)));
		}
	}

	public static int resto (int m, int n) { // ok
		if (m < n) {
			return m;
		}
		return resto(subtrai(m, n), n);
	}
	
}



