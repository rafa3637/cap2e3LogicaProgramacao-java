/**********************************************************
 * ALGORITMO QUE CALCULA A M�DIA ARITM�TICA PARA 50 ALUNOS
 *********************************************************/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float n1, n2, n3, n4, ma;//declara��o das vari�veis e a m�dia.
		int con = 0;//declara��o e inicializa��o do contador.
		
		while(con < 50) {//teste de condi��o.
			System.out.println("Digite as notas n1, n2, n3, n4: ");//entrada de dados.
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			n3 = sc.nextFloat();
			n4 = sc.nextFloat();
			
			ma = (n1 + n2 + n3 + n4) / 4; //c�lulo da m�dia.
			System.out.println("M�dia Anual = " + ma);
			
			if (ma >= 7) {
				System.out.println("Aluno Aprovado!");
				System.out.println("Parab�ns!");
			}else {
				System.out.println("Aluno Reprovado!");
				System.out.println("Estude Mais!!!");
			}
			con = con + 1;
		}
		
		sc.close();
	}

}
