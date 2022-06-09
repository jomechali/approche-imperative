package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		int numberOfMatchingElements = 0;
		
		// for each element of array1, search if an element of array2 is equal
		for (int i = 0; i < array1.length; i++) {
			int matchingElement = array1[i];
			
			int j = 0;
			int currentElement = array2[0];
			
			// as soon as we found a matching element, leave the loop
			while (j < (array2.length - 1) && currentElement != matchingElement) {
				j++;
				currentElement = array2[j];
			}
			
			// if we stopped because we found a match, increment the count
			if (currentElement == matchingElement) {
				numberOfMatchingElements++;
			}
			
			System.out.println("the number of matches is : " + numberOfMatchingElements);
		}

	}

}
