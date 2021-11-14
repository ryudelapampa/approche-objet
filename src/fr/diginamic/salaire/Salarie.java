package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaireMensu = 0;
	private String statut;

	public Salarie(double salaireMensu, String nom, String prenom, String statut) {
		super(nom, prenom);
		this.salaireMensu = salaireMensu;
		this.statut = statut;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensu;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return statut;
	}
	
	

}
