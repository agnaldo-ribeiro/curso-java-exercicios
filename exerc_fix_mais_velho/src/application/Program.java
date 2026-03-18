package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Person[] users = new Person[n];
		
		for (int i=0; i<users.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			users[i] = new Person(name, age);
		}
		
		String older = "default";
		int ageComparison = 0;
		for (int i=0; i<users.length; i++) {
			if(users[i].getAge() > ageComparison) {
				ageComparison = users[i].getAge();
				older = users[i].getName();
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + older);
		
		sc.close();

	}

}
