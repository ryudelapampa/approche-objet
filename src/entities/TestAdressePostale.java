package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 40 ;
		adresse1.libelleRue = "rue barbès";
		adresse1.codePostale = 11000 ;
		adresse1.libelleVille = "Carcassonne";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 9 ;
		adresse2.libelleRue = "rue du blé froment";
		adresse2.codePostale = 11090 ;
		adresse2.libelleVille = "Montredon";
		
	}

}
