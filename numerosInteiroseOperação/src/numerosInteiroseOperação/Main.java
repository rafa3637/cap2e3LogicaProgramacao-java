/********************************************************************
 *ELABORAR UM ALGORITMO QUE LEIS DOIS N?MEROS INTEIROS E A OPERA??O 
 *ARITM?TICA DESEJADA E CALCULAR A RESPOSTA ADEQUADA
 ********************************************************************/

package numerosInteiroseOpera??o;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n***************************\n");
		System.out.print("            menu             \n");
		System.out.print("***************************\n");
		System.out.print("Op??o 1: Adi??o\n");
		System.out.print("Op??o 2: Subtra??o\n");
		System.out.print("Op??o 3: Multiplica??o\n");
		System.out.print("Op??o 4: Divis?o\n");
		System.out.print("\n***************************\n");
				
		
		int X1, X2, R, opcao;
		
		System.out.print("Digite os Valores de X1 e X2: ");
		X1 = sc.nextInt();
		X2 = sc.nextInt();
		
		System.out.print("Digite a op??o desejada: ");
		opcao = sc.nextInt();
		switch(opcao) {
			case 1:
				R = X1 + X2;
				System.out.print("O resultado da adi??o ?: " + R);
				break;
			case 2:
				R = X1 - X2;
				System.out.print("O resultado da subtra??o ?: " + R);
				break;
			case 3:
				R = X1 * X2;
				System.out.print("O resultado da multiplica??o ?: " + R);
				break;
			case 4:
				R = X1 / X2;
				System.out.print("O resultado da Divis?o ?: " + R);
				break;
			default: System.out.print("Opera??o ?nvalida!!:P");
		}
		
		sc.close();
	}

}
