package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int array1Count = array1.length;

		System.out.println("before rotation : ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for (int i = 0; i < array1Count - 1; i++) {
			
			int swapElement = array1[i];
			
			array1[i] = array1[i + 1];
			array1[i + 1] = swapElement;
		}

		System.out.println("after rotation : ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
	}

}
