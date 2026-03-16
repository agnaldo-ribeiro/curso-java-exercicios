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
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println();
		
		System.out.println("NUMEROS PARES: ");
		int qtdPares = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
				qtdPares++;
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("QUANTIDADE DE PARES = " + qtdPares);
		
		sc.close();

	}

}
