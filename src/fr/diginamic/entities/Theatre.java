package fr.diginamic.entities;

public class Theatre {

	private String nom;
	private int capacite;
	private int totalInscr = 0;
	private double recette = 0;
	
	public Theatre(String nom, int capacite, int totalInscr, double recette) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.totalInscr = totalInscr;
		this.recette = recette;
	}
	
	public void inscrire(int nbrClient, double prix) {
		
		if ((totalInscr+nbrClient) < capacite) {
			totalInscr += nbrClient;
			recette += prix;
		} else if (totalInscr+nbrClient >= capacite) {
			System.out.println("Capacite maximum atteinte !");
		}
	}

	@Override
	public String toString() {
		return "Theatre [nom = " + nom + ", capacite = " + capacite + ", totalInscr = " + totalInscr + ", recette = " + recette
				+ " €]";
	}
	
	
	
	
}
