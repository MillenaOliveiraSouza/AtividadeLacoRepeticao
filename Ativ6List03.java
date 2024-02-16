package LacosRepeticao;

import java.util.Scanner;

public class Ativ6List03 {

	public static void main(String[] args) {
		// 6) Escreva um algoritmo em Java, que leia números inteiros via teclado, até
		// que o número zero seja digitado. Ao final, mostre na tela a média de todos os
		// números digitados, que sejam múltiplos de 3.
		
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("+++Média dos numeros digitados multiplos de 3+++");
			System.out.println("\n    (Se quiser parar a conta digite 0)");

			int numero, soma = 0, contadorNumero = 0;

			do {
				System.out.print("\nDigite um número: ");
				numero = scanner.nextInt();

				if (numero % 3 == 0 && numero != 0) {
					soma = soma + numero;
					contadorNumero++;
				}

			} while (numero != 0);

			if (contadorNumero > 0) {
				double media = (double) soma / contadorNumero;
				System.out.print("\nA media de todos os números múltiplos de 3 é: " + media);
			} else {
				System.out.print("\nNenhum números múltiplos de 3 foi digitado!");

			}

		}
	}
}