package LacosRepeticao;

import java.util.Scanner;

public class Ativ2List01 {

	public static void main(String[] args) {
		// 2)Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
		// e mostre na tela quantos números são pares e quantos número são ímpares.

		try (Scanner scanner = new Scanner(System.in)) { // isso ajuda o scanner a fechar sozinho, assim você não precisa fazer o scanner.close(); 

			System.out.println("---Vamos verificar quantos números são ímpares e quantos são pares---");

			int impar = 0, par = 0, i; // é importante definir que o contador vai comecar no 0, pois queremos acrescentar os numeros, então precisa comecar no 0

			for (i = 1; i <= 10; i++) { // foi feito o for, para não precisar escrever o print 10 vezes, o int começa em 1, pois queremos que aparece na tela 1° e vai até o 10.
				System.out.print("\nDigite o " + i + "° número: ");
				int numero = scanner.nextInt();

				if (numero % 2 == 0) {
					par++; // isso é um contador dos numeros que passarem pelo if da variavel numero, que verifica se o resto da divisão por 2 é 0
				} else {
					impar++; // também é um contador
				}

			}
			System.out.print("\nTotal de números ímpares: " + impar);
			System.out.print("\nTotal de números pares: " + par);

		}
	}
}
