package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double taux;
	
	public CompteTaux(String numero, double soldeCompte, double taux) {
		super(numero, soldeCompte);
		this.taux = taux;
		
	}

	@Override
	public String toString() {
		return super.toString() + " taux=" + taux + "]";
	}
	
}
