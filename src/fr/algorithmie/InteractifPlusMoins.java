package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		final int MAX_TRY = 10;
		int turn = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			Random randomGenerator= new Random();
			int choosenInt = randomGenerator.nextInt(100) + 1;
			
			int enteredInt = -1;
			
			do {
				turn++;
				System.out.println("try a guess! between 1 and 100. try left : " + (MAX_TRY - turn));
				enteredInt = scanner.nextInt();
				
				if (enteredInt > choosenInt) {
					System.out.println("too high! Try number " + turn);
				}else if (enteredInt < choosenInt) {
					System.out.println("too low! Try number " + turn);
				}
				
			} while ((turn <= 10) && (enteredInt != choosenInt));
			
			if (enteredInt == choosenInt) {
				System.out.println("Congratulations!");
			}else {
				System.out.println("bad luck!");
			}
		}// add a catch
		

	}

}
