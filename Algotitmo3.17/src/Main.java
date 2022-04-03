/*************************************************
 * ALGORITMO PARA CALCULAR A CONTAGEM REGRESSIVA *
 *************************************************/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min, seg;
		System.out.println("10:00");
		for(min = 9; min >= 0; min --) {
			for(seg = 59; seg >= 0; seg --)
			System.out.println(min + ":" + seg);
		}
		sc.close();
	}

}
