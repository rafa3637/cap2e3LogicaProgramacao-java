/*******************************************************************************************
 * ALGORITMO PARA C�LCULAR A M�DIA ARITM�TICA DE DOIS N�MEROS PARES FORNECIDOS PELO USU�RIO
 *******************************************************************************************/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n, acm, con;
		float mnp;//m�dia dos n�meros pares.
		con = 0;
		acm = 0;
		n = 1;
		while(n > 0) {
			System.out.println("Digite um n�mero: ");
			n = sc.nextInt();
			if(n > 0 && (n % 2 == 0)) {
				acm = acm + n;
				con = con + 1;
			}
		}
		if(con > 0) {
			mnp = acm / con;
			System.out.println("A m�dia = " + mnp);
		}else {
			System.out.println("Nenhum para foi fornecido!!");
		}

		sc.close();
	}

}
