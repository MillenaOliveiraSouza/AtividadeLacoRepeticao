package LacosRepeticao;

import java.util.Scanner;

public class Ativ4List2 {

	public static void main(String[] args) {
		// 4) Uma empresa desenvolveu uma pesquisa interna para conhecer os
		// colaboradores da área de Desenvolvimento e precisam de um sistema para
		// analisar os dados. 
		// idade, genero, area

		Scanner scanner = new Scanner(System.in);

		int contadorBackend = 0;
		int contadorFrontendMulheresTrans = 0;
		int contadorMobileHomensTrans40 = 0;
		int contadorFullStackNBMenores30 = 0;
		int contadorTotalColaborador = 0;
		int contadorMediaIdades = 0;

		String continuar = "SIM";

		while (continuar.equalsIgnoreCase("SIM") || continuar.equalsIgnoreCase("S")) {

			System.out.println("Digite a idade do colaborador: ");
			int idade = scanner.nextInt();

			System.out.println("Digite o codigo da identidade de gênero: ");
			System.out.println(
					"(1) Mulher Cis  (2) Homem Cis  (3) Não Binário  (4) Mulher Trans  (5) Homem Trans  (6) outros ");
			int genero = scanner.nextInt();

			System.out.println("Digite o codigo da sua área de desenvolvimento: ");
			System.out.println("(1) Backend  (2) Frontend  (3) Mobile  (4) FullStack");
			int area = scanner.nextInt();

			if (area == 1) {
				contadorBackend++;
			}

			if ((genero == 1 || genero == 4) && area == 2) {
				contadorFrontendMulheresTrans++;
			}

			if ((genero == 2 || genero == 5) && area == 3 && idade > 40) {
				contadorMobileHomensTrans40++;
			}

			if (genero == 3 && area == 4 && idade < 30) {
				contadorFullStackNBMenores30++;
			}

			contadorMediaIdades += idade;
			contadorTotalColaborador++;

			System.out.println("você deseja continuar a leitura de dados de um novo colaborador ? (Sim/Não)");
			continuar = scanner.next().toUpperCase();

		}

		double mediaIdade = (double) contadorMediaIdades / contadorTotalColaborador;

		System.out.println("O número de pessoas desenvolvedoras Backend: " + contadorBackend);
		System.out
				.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorFrontendMulheresTrans);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "
				+ contadorMobileHomensTrans40);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: "
				+ contadorFullStackNBMenores30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + contadorTotalColaborador);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);

		scanner.close();

	}
}
