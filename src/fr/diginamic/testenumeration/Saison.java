package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps",1),
	ETE("Eté",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
			
	
	private String nom;
	private int ordre;
	
	private Saison(String nom, int ordre) {
		this.nom = nom;
		this.ordre = ordre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	public static Saison getSaison(String libelle){
		Saison[] saisons = Saison.values();
		for (Saison saison: saisons) {
			if (saison.getNom().equals(libelle)) {
				return saison;
			}	
		}
		return null;
	}
	

}
