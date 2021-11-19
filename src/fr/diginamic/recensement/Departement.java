package fr.diginamic.recensement;

public class Departement {

	private String codeDepartement;
	private int populationTotale;
	
	public Departement(String codeDepartement, int populationTotale) {
		super();
		this.codeDepartement = codeDepartement;
		this.populationTotale = populationTotale;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	
	
	
	
}
