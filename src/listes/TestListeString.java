package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> maListe = new ArrayList<String>();
		
		maListe.add("Nice");
		maListe.add("Carcassonne");
		maListe.add("Narbonne");
		maListe.add("Lyon");
		maListe.add("Foix");
		maListe.add("Pau");
		maListe.add("Marseille");
		maListe.add("Tarbes");
		
		String max = "";
		for (String str : maListe) {
			if (max.length() < str.length()) {
				max = str;
			}
		}
		
		System.out.println("La ville avec le plus de lettres est : "+max+"\n");
		
		for (String str : maListe) {
			str = str.toUpperCase();
			System.out.println(str);
		}
		
		
		for (int i = 0; i<maListe.size(); i++) {
			if (maListe.get(i).startsWith("N") == true) {
				maListe.remove(i);
			}
		}
		
		System.out.println(maListe);
		
	}

}
