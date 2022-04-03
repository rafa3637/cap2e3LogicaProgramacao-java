import java.util.Locale;
import java.util.Scanner;

/******************************************************************
 * ALGORITMO PARA CALCULAR A MÉDIA ARITMÉTICA DAS 50 MÉDIAS ANUAIS. 
 ******************************************************************/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float ma;//decalração da média anual de um dado aluno.
		float acm;//decalração do acumulador.
		float mat;//declaração da média anual da turma.
		int con;//contador.
		con = 0;//inicialização do contador.
		acm = 0;//inicialização do acumulador.
		
		while(con < 50) {
			System.out.println("Digite a média anual do aluno: ");
			ma = sc.nextFloat();
			acm = acm + ma;
			con = con + 1;
		}
		
		mat = acm / 50;//cálculo da média anual da turma.
		System.out.println("Média anual da turma = " + mat);
		sc.close();
	}

}
