package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cr�ation map1
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Cr�ation map2
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		map3.putAll(map1);
		map3.putAll(map2);
		
		Iterator<Integer> ite1 = map3.keySet().iterator();
		Iterator<String> ite2 = map3.values().iterator();
		
		while(ite2.hasNext()) {
			Integer cl� = ite1.next();
			String lignes = ite2.next();
			System.out.println("Cl� : "+cl�+" Valeur : "+lignes);
		}
		
		
	}

}
