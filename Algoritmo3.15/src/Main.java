/************************************************************************************
 * ALGORITMO QUE CALCULA A M�DIA ARITMETICA DE 50 ALUNOS UTILIZANDO A ESTRUTURA FOR.*
 ************************************************************************************/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float ma, acm, mat;
		int v;
		
		acm = 0;
		
		for(v = 1; v <= 50; v ++) {
			System.out.print("Digite a m�dia do aluno: ");
			ma = sc.nextFloat();
			acm = acm + ma;
		}
		mat = acm / 50;
		System.out.print("A m�dia anual da turma �: " + mat);
		sc.close();
	}

}
