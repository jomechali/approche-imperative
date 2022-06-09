package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			boolean leave = false;
			int[] storedValues = new int[2];
			int numberOfStoredValues = 0;
			
			do {
			//afficher menu
			//recuperer input
			//cas choix 1
			//si il y a la place, ajouter, sinon agrandir
			//cas choix 2
			//afficher tableau
			//cas choix 3
			//quitter
				System.out.println("Menu : \n1 - Add a number\n2 - Show stored values\n3 - leave");
				int choice = scanner.nextInt();
				
				switch (choice) {
				
				case 1:
					int integerToAdd = scanner.nextInt();
					numberOfStoredValues++;
					
					if(numberOfStoredValues >= storedValues.length) {
						
						int[] newStorage = new int[2 * storedValues.length];
						
						for (int i = 0; i < storedValues.length; i++) {
							newStorage[i] = storedValues[i];
						}
						
						storedValues = newStorage;
					}
					
					storedValues[numberOfStoredValues - 1] = integerToAdd;
					
					break;

				case 2:
					for (int i = 0; i < numberOfStoredValues; i++) {
						System.out.println(storedValues[i]);
					}
					break;

				case 3:
					leave = true;
					break;

				default:
					break;
				}
				
			} while (!leave);
		}// add a catch for type mismatch

	}

}
