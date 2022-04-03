/********************************************************************
 * ALGORITMO QUE CALCULA A TABUADA DE QUALQUER NÚMERO USANDO WHILE. *
 ********************************************************************/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, con;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		while(n != -1) {
			con = 1;
			while(con <= 10) {
				System.out.println(con + " X " + n + " = " + con * n);
				con = con + 1;
			}
			System.out.println(n);
		}
		sc.close();
	}

}
