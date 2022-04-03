/*******************************************************************************************
 * ALGORITMO PARA CALCULAR A MÉDIA ARITMÉTICA DAS 50 MÉDIAS ANUAIS UTILIZANDO "DO...WHILE".*
 *******************************************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float ma, acm, mat;
		int con;
		
		con = 0;
		acm = 0;
		
		do {
			System.out.println("Digite o média: ");
			ma = sc.nextFloat();
			acm = acm + ma;
			con = con + 1;
		}
		while(con >= 50);
		mat = acm / 50;
		System.out.println("Média anual da turma = " + mat);
		
		sc.close();
	}

}
