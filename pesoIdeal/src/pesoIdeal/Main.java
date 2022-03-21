
//ALGORITMO PARA CALCULAR O PESO IDEAL TENDO COMO DADOS DE ENTRADA ALTURA E SEXO DE UMA PESSOA

package pesoIdeal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura, peso = 0;
		char S;
		
		System.out.print("Digite sua altura: ");
		altura = sc.nextDouble();
		
		System.out.print("Qual o seu sexo (M/F)? ");
		S = sc.next().charAt(0);
		
		if(S == 'M' || S == 'm') {
			peso = (72.7 * altura) - 58;
		}
		if(S == 'F' || S == 'f') {
			peso = (62.1 * altura) - 58;
		}
		
		System.out.print("Seu peso ideal é: " + peso);
		sc.close();

	}

}
