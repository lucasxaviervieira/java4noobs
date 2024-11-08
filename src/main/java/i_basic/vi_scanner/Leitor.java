package i_basic.vi_scanner;

import java.util.Scanner;

public class Leitor {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		String nome = leitor.nextLine();

		System.out.println("Digite a idade: ");
		int idade = leitor.nextInt();

		System.out.println("Digite o peso: ");
		double peso = leitor.nextDouble();

		System.out.println("O nome digitado foi: " + nome + " e a idade foi: " + idade + " e o peso foi: " + peso);
	}
}