/**********************************************************
 * ALGORITMO QUE CALCULA A MÉDIA ARITMÉTICA PARA 50 ALUNOS
 *********************************************************/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float n1, n2, n3, n4, ma;//declaração das variáveis e a média.
		int con = 0;//declaração e inicialização do contador.
		
		while(con < 50) {//teste de condição.
			System.out.println("Digite as notas n1, n2, n3, n4: ");//entrada de dados.
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			n3 = sc.nextFloat();
			n4 = sc.nextFloat();
			
			ma = (n1 + n2 + n3 + n4) / 4; //cálulo da média.
			System.out.println("Média Anual = " + ma);
			
			if (ma >= 7) {
				System.out.println("Aluno Aprovado!");
				System.out.println("Parabéns!");
			}else {
				System.out.println("Aluno Reprovado!");
				System.out.println("Estude Mais!!!");
			}
			con = con + 1;
		}
		
		sc.close();
	}

}
