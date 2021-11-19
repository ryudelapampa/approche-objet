package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ServiceDixRegionPeuplé extends MenuService implements Comparator<Region>{

	@Override
	public void traiter(Recensement recensement) {
		
//		ArrayList<Region> mesRegions = new ArrayList<Region>();
		
		HashMap<String, Integer> compteurs = new HashMap<String, Integer>();
		
		for (Ville villes : recensement.mesVilles) {
			int compteur ;
			Integer populationMax = compteurs.get(villes.getNomRegion());
			
			if (populationMax == null) {
				compteurs.put(villes.getNomRegion(), villes.getPopulationTotale());
			} else {
				compteurs.put(villes.getNomRegion(), populationMax+villes.getPopulationTotale());
			}
		}
		
		List<Region> mesRegions = new ArrayList<Region>();

		for (String nomRegion : compteurs.keySet()) {
//			System.out.println(compteurs.get(nomRegion));
			mesRegions.add(new Region(0, nomRegion, compteurs.get(nomRegion)));
		}
		
		Collections.sort(mesRegions, new RegionComparator());
		
		for (int i =0; i<10; i++) {
			System.out.println("Top "+(i+1)+" : "+mesRegions.get(i).getNomRegion()+" avec "+mesRegions.get(i).getPopulationTotale()+" d'habitans !");
		}
		
	}

	@Override
	public int compare(Region o1, Region o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
