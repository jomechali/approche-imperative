package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {

		int rank0 = 0;
		int rank1 = 1;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter a positive integer");
			final int finalRank = scanner.nextInt();
			System.out.println("you entered : " + finalRank);
			int fibannaciValue = 0;
			
			if (finalRank == 0) {
				fibannaciValue = 0;
				
			}else if (finalRank == 1) {
				fibannaciValue = 1;
				
			}else if (finalRank > 1) {
				for (int currentRank = 2; currentRank <= finalRank; currentRank++) {
					int swap = rank1;
					rank1 += rank0;
					rank0 = swap;
				}
				fibannaciValue = rank1;
			}
			
			System.out.println("the value of the Fibonnaci algorithm at rank " + finalRank + " is " + fibannaciValue);
		}// add a catch

	}

}
