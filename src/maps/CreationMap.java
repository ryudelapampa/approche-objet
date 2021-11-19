package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> employe = new HashMap<>();
		
		employe.put("Paul",1750);
		employe.put("Hicham",1825);
		employe.put("Yu",2250);
		employe.put("Ingrid",2015);
		employe.put("Chantal",2418);
		
		System.out.println(employe.size());
		
	}

}
