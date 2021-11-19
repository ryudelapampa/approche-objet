package fr.diginamic.recensement;

import java.util.Scanner;

public class servicePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le numéro du département voullu :\n");
		String scan = scanner.next();
		int nombreHabitant = 0;
		
		for (Ville villes : recensement.mesVilles) {
			if (villes.getCodeDep().equals(scan)) {
				nombreHabitant += villes.getPopulationTotale();
			}
		}
		System.out.println("Le département : "+scan+" compte : "+String.format("%,d", nombreHabitant)+ " d'habitants !");
	}

}
