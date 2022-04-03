import java.util.Locale;
import java.util.Scanner;

/******************************************************************
 * ALGORITMO PARA CALCULAR A M�DIA ARITM�TICA DAS 50 M�DIAS ANUAIS. 
 ******************************************************************/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float ma;//decalra��o da m�dia anual de um dado aluno.
		float acm;//decalra��o do acumulador.
		float mat;//declara��o da m�dia anual da turma.
		int con;//contador.
		con = 0;//inicializa��o do contador.
		acm = 0;//inicializa��o do acumulador.
		
		while(con < 50) {
			System.out.println("Digite a m�dia anual do aluno: ");
			ma = sc.nextFloat();
			acm = acm + ma;
			con = con + 1;
		}
		
		mat = acm / 50;//c�lculo da m�dia anual da turma.
		System.out.println("M�dia anual da turma = " + mat);
		sc.close();
	}

}
