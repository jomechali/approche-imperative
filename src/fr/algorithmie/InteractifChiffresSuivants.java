package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter an int :");
			int readNumber = scanner.nextInt();
			
			System.out.println("you entered : " + readNumber);
			System.out.println("the next integers are :");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + readNumber);
			}
		} // add a catch for type mismatch

	}

}
