/************************************************************************************
 * ALGORITMO QUE CALCULA A MÉDIA ARITMETICA DE 50 ALUNOS UTILIZANDO A ESTRUTURA FOR.*
 ************************************************************************************/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float ma, acm, mat;
		int v;
		
		acm = 0;
		
		for(v = 1; v <= 50; v ++) {
			System.out.print("Digite a média do aluno: ");
			ma = sc.nextFloat();
			acm = acm + ma;
		}
		mat = acm / 50;
		System.out.print("A média anual da turma é: " + mat);
		sc.close();
	}

}
