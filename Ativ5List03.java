package LacosRepeticao;

import java.util.Scanner;

public class Ativ5List03 {

	public static void main(String[] args) {
		//5)Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero   
		//seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. 

		try(Scanner scanner = new Scanner(System.in)){
			
			
			System.out.print("+++Soma dos numeros positivos digitados+++");
			System.out.println("\n    (Se quiser parar a conta digite 0)");

			int numero, soma=0;
			
			do {
				System.out.print("\nDigite um número: ");
				numero = scanner.nextInt();
				
				if (numero >=0) {
					
					soma = soma+ numero;	
				}
				
			}while (numero != 0);
			
			System.out.print("\nA soma dos números positivos é: "+soma);
		}
		
	}

}
