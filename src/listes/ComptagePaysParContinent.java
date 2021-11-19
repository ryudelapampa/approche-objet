package listes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pays> paysList = new ArrayList<Pays>();
		
		paysList.add(new Pays("France", "Europe", 65_000_000));
		paysList.add(new Pays("Allemagne,", "Europe", 80_000_000));
		paysList.add(new Pays("Belgique,", "Europe", 10_000_000));
		paysList.add(new Pays("Russie,", "Asie", 150_000_000));
		paysList.add(new Pays("Chine,", "Asie", 1_400_000_000));
		paysList.add(new Pays("Indonésie,", "Oceanie", 220_000_000));
		paysList.add(new Pays("Australie,", "Oceanie", 20_000_000));
		
		HashMap<String, Integer> comptage = new HashMap<>();
		
		comptage.put("Europe", null);
		comptage.put("Asie", null);
		comptage.put("Oceanie", null);
		
		int eu = 0 ;
		int asie = 0;
		int oce = 0;
		
//		Iterator<Pays> ite0 = paysList.iterator();
		
//		while(ite0.hasNext()) {
//			Pays pays = ite0.next();
//			if (pays.getContinent()=="Europe") {
//				eu = +1;
//				comptage.put("Europe", eu);
//			} else if (pays.getContinent()=="Asie") {
//				asie = +1;
//				comptage.put("Asie", asie);
//			} else if (pays.getContinent()=="Océanie") {
//				oce = +1;
//				comptage.put("Océanie", oce);
//			}
//		}
		
		for (Pays array : paysList) {
			if (array.getContinent().equals("Europe")) {
				eu +=1;
				comptage.put("Europe", eu);
			} else if (array.getContinent().equals("Asie")) {
				asie +=1;
				comptage.put("Asie", asie);
			} else if (array.getContinent().equals("Oceanie")) {
				oce +=1;
				comptage.put("Oceanie", oce);
			}
		}
		
		Iterator<String> ite1 = comptage.keySet().iterator();
		Iterator<Integer> ite2 = comptage.values().iterator();
		
		while(ite1.hasNext()) {
			String clé = ite1.next();
			Integer valeur = comptage.get(clé);
			System.out.println("Le continent : "+clé+" contient : "+valeur+" pays!");
		}
		
	}

}
