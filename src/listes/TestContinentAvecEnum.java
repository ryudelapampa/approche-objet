package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		List<Ville> mesVilles = new ArrayList<Ville>();
		
		mesVilles.add(new Ville("New York", 0, Continent.AMERIQUE));
		mesVilles.add(new Ville("Paris", 0, Continent.EUROPE));
		mesVilles.add(new Ville("Pékin", 0, Continent.ASIE));
		mesVilles.add(new Ville("Moscou", 0, Continent.EUROPE));
		mesVilles.add(new Ville("Berlin", 0, Continent.EUROPE));
		mesVilles.add(new Ville("Sydney", 0, Continent.OCEANIE));
		mesVilles.add(new Ville("Sao Paulo", 0, Continent.AMERIQUE));
		mesVilles.add(new Ville("Dakar", 0, Continent.AFRIQUE));

		for (Ville ville : mesVilles) {
			System.out.println("La ville "+ville.getNom()+" est sur le continent "+ville.getContinent().getLibelle());
		}
		
	}

}
