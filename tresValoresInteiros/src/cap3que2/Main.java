
//ALGORITMO QUE L? TRES VALORES INTEIROS E DIFERENTES E MOSTRE-OS EM ORDEM DECRESCENTE

package cap3que2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.print("Digite os valores de A, B e C ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A > B && A > C && B > C) 
			System.out.printf("A orem e: %d %d %d ", A, B, C);
		else if (A > B && A > C && C > B)
			System.out.printf("A ordem e %d %d %d", A, C, B);
			else if (B > A && B > C && A > C)
					System.out.printf("A ordem e: %d %d %d", B, A, C);
				else if(B > A && B > C && C > A)
						System.out.printf("A ordem e: %d %d %d", B, C, A);
					else if (C > A && C > B && A > B)
							System.out.printf("A ordem e: %d %d %d", C, A, B);
						else
							System.out.printf("A ordem e: %d %d %d", C, B, A);
			
	sc.close();
	}

}