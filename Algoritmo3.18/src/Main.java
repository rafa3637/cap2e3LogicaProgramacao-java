/*************************************************************
 * ALGORITMO QUE CALCULA A TABUADA DO NÚMERO 5 USANDO WHILE. *
 *************************************************************/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		x = 1;
		while(x <= 10) {
			System.out.println(x + " x 5 = " + x * 5);
			x = x + 1;
		}
		sc.close();
	}

}
