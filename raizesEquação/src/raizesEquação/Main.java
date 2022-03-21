
//ALGORITMO QUE CALCULA AS RA�ZES DO 2 GRAU LEVANDO EM CONSIDERA��O A EXIST�NCIA DE RA�ZES REAIS

package raizesEqua��o;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D, X1, X2;
		
		System.out.print("Digite os valores para A, B, e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		D = (Math.pow(B, 2) - 4 * A * C);
		
		if(D > 0) {
		    X1 = ((-B + (Math.sqrt(D)))/(2 * A));
		    X2 = ((-B - (Math.sqrt(D)))/(2 * A));
		    System.out.print("Primeira Raiz " + X1 + "," + " " + "Segunda Raiz " + X2 + ".");
		}
		  else if(D == 0) {
			       X1 = -B / (2 * A);
			       System.out.print("Raiz" + X1);
		       }else {
			       System.out.print("Raizes imagin�rias");
		       }
		sc.close();
	}
}
