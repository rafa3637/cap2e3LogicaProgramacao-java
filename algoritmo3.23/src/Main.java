/******************************************************************
 * ALGORITMO QUE CALCULA A TABUADA DE QUALQUER NÚMERO USANDO FOR. *
 ******************************************************************/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, con;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		for(con = 1; con <= 10; con ++) {
			System.out.println(con + " X " + n + " = " + con * n);
			con = con + 1;
		}
			//System.out.println(n);
		sc.close();
	}

}
