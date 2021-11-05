package entites2;

import entities.AdressePostale;

public class Personne {

	public String nom ;
	public String prenom ;
	public AdressePostale monAdresse;
	
	public Personne(String nom, String prenom) { //CONSTRUCTEUR nom + prenom
		this.nom = nom ;
		this.prenom = prenom ;
	}
	
	public Personne(String nom, String prenom, AdressePostale monAdresse) { //CONSTRUCTEUR nom + prenom + adresse
		this.nom = nom ;
		this.prenom = prenom ;
		this.monAdresse = monAdresse ;
	}
	
	public void getNomPrenom() { // GETTER nom en MAJUSCULE + prenom 
		System.out.println(prenom+" "+ nom.toUpperCase());
	}

	public void setNom(String nvNom) { //SETTER nom
		nom = nvNom;
	}
	
	public void setPrenom(String nvPrenom) { //SETTER prenom
		prenom = nvPrenom;
	}
	
	public String getNom() { //GETTER nom
		return nom;
	}
	
	public String getPrenom() { //GETTER prenom
		return prenom;
	}
	
	public AdressePostale getAdresse() { //GETTER Adresse
		return monAdresse;
	}

	public void setMonAdresse(AdressePostale monAdresse) { //SETTER ADRESSE
		this.monAdresse = monAdresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", monAdresse=" + monAdresse + "]";
	}
	
}
