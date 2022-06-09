package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {

		int[] firstIntegers = new int[10];
		
		for (int i = 0; i < firstIntegers.length; i++) {
			firstIntegers[i] = i + 1;
		}

		System.out.println(firstIntegers[0]);
		System.out.println(firstIntegers.length);
		System.out.println(firstIntegers[firstIntegers.length - 1]);
		firstIntegers[4] = 8;
	}

}
