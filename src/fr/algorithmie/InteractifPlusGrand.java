package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int maxValue = Integer.MIN_VALUE;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("enter the value number " + i);
			int readNumber = scanner.nextInt();
			if (readNumber > maxValue) {
				maxValue = readNumber;
			}
		}
		System.out.println("the highest value entered is : " + maxValue);
	}

}
