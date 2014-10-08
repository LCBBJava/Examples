import java.util.Scanner;


public class Scr5 {
	public static void main(String args[]){
		String[] items = new String[10];
		items[0] = "apple";
		int x = 12;
		boolean isMorning = true;
		String location = "house";
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the game!");
		System.out.println("The current time is: " + x + " O'clock");
		System.out.println("You are located at: " + location);
		System.out.println("Morning: " + isMorning);
		System.out.println("Item 1: "+ items[0]);
		System.out.println("Enter command");
		String input = sc.nextLine();
		System.out.println(input);
		sc.close();
	}
}
