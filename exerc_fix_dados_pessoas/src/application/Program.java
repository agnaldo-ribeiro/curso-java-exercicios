package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Person[] people = new Person[n]; 
		
		for (int i=0; i<people.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Genero da %da pessoa (F/M): ", i+1);
			char gender = sc.nextLine().charAt(0);
			people[i] = new Person(height, gender);
		}
		
		double maxHeight = 0.0;
		
		for (int i=0; i<people.length; i++) {
			if (people[i].getHeight() > maxHeight) {
				maxHeight = people[i].getHeight();
			}
		}
		double minHeight = maxHeight;
		for (int i=0; i<people.length; i++) {
			if (people[i].getHeight() < minHeight) {
				minHeight = people[i].getHeight();
			}
		}
		System.out.printf("Menor altura = %.2f %n", minHeight);
		System.out.printf("Maior altura = %.2f %n", maxHeight);
		
		double sumWomenHeight = 0.0;
		int womenQuantity = 0;
		for (int i=0; i<people.length; i++) {
			if (people[i].getGender() == 'F' || people[i].getGender() == 'f') {
				womenQuantity++;
				sumWomenHeight += people[i].getHeight();
			}
		}
		double avgWomenHeight = sumWomenHeight / womenQuantity;
		System.out.printf("Media das alturas das mulheres = %.2f %n", avgWomenHeight);
		
		int menQuantity = 0;
		for (int i=0; i<people.length; i++) {
			if (people[i].getGender() == 'M' || people[i].getGender() == 'm') {
				menQuantity++;
			}
		}
		System.out.printf("Numero de homens = %d", menQuantity);
		
		sc.close();

	}

}
