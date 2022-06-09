package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		//int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1};
		int[] array1 = new int[1];
		int array1Count = array1.length;
		
		boolean control = false;
		
		if(array1Count >= 1 && array1[0] == array1[array1Count - 1]) {
			control = true;
		}
		
		System.out.println("the control boolean is : " + control);

	}

}
