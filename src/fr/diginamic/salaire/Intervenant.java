package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;
	
	abstract public double getSalaire();
	abstract public String getStatut();
	
	public void afficherDonnes() {
		System.out.println("Nom : "+nom+" - Prénom : "+prenom+" - Salaire : "+this.getSalaire()+" - Statut : "+this.getStatut());
	}
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Intervenant [nom = " + nom + ", prenom = " + prenom ;
	}
	
	
}
