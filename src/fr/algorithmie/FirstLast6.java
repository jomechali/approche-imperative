package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {

		//int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4}; // false
		//int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6}; // true
		//int[] array1 = new int[0]; // false
		int[] array1 = new int[1]; // true
		int array1Count = array1.length;
		
		boolean control = false;
		
		if (array1Count == 1 
				|| 
				(array1Count != 0 
				&& (array1[0] == 6 || array1[array1Count - 1] == 6))) {
			
			control = true;
		}
		
		System.out.println("the control bool is : " + control);
	}

}
