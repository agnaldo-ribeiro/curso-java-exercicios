package entities;

public class Room {
	private String name;
	private String email;
	private int numberOfRoom;
	
	public Room(String name, String email, int numberOfRoom) {
		this.name = name;
		this.email = email;
		this.numberOfRoom = numberOfRoom;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	
	public String toString() {
		return String.format("%d: %s, %s%n", numberOfRoom, name, email);
	}
}
