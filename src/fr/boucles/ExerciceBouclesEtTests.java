package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		// print all integers
		System.out.println("print all integers in the array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// in reverse order
		System.out.println("in reverse order");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[array.length - i - 1]);
		}
		
		// superior to 3
		System.out.println("superior to 3");
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 3) {
				System.out.println(array[i]);
			}
		}
		
		// only even numbers
		System.out.println("only even numbers");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		// only even numbers
		System.out.println("only even indexes");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		// only odd numbers
		System.out.println("only odd numbers");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
		
	}

}
