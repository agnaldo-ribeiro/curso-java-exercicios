package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		double balance;
		
		Account bankClient = new Account(accountNumber, accountHolder);
		
		System.out.print("Is there an initial deposit (y/z)? " );
		char response = sc.nextLine().charAt(0);
		
		if (response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			bankClient.setBalance(balance);
		}
		System.out.println();
	
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: %.2f%n", bankClient.getAccountNumber(), bankClient.getAccountHolder(), bankClient.getBalance());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		bankClient.toDeposit(value);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: %.2f%n", bankClient.getAccountNumber(), bankClient.getAccountHolder(), bankClient.getBalance());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		bankClient.toWithdraw(value);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: %.2f%n", bankClient.getAccountNumber(), bankClient.getAccountHolder(), bankClient.getBalance());
		System.out.println();
		
		sc.close();
		
	}

}
