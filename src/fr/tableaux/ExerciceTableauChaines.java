package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {

		String[] frenchCitiesName = {"Paris", "Lyon", "Toulouse", "Montpellier", "Lunel"};
		
		for (int i = 0; i < frenchCitiesName.length; i++) {
			System.out.println(frenchCitiesName[i]);
		}
		
		frenchCitiesName[3] = "Reims";
		
		for (String cityName : frenchCitiesName) {
			System.out.println(cityName);
		}
	}

}
