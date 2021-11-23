package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Saison saison1 = Saison.PRINTEMPS;
//		Saison saison2 = Saison.ETE;
//		Saison saison3 = Saison.AUTOMNE;
//		Saison saison4 = Saison.HIVER;
		String nom = "ETE";
		String libelle = "Hiver";
		
		Saison[] saisons = Saison.values();
		

		System.out.println(Saison.getSaison(libelle).getNom());
		
		
		System.out.println("--------");
		
		System.out.println(Saison.valueOf(nom).getNom());
		
		System.out.println("--------");
		
		for (Saison saison : saisons) {
			System.out.println(saison.getNom());
		}
		
	}

}
