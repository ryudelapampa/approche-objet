package fr.diginamic.recensement;

import java.util.Scanner;

public class servicePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le num�ro du d�partement voullu :\n");
		String scan = scanner.next();
		int nombreHabitant = 0;
		
		for (Ville villes : recensement.mesVilles) {
			if (villes.getCodeDep().equals(scan)) {
				nombreHabitant += villes.getPopulationTotale();
			}
		}
		System.out.println("Le d�partement : "+scan+" compte : "+String.format("%,d", nombreHabitant)+ " d'habitants !");
	}

}
