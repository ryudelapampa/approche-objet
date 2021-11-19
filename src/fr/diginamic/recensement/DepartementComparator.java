package fr.diginamic.recensement;

import java.util.Comparator;

public class DepartementComparator implements Comparator<Departement>{

	@Override
	public int compare(Departement departement1, Departement departement2) {
		if (departement1.getPopulationTotale()>departement2.getPopulationTotale()) {
			return -1;
		} else if (departement1.getPopulationTotale()<departement2.getPopulationTotale()) {
			return 1;
		}
		return 0;
	}
	
}
