package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int currentMax = array[0];
		
		// go through all the elements of array to find if one is superior to the current one
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			
			if (j > currentMax) {
				currentMax = j;
			}
		}

		System.out.println("The maximum is : " + currentMax);
	}

}
