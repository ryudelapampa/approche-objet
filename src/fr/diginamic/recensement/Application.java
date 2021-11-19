package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		
//		RECHERCHE FICHER RECENCEMENT + CREATION ARRAY LIST AVEC CHAQUE LIGNE DU FICHIER
		Path path = Paths.get("C:/test/recensement.csv");
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
		ArrayList<Ville> mesVilles = new ArrayList<Ville>();
		Recensement recense = new Recensement(mesVilles);
		
//		RECUPERATION DE CHAQUE LIGNE + CREATION DE CHAQUE OBJET VILLE POUR ARRAY-LIST RECENSEMENT 
//		LIGNE 1 BASE : Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;
		for (String ligne : lignes) {
			String[] ligneSep = ligne.split(";");
			
			int codeRegion = Integer.parseInt(ligneSep[0]);
			String nomRegion = ligneSep[1];
			String codeDep = ligneSep[2];
			int codeCommune = Integer.parseInt(ligneSep[5]);
			String nomCommune = ligneSep[6];
			int populationTotale = Integer.parseInt(ligneSep[9].replace(" ", ""));
			
			recense.mesVilles.add(new Ville(codeRegion, nomRegion, codeDep, codeCommune, nomCommune, populationTotale));
		}
		
//		MENU DES SERVICES :
		System.out.println("Bienvenue dans le menu ! Selectionné le service que vous désiré (Via les chiffres) :\n"
				+ "\n1. Population d'une ville donnée"
				+ "\n2. Population d'un département donnée"
				+ "\n3. Population d'une région donnée"
				+ "\n4. Afficher les 10 régions les plus peuplées"
				+ "\n5. Afficher les 10 département les plus peuplées"
				+ "\n6. Afficher les 10 villes les plus peuplées d'un département"
				+ "\n7. Afficher les 10 villes les plus peuplées d'une région"
				+ "\n8. Afficher les 10 villes les plus peuplées de France"
				+ "\n9. Sortir");
//		CHOIX DU SERVICE :
		@SuppressWarnings("resource")
		Scanner choixService = new Scanner(System.in);
		int choix = choixService.nextInt();
		
		switch (choix) {
			case 1:
				servicePopulationVille recherche = new servicePopulationVille();
				recherche.traiter(recense);
				break;
			case 2:
				servicePopulationDepartement recherche2 = new servicePopulationDepartement();
				recherche2.traiter(recense);
				break;
			case 3:
				servicePopulationRegion recherche3 = new servicePopulationRegion();
				recherche3.traiter(recense);
				break;
			case 4:
				ServiceDixRegionPeuplé recherche4 = new ServiceDixRegionPeuplé();
				recherche4.traiter(recense);
				break;
			case 5:
				ServiceDixDepartementPeuplé recherche5= new ServiceDixDepartementPeuplé();
				recherche5.traiter(recense);
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				break;
		}
		
		
	}

}
