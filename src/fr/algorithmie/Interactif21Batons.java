package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		//tant que encore batons
		//si tour du joueur demander input
		//si tour de l ordi nb aleatoire
		//soustraire au total de batons
		
		//determiner gagnant en sortie de boucle
		
		Random randomGenerator = new Random();
		
		try (Scanner scanner = new Scanner(System.in)) {
			int remainingSticks = 21;
			int turn = 0;
			
			while (remainingSticks > 0) {
				turn++;
				System.out.println("Remaining sticks : " + remainingSticks);
				int numberToRemove = 0;
				
				if (turn % 2 == 1) {
					
					// player s turn
					int readNumber;
					do {
						System.out.println("your turn! enter an int beween 1 and 3");
						readNumber = scanner.nextInt();
						System.out.println("You entered : " + readNumber);
					} while (readNumber < 1 || readNumber > 3);
					
					numberToRemove = readNumber;
					
				}else {
					// computer s turn
					int computerChoice = randomGenerator.nextInt(3) + 1;
					
					System.out.println("the computer chose : " + computerChoice);
					
					numberToRemove = computerChoice;
					
				}
				remainingSticks -= numberToRemove;
			}
			
			if (turn % 2 == 0) {
				System.out.println("Congratulations Player!");
			}else {
				System.out.println("The computer won");
			}
		}
	}

}
