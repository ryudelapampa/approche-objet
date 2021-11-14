package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int jourTravailMois = 0;
	private double montantRemunerationJourna = 0;
	
	public Pigiste(int jourTravailMois, double montantRemunerationJourna, String nom, String prenom) {
		super(nom, prenom);
		this.jourTravailMois = jourTravailMois;
		this.montantRemunerationJourna = montantRemunerationJourna;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return jourTravailMois*montantRemunerationJourna;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}
	
	
	
	
}
