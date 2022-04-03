import java.util.Locale;
import java.util.Scanner;

/*********************************************************************************
 *ALGORITMO PARA CALCULAR A M�DIA ARITM�TICA DAS 50 M�DIAS ANUAIS COM FINALIZADOR.
 *********************************************************************************/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float ma, acm, mat;
		int con;
		
		con = 0;
		acm = 0;
		ma = 0;
		
		while(ma != -1) {
			System.out.println("Digite a m�dia anual do aluno: ");
			ma = sc.nextFloat();
			if (ma != -1) {
			acm = acm + ma;
			con = con + 1;
			}
		}
		
		if (con > 0) {
			mat = acm / con;
			System.out.println("M�dia anual da turma: " + mat);
		}else {
			System.out.println("Nenhuma m�dia v�lida fornecida");
		}
		
		sc.close();
	}

}
