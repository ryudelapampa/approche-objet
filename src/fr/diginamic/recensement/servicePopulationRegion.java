package fr.diginamic.recensement;

import java.util.Scanner;

public class servicePopulationRegion extends MenuService {
	
	@Override
	public void traiter(Recensement recensement) {
		
		System.out.println("Souhaitez vous faire une recherche avec le numéro ou le nom de la région ?\n");
		System.out.println("1. Numéro de la région\n2. Nom de la région");
		
		Scanner choixTypeRecherche = new Scanner(System.in);
		int choix = choixTypeRecherche.nextInt();
		
		switch (choix) {
			case 1:
				System.out.println("Entrez le numéro de la région voulu :");
				Scanner scanner = new Scanner(System.in);
				int scan = scanner.nextInt();
				int nombreHabitant = 0;
				String nomRegion = null ;
				for (Ville villes : recensement.mesVilles) {
					if (villes.getCodeRegion() == scan) {
						nombreHabitant += villes.getPopulationTotale();
						nomRegion = villes.getNomRegion();
					}
				}
				System.out.println("La région : ("+scan+") "+nomRegion+" compte : "+String.format("%,d", nombreHabitant)+ " d'habitants !");
				break;
			case 2:
				int numRegion = 0;
				System.out.println("Entrez le nom de la région voulu :");
				Scanner scanner1 = new Scanner(System.in);
				String scan1 = scanner1.next();
				int nombreHabitant1 = 0;
				for (Ville villes : recensement.mesVilles) {
					if (villes.getNomRegion().equals(scan1)) {
						nombreHabitant1 += villes.getPopulationTotale();
						numRegion = villes.getCodeRegion();
					}
				}
				System.out.println("La région : ("+numRegion+") "+scan1+" compte : "+String.format("%,d", nombreHabitant1)+ " d'habitants !");
				break;
		}
	}
}
