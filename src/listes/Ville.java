package listes;

public class Ville {
	
	private String nom;
	private int nbrHabitant = 0;

	public Ville(String nom, int nbrHabitant) {
		super();
		this.nom = nom;
		this.nbrHabitant = nbrHabitant;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbrHabitant=" + nbrHabitant + "]";
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
