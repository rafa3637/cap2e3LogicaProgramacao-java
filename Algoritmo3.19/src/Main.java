/****************************************************************
 * ALGORITMO QUE CALCULA A TABUADA DO NÚMERO 5 USANDO DO WHILE. *
 ****************************************************************/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X;
		X = 1;
		do {
			System.out.println(X + " x 5 = " + X * 5);
			X = X + 1;
		}
		while(X <= 10);
		sc.close();
	}

}
