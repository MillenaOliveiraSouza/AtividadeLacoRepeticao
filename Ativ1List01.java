package LacosRepeticao;

import java.util.Scanner;

public class Ativ1List01 {

	public static void main(String[] args) {
		// 1) Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
		// onde o primeiro número deve ser menor do que o segundo número. Caso
		// contrário, deve ser exibida uma mensagem na tela informando que o intervalo é
		// inválido e sair do programa.
		// No intervalo informado, mostre na tela todes os números que são múltiplos de
		// 3 e 5.

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Digite o Primeiro número do intervalo: ");
			int num1 = scanner.nextInt();

			System.out.print("Digite o Segundo número do intervalo: ");
			int num2 = scanner.nextInt();

			if (num1 >= num2) {
				System.out.print("O intervalo é inválido ");
			} else {
				System.out.println("\nNo intervalo entre " + num1 + " e " + num2 + ": \n");
				for (int i = num1; i < num2; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println(i + " é multiplo de 3 e 5");
					}
				}
			}
		}
	}

}
