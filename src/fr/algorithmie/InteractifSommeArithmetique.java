package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter an int :");
			int readNumber = scanner.nextInt();
			
			System.out.println("you entered : " + readNumber);
			
			int sum = (readNumber * (readNumber + 1)) / 2;
			System.out.println("the sum of the first integers to " + readNumber + " is " + sum);
		} // add a catch for type mismatch

	}

}
