
//PROGRAMA PARA LER UM C�DIGO DE UM PRODUTO E MOSTRA SUA CLASSIFICA��O

package lerCodigoProduto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		
		System.out.print("Digite o c�digo do produto: ");
		codigo = sc.nextInt();
		switch(codigo) {
			case 1: System.out.print("Alimento n�o-perec�vel");
				break;
			case 2, 3, 4: System.out.print("Alimento perec�vel");
				break;
			case 5, 6: System.out.print("Vestu�rio");
				break;
			case 7: System.out.print("Higiene pessoal");
				break;
			case 8, 15: System.out.print("Limpeza e utens�lios dom�sticos");
				default: System.out.print("C�digo Inv�lido");
		}
		sc.close();
	}

}
