package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> cléIte = mapVilles.keySet().iterator();
		while (cléIte.hasNext()) {
			Integer inte = cléIte.next();
			System.out.println(inte);
		}
		
		System.out.println("-----------");
		
		Iterator<String> valuesIte = mapVilles.values().iterator();
		while (valuesIte.hasNext()) {
			String inte = valuesIte.next();
			System.out.println(inte);
		}
		
		System.out.println("-----------");
		
		System.out.println("Taille de la map : "+mapVilles.size());
	}

}
