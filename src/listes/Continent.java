package listes;

public enum Continent {

	AFRIQUE("Afrique"),
	AMERIQUE("Amérique"),
	ANTARCTIQUE("Antarctique"),
	ASIE("Asie"),
	EUROPE("Europe"),
	OCEANIE("Océanie");
	
	
	
	/* Afrique
	Amérique
	Antarctique
	Asie
	Europe
	Océanie*/
	
	private String libelle;
	
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

	
	
}
