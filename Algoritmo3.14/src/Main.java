/************************************************************************
 * ALGORITMO QUE FAZ UM LEVANTAMENTO DO ESTOQUE DE VINHOS DE UMA ADEGA, *
 * ESPECIFICA A PORCENTAGEM DE CADA TIPO SOBRE O TOTAL GERAL DE VINHOS  *
 ************************************************************************/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String tv;//tipo de vinho.
		int cont,//contador de vinho.
		      ct,//contador de tinto.
		      cb,//contador de branco.
		      cr;//contador de rose.
		float pt, pb, pr;//porcentagens de tinto, branco e rose.
		System.out.print("\n********** MENU **********\n");
		System.out.println("Digite t para tinto.");
		System.out.println("Digite b para branco.");
		System.out.println("Digite r para rose.");
		System.out.println("Digite f para sair.");
		System.out.print("\n**************************\n");
		//inicialização dos diversos contadores.
		cont = 0;
		ct = 0;
		cb = 0;
		cr = 0;
		do {
			System.out.print("Qual o tipo de vinho? ");
			tv = sc.nextLine();
			switch(tv) {
			case "t": ct = ct + 1;
			case "b": cb = cb + 1;
			case "r": cr = cr + 1;
			}
			cont = cont + 1;
		}
		while(tv == "f");
		cont = cont - 1;//descontar o finalizador "f".
		if(cont > 0) {
			pt = (ct * 100) / cont;
			pb = (cb * 100) / cont;
			pr = (cr * 100) / cont;
			
			System.out.print("Porcentagem de Tintos: " + pt);
			System.out.print("Porcentagem de Brancos: " + pb);
			System.out.print("Porcentagem de Rosês: " + pr);
		}
		else {
			System.out.print("Nenhum tipo de vinho foi fornecido!!");
		}
		sc.close();
	}

}
