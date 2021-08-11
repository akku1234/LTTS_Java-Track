import java.util.*;

public class HotelMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite Room");
		System.out.println("Select Room Type:");
		int x = input.nextInt();
		switch(x) {
		case 1:
			System.out.println("Hotel Name:");
			input.nextLine();
			String name = input.nextLine();
			System.out.println("Room Square Feet Area:");
			int numberOfSqFeet = input.nextInt();
			System.out.println("Room has TV:");
			boolean hasTV = input.nextBoolean();
			System.out.println("Room has Wifi:");
			boolean hasWifi = input.nextBoolean();
			HotelRoom room = new DeluxeRoom(name, numberOfSqFeet, hasTV, hasWifi);
			int tariff = room.calculateTarrif(numberOfSqFeet, room.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+tariff);
			break;
		case 2:
			System.out.println("Hotel Name:");
			input.nextLine();
			String name2 = input.nextLine();
			System.out.println("Room Square Feet Area:");
			int numberOfSqFeet2 = input.nextInt();
			System.out.println("Room has TV:");
			boolean hasTV2 = input.nextBoolean();
			System.out.println("Room has Wifi:");
			boolean hasWifi2 = input.nextBoolean();
			HotelRoom searoom = new DeluxeSeaViewRoom(name2, numberOfSqFeet2, hasTV2, hasWifi2);
			int tariff2 = searoom.calculateTarrif(numberOfSqFeet2, searoom.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+tariff2);
			break;
		case 3:
			System.out.println("Hotel Name:");
			input.nextLine();
			String name3 = input.nextLine();
			System.out.println("Room Square Feet Area:");
			int numberOfSqFeet3 = input.nextInt();
			System.out.println("Room has TV:");
			boolean hasTV3 = input.nextBoolean();
			System.out.println("Room has Wifi:");
			boolean hasWifi3 = input.nextBoolean();
			HotelRoom suiteroom = new SuiteRoom(name3, numberOfSqFeet3, hasTV3, hasWifi3);
			int tariff3 = suiteroom.calculateTarrif(numberOfSqFeet3, suiteroom.getRatePerSqFeet());
			System.out.println("Room Tariff per day is: "+tariff3);
			break;
		}
		input.close();
	}
}