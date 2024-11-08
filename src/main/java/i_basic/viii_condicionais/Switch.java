package i_basic.viii_condicionais;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		int caso = 0;

		System.out.println(
				"Digite 1 para mostrar o nome Paulo, 2 para mostrar o nome José, e 3 para mostrar o nome Joyce");
		caso = leitor.nextInt();

		switch (caso) {

		case 1:
			System.out.println("Paulo");
			break;

		case 2:
			System.out.println("José");
			break;

		case 3:
			System.out.println("Joyce");
			break;

		default:
			System.out.println("Valor não encontrado no menu");

		}
	}
}
