package anoNascimento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento, anoAtual, idade;
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		if(idade >= 18) {
			System.out.print("Voc� j� pode tirar a carteira de habilita��o\n");
		}
		else if (idade >= 16) {
			System.out.print("Voc� j� tem idade para votar");
		}
		else if(idade >= 16 && idade <= 18) {
			System.out.print("Voc� j� pode votar mais n�o pode tirar carteira de habilita��o");
		}else if(idade < 16) {
			System.out.print("Voc� n�o pode votar e n�o pode tirar carteira de habilita��o");
		}
		sc.close();

	}

}
