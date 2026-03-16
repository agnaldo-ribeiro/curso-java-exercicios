package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vect = new Pessoa[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Pessoa(name, age, height);
		}
		
		double avgHeight = 0;
		for (int i=0; i<vect.length; i++) {
			double sum = vect[i].getHeight();
			avgHeight += sum;
		}
		avgHeight = avgHeight / vect.length;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avgHeight);
		
		int menores = 0;
		for (int i=0; i<n; i++) {
			if (vect[i].getAge() < 16) {
				menores += 1;
			}
		}
		double agePercentage = menores * 100 / vect.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", agePercentage);
		
		for (int i=0; i<n; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
