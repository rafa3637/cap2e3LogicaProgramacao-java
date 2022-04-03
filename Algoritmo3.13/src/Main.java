/**************************************************************
 * ALGORITMO QUE L� UM N�MERO IMAGINADO E OS CHUTES, AO FINAL *
 * MOSTRE QUANTAS TENTATIVAS FORAM NECESS�RIAS PARA DESCOBRIR *
 * O N�MERO                                                   *
 **************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int numero;//n�mero inicial a ser descoberto.
		int chute;//tentativa de acerto do n�mero.
		int tentativa;//tentativa de acerto do n�mero.
		
		tentativa = 0;
		System.out.println("Digite o n�mero pensado: ");
		numero = sc.nextInt();
		do{
			System.out.println("Diga o chute: ");
			chute = sc.nextInt();
			tentativa = tentativa + 1;
			if(chute > numero) {
				System.out.println("Chutou alto!!");
			}
			else if(chute < numero) {
				System.out.println("Chutou baixo!!");
			}
		}
		while(numero == chute);
		System.out.println("Tentativa: " + tentativa);
		
		sc.close();
	}
}
