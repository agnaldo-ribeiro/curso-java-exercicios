package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pares;
		double avg, sum;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		avg = 0.0;
		sum = 0.0;
		pares = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				sum = vect[i];
				avg += sum;
				pares++;
			}
		}
		
		avg /= pares;
		
		if (avg == 0.0) {
			System.out.print("NENHUM NUMERO PAR");
		} else {
			System.out.printf("MEDIA DOS PARES = %.2f", avg);
		}
		
		sc.close();

	}

}
