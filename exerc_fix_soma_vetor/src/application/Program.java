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
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			sc.nextLine();
			vect[i] = number;
		}
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.println();
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("SOMA = %.2f%n", sum);
		
		double avg = sum / vect.length;
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();

	}

}
