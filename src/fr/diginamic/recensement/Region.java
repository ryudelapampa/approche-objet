package fr.diginamic.recensement;

public class Region {
	
	private int codeRegion;
	private String nomRegion;
	private int populationTotale;
	
	public Region(int codeRegion, String nomRegion, int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	
	
	

}
