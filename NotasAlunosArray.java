package arrays;

import java.util.Scanner;

public class NotasAlunosArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeNotas = 0;

		System.out.print("Quantas notas vc quer informar? ");
		quantidadeNotas = entrada.nextInt();

		double[] notas = new double[quantidadeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i + 1) + " nota: ");
			notas[i] = entrada.nextDouble();
		}

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.printf("Media das notas: %.2f", media);

		entrada.close();
	}

}
