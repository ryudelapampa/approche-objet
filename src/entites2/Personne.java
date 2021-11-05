package entites2;

import entities.AdressePostale;

public class Personne {

	public String nom ;
	public String prenom ;
	public AdressePostale monAdresse;
	
	public Personne(String name, String pren) {
		nom = name ;
		prenom = pren ;
	}
	
	public Personne(String name, String pren, AdressePostale adr) {
		nom = name ;
		prenom = pren ;
		monAdresse = adr ;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", monAdresse=" + monAdresse + "]";
	}
	
}
