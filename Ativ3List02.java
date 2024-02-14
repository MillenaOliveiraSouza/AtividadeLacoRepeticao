package LacosRepeticao;

import java.util.Scanner;

public class Ativ3List02 {

	public static void main(String[] args) {
		//3)Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e 
		//mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade
		//seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Total de pessoas cuja idade é menor que 21 e maior que 51 anos");
			System.out.println("       (Quando quiser parar digite um numero negativo)");

			int idade, idadeMenor = 0, idadeMaior = 0;

			System.out.print("Digite uma idade: ");
			idade = scanner.nextInt();

			while (idade >= 0) {
				if (idade < 21) {
					idadeMenor++;
				} else if (idade > 50) {
					idadeMaior++;
				}
				System.out.print("Digite uma idade: ");
				idade = scanner.nextInt();
			}
			System.out.print("\nTotal de pessoas menores de 21 anos: " + idadeMenor);
			System.out.print("\nTotal de pessoas maiores de 50 anos: " + idadeMaior);
		}
	}
}
