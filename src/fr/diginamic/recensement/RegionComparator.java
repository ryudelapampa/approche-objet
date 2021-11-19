package fr.diginamic.recensement;

import java.util.Comparator;

public class RegionComparator implements Comparator<Region> {
	
	@Override
	public int compare(Region region1, Region region2) {
		if (region1.getPopulationTotale()>region2.getPopulationTotale()) {
			return -1;
		} else if (region1.getPopulationTotale()<region2.getPopulationTotale()) {
			return 1;
		}
		return 0;
	}
}
