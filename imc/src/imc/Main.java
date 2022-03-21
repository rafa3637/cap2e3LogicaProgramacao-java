
/*******************************************************************************
 * ALGORITMO QUE LÊ O PESO E A ALTURA DE UM ADULTO E MOSTRE SUA CONDIÇÃO DE IMC
 *******************************************************************************/

package imc;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double peso, altura, imc;
		System.out.print("Digite o peso: ");
		peso = sc.nextDouble();
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();
		
		imc = peso / (Math.pow(altura,2));
		if(imc < 18.5) {
			System.out.print("Abaixo do Peso");
		}
		else
			if(imc >= 18.5 && imc <= 25) {
				System.out.print("Peso Normal");
			}
			else 
				if(imc > 25 && imc <= 30) {
				System.out.print("Acima do Peso");
			}
			else 
				if(imc > 30) {
					System.out.print("Obeso");
				}

		sc.close();
	}

}
