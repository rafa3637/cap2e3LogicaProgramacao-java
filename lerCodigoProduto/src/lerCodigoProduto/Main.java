
//PROGRAMA PARA LER UM CÓDIGO DE UM PRODUTO E MOSTRA SUA CLASSIFICAÇÃO

package lerCodigoProduto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		
		System.out.print("Digite o código do produto: ");
		codigo = sc.nextInt();
		switch(codigo) {
			case 1: System.out.print("Alimento não-perecível");
				break;
			case 2, 3, 4: System.out.print("Alimento perecível");
				break;
			case 5, 6: System.out.print("Vestuário");
				break;
			case 7: System.out.print("Higiene pessoal");
				break;
			case 8, 15: System.out.print("Limpeza e utensílios domésticos");
				default: System.out.print("Código Inválido");
		}
		sc.close();
	}

}
