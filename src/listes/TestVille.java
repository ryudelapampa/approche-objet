package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> maListe = new ArrayList<>();
		
		maListe.add(new Ville("Nice", 343000));
		maListe.add(new Ville("Carcassonne", 47800));
		maListe.add(new Ville("Narbonne", 53400));
		maListe.add(new Ville("Lyon", 484000));
		maListe.add(new Ville("Foix", 9700));
		maListe.add(new Ville("Pau", 77200));
		maListe.add(new Ville("Marseille", 850700));
		maListe.add(new Ville("Tarbes", 40600));
		
//		Collections.sort(maListe, new ComparatorHabitant());
//		for (Ville ligne : maListe) {
//			System.out.println(ligne);
//		}
		
		Collections.sort(maListe, new ComparatorNom());
		for (Ville ligne : maListe) {
			System.out.println(ligne);
		}
		
//		System.out.println(maListe);
		
		
		
		
		
		
		
		
		
		
//		int max = 0;
//		String grandeVille = "";
//		
//		for (Ville ville : maListe ) {
//			if (ville.getNbrHabitant() > max) {
//				max = ville.getNbrHabitant();
//				grandeVille = ville.getNom();
//			}
//		}
//		
//		int min = 1000000000;
//		String petiteVille = "";
//		
//		for (Ville ville : maListe) {
//			if (ville.getNbrHabitant() < min) {
//				min = ville.getNbrHabitant();
//			}
//		}
//		
//		for (Ville v : maListe) {
//			System.out.println(v);
//		}
//		
//		
//		System.out.println("La ville avec le plus d'habitant est : "+grandeVille+" son nombre d'habitant est de : "+max);
		
	}

}
