package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Ville> villeMap = new HashMap<String, Ville>();
		
		villeMap.put("Nice",new Ville("Nice", 343000));	
		villeMap.put("Carcassonne", new Ville("Carcassonne", 47800));
		villeMap.put("Narbonne", new Ville("Narbonne", 53400));
		villeMap.put("Lyon", new Ville("Lyon", 484000));
		villeMap.put("Foix", new Ville("Foix", 9700));
		villeMap.put("Pau", new Ville("Pau", 77200));
		villeMap.put("Marseille", new Ville("Marseille", 850700));
		villeMap.put("Tarbes", new Ville("Tarbes", 40600));
		
		Iterator<Ville> villeIte = villeMap.values().iterator();
		
		int min = 1000000 ;
		String villePetite = "";
		
		while(villeIte.hasNext()) {
			Ville ville = villeIte.next();
			if (ville.getNbrHabitant() < min) {
				min=ville.getNbrHabitant();
				villePetite = ville.getNom();
				System.out.println(min +" "+ villePetite);
			}
		}
		villeMap.remove(villePetite);
		
		Iterator<Ville> villeIte2 = villeMap.values().iterator();
		System.out.println("------------");
		while (villeIte2.hasNext()) {
			Ville ville = villeIte2.next();
			System.out.println("Nom de la ville : "+ville.getNom()+" - Nombre d'habitant : "+ville.getNbrHabitant());
		}
	}

}
