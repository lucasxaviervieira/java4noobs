package i_basic.viii_condicionais;

import java.util.Scanner;

public class SwitchExpression {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		int caso = 0;

		System.out.println(
				"Digite 1 para mostrar o nome Paulo, 2 para mostrar o nome José, e 3 para mostrar o nome Joyce");
		caso = leitor.nextInt();

		String resultado = switch (caso) {
		case 1 -> "Paulo";
		case 2 -> "José";
		case 3 -> "Joyce";
		default -> "Valor não encontrado no menu";
		};

		System.out.println(resultado);
	}
}
