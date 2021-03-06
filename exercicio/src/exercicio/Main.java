
//ALGORITMO QUE CALCULA O QUE DEVE SER PAGO POR UM PRODUTO
//CONSIDERANDO A PRE?O NORMAL DE ETIQUETA E A ESCOLHA DA
//CONDI??O DE PAGAMENTO

package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo;
		double pNormal, pPago;
		
		System.out.println("Digite o valor do Produto: ");
		pNormal = sc.nextDouble();
		System.out.println("Digite o c?digo da forma de pagamento: ");
		codigo = sc.nextInt();
		
		switch(codigo) {
		case 1: System.out.print("? vista em dinheiro ou cheque, receber 10% de desconto\n");
				pPago = pNormal - (pNormal * 0.1);
				System.out.printf("O valor a ser pago ?: %.2f", pPago);
				break;
		case 2: System.out.print("? vista no cart?o de credito, recebe 5% de desconto\n");
				pPago = pNormal - (pNormal * 0.05);
				System.out.printf("O valor a ser pago ?: %.2f", pPago);
				break;
		case 3: System.out.print("Em duas vezes, pre?o normal de etiqueta sem juros\n");
				pPago = pNormal / 2;
				System.out.printf("O valor a ser pago ? duas parcelas de: %.2f", pPago);
				break;
		case 4: System.out.print("Em tres vezes, pre?o normal mais juros de 10%\n");
				pPago = (pNormal / 3) + ((30 / 3) * 0.3);
				System.out.printf("O pre?o a ser pago ? tres parcelas de: %.2f", pPago);
				break;
		default: System.out.print("C?digo ?nvalido");
		}
		sc.close();

	}

}
