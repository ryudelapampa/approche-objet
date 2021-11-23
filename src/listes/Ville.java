package listes;

public class Ville {
	
	private String nom;
	private int nbrHabitant = 0;
	private Continent continent;

	public Ville(String nom, int nbrHabitant,Continent continent) {
		super();
		this.nom = nom;
		this.nbrHabitant = nbrHabitant;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Ville [nom = " + nom + ", nbrHabitant = " + nbrHabitant + " continent = "+ continent.getLibelle()+"]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrHabitant() {
		return nbrHabitant;
	}

	public void setNbrHabitant(int nbrHabitant) {
		this.nbrHabitant = nbrHabitant;
	}
	
	public boolean equals(Object objet) {
		if (!(objet instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) objet;
		return nom.equals(other.getNom());
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

//	@Override
//	public int compareTo(Ville autre) {
//		if (this.nbrHabitant > autre.getNbrHabitant()) {
//			return 1;
//		}
//		if (this.nbrHabitant < autre.getNbrHabitant()) {
//			return -1;
//		}
//		return 0;
//	}
	
//	@Override
//	public int compareTo(Ville autre) {
//		int result = this.nom.compareTo(autre.getNom());
//		return result;
//	}
	
	
}
