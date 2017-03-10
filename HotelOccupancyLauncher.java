import java.util.Scanner;
public class HotelOccupancyLauncher {

	public static void main(String[] args) {
		int floors;
		int rooms;
		int occupied;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amout of floors the hotel has");
		floors = keyboard.nextInt();
		for (int i = 1; i <= floors; i++) {
			System.out.println("Enter the amount of rooms that are on that floor");
			rooms = keyboard.nextInt();
			System.out.println("Enter the ammount of rooms that are occcupied on that floor");
			occupied = keyboard.nextInt();
			HotelOccupancy hotel1 = new HotelOccupancy(floors, rooms, occupied);
		}
		System.out.println();
	}

}
