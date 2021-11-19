package listes;

public class Pays {

	private String nom;
	private String continent;
	private int nombreHabitant;
	
	public Pays(String nom, String continent, int nombreHabitant) {
		super();
		this.nom = nom;
		this.continent = continent;
		this.nombreHabitant = nombreHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getNombreHabitant() {
		return nombreHabitant;
	}

	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}
	
	
	
	
	
}
