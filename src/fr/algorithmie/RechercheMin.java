package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int currentMin = array[0];
		
		// go through all the elements of array to find if one is inferior to the current one
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			
			if (j < currentMin) {
				currentMin = j;
			}
		}

		System.out.println("The minimum is : " + currentMin);

	}

}
