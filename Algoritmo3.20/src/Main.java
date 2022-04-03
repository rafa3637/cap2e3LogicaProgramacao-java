/************************************************************
 * ALGORITMO QUE CALCULA A TABUADA DO NÚMERO 5 USANDO PARA. *
 ************************************************************/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X;
		X = 1;
		for(X = 1; X <= 10; X ++) {
			System.out.println(X + " x 5 = " + X * 5);
		}
		sc.close();

	}

}
