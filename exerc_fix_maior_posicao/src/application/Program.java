package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double maiorValor = 0.0;
		int posMaiorValor = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posMaiorValor = i;
			}
		}
		System.out.println();
		
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaiorValor);
		
		sc.close();
	}

}
