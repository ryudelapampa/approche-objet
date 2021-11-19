package listes;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getNbrHabitant() > ville2.getNbrHabitant()) {
			return 1;
		}
		if (ville1.getNbrHabitant() < ville2.getNbrHabitant()) {
			return -1;
		}
		return 0;
	}

}
