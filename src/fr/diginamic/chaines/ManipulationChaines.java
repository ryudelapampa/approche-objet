package fr.diginamic.chaines;

import entities.Salarie;

public class ManipulationChaines {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		char c = ';';
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println(chaine.length());
		
		System.out.println(chaine.indexOf(c));
		
		String nom = chaine.substring(chaine.indexOf(premierCaractere), chaine.indexOf(c));
		
		System.out.println(nom);
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		
		String[] mots = chaine.split(";");
		for (String mot : mots) {
			System.out.println("\n"+mot);
		}
		
		double salaire = Double.parseDouble(mots[2].replaceAll(" ", ""));
		
		Salarie employe = new Salarie(mots[0], mots[1], salaire );
		System.out.println(employe);
	}

}
