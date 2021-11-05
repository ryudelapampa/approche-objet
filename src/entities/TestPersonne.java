package entities;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AdressePostale adresse1 = new AdressePostale();
//		adresse1.numeroRue = 40 ;
//		adresse1.libelleRue = "rue barbès";
//		adresse1.codePostale = 11000 ;
//		adresse1.libelleVille = "Carcassonne";
//		
//		AdressePostale adresse2 = new AdressePostale();
//		adresse2.numeroRue = 9 ;
//		adresse2.libelleRue = "rue du blé froment";
//		adresse2.codePostale = 11090 ;
//		adresse2.libelleVille = "Montredon";
//		
//		Personne personne1 = new Personne();
//		personne1.nom = "Garcia" ;
//		personne1.prenom = "Jimmy" ;
//		personne1.monAdresse = adresse1 ;
//		
//		Personne personne2 = new Personne();
//		personne2.nom = "Kevin" ;
//		personne2.prenom = "Dupont" ;
//		personne2.monAdresse = adresse2 ;
		
		Personne personne1 = new Personne("Garcia","Jimmy");
		System.out.println(personne1);
		
		AdressePostale adresse2 = new AdressePostale(9, "rue du blé froment",11090, "Montredon");
		Personne personne2 = new Personne("Gaelle","Bertelini",adresse2);
		System.out.println(personne2);
		
	}
}
