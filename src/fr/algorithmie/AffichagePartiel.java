package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		int arrayCount = array.length;
		
		// integers superior to 3
		System.out.println("integers superior to 3");
		for (int i = 0; i < arrayCount; i++) {
			int j = array[i];
			if (j >= 3) {
				System.out.println(j);
			}
		}
		
		// even numbers
		System.out.println("even numbers");
		for (int i = 0; i < arrayCount; i++) {
			int j = array[i];
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		
		// integers at odd indexes
		System.out.println("integers at odd indexes");
		for (int i = 0; i < arrayCount; i++) {
			int j = array[i];
			if (i % 2 == 1) {
				System.out.println(j);
			}
		}
		
		// odd numbers
		System.out.println("odd numbers");
		for (int i = 0; i < arrayCount; i++) {
			int j = array[i];
			if (j % 2 == 1) {
				System.out.println(j);
			}
		}
	}

}
