package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {

		int[] arrayA = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int arrayACount = arrayA.length;
		
		int[] arrayB = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int arrayBCount = arrayB.length;
		
		// the resulting array has the same size as the largest one
		int maxSizeArray = Math.max(arrayACount, arrayBCount);
		
		// fill the resulting array with the sum of each corresponding entries
		int[] arraySum = new int[maxSizeArray];
		for (int i = 0; i < maxSizeArray; i++) {
			arraySum[i] = 0;
			
			if (arrayACount > i) {
				arraySum[i] += arrayA[i];
			}
			
			if (arrayBCount > i) {
				arraySum[i] += arrayB[i];
			}
		}
		
		// print the result
		for (int i = 0; i < arraySum.length; i++) {
			System.out.println(arraySum[i]);
		}
	}

}
