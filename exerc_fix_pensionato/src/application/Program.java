package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int nRooms = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		Room[] rooms = new Room[10];
		
		for (int i = 0; i < nRooms; i++) {
			System.out.printf("Rent #%d: %n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int numberOfRoom = sc.nextInt();
			sc.nextLine();
			if (rooms[numberOfRoom] != null) {
				System.out.print("You must select another room: ");
				numberOfRoom = sc.nextInt();
				sc.nextLine();
			}
			rooms[numberOfRoom] = new Room(name, email, numberOfRoom);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.print(rooms[i]);
			}
		}

		sc.close();
	}

}
