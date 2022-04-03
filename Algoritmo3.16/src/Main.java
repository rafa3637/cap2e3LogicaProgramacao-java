/***********************************************************
 * ALGORITMO QUE CLACULA A SOMO DOS NÚMEROS MÚLTIPLOS DE 3 *
 ***********************************************************/


import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, soma = 0;
		
		for(num = 1; num <= 500; num ++) {
			if(num % 2 == 1) {
				System.out.println("Numero ímpar");
			}else if(num % 3 == 0) {
				soma = soma +num;
			}
		}
		System.out.println("Soma = " + soma);
		sc.close();
	}

}
