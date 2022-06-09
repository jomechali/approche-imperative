package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		int readNumber = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter an int between 1 and 10");
			do {
				readNumber = scanner.nextInt();
				System.out.println("You entered : " + readNumber);
			} while (readNumber < 1 || readNumber > 10);
		} // add catch for type mismatch

	}

}
