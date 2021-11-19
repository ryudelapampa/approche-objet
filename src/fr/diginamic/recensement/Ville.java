package fr.diginamic.recensement;

public class Ville {

	private int codeRegion ;
	private String nomRegion ;
	private String codeDep ;
	private int codeCommune ;
	private String nomCommune ;
	private int populationTotale ;
	
	public Ville(int codeRegion, String nomRegion, String codeDep, int codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDep = codeDep;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	// GETTER + SETTER CODE REGION
	public int getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	// GETTER + SETTER NOM REGION
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	// GETTER + SETTER CODE DEPARTEMENT
	public String getCodeDep() {
		return codeDep;
	}
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	// GETTER + SETTER CODE COMMUNE
	public int getCodeCommune() {
		return codeCommune;
	}
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	// GETTER + SETTER NOM COMMUNE
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	// GETTER + SETTER POPULATION TOTAL 
	public int getPopulationTotale() {
		return populationTotale;
	}
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	@Override
	public String toString() {
		return "Ville [codeRegion = " + codeRegion + " // nomRegion = " + nomRegion + " // codeDep = " + codeDep
				+ "// codeCommune = " + codeCommune + " // nomCommune = " + nomCommune + " // populationTotale = "
				+ populationTotale + "]";
	}
	
	
}
