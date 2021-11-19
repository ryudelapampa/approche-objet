package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ServiceDixDepartementPeuplé extends MenuService{
	
	public void traiter(Recensement recensement) {
		
		HashMap<String, Integer> compteurs = new HashMap<String, Integer>();
		
		for (Ville villes : recensement.mesVilles) {
			int compteur ;
			Integer populationMax = compteurs.get(villes.getCodeDep());
			
			if (populationMax == null) {
				compteurs.put(villes.getCodeDep(), villes.getPopulationTotale());
			} else {
				compteurs.put(villes.getCodeDep(), populationMax+villes.getPopulationTotale());
			}
		}
		
		List<Departement> mesDepartement = new ArrayList<Departement>();

		for (String codeDepartement : compteurs.keySet()) {
//			System.out.println(compteurs.get(nomRegion));
			mesDepartement.add(new Departement(codeDepartement, compteurs.get(codeDepartement)));
		}
		
		Collections.sort(mesDepartement, new DepartementComparator());
		
		for (int i =0; i<10; i++) {
			System.out.println("Top "+(i+1)+" : "+mesDepartement.get(i).getCodeDepartement()+" avec "+mesDepartement.get(i).getPopulationTotale()+" d'habitans !");
		}
		
	}

}
