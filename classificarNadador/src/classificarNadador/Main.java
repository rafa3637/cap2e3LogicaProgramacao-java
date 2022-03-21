
//ALGORITMO QUE LÊ A IDADE DO NADADOR E CLASSIFICA SUA CATEGORIA

package classificarNadador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Diga sua idade: ");
		idade = sc.nextInt();
		switch(idade) {
		case 5, 6, 7: System.out.println("Infantil A");
			break;
		case 8, 9, 10: System.out.println("Infantil B");
			break;
		case 11, 12, 13: System.out.println("Juvanil A");
			break;
		case 14, 15, 16, 17: System.out.println("Juvanil B");
			break;
		default: 
			if(idade >= 18) {
				System.out.println("Adulto");
			}
		}
		sc.close();
	}

}
