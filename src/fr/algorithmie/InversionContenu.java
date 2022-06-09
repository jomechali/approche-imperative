package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int arrayCount = array.length;
		
		int[] arrayCopy = new int[arrayCount];
		
		// fill copy array in reverse order from array
		for (int i = 0; i < arrayCount; i++) {
			int j = array[arrayCount - i - 1];
			arrayCopy[i] = j;			
		}

		// show array
		System.out.println("content of array");
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(array[i]);
		}
		
		// show arrayCopy
		System.out.println("content of arrayCopy");
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
