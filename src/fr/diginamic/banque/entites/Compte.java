package fr.diginamic.banque.entites;

public class Compte {

	private String numero;
	private double soldeCompte;
	
	public Compte(String numero, double soldeCompte) {
		super();
		this.numero = numero;
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numero + ", soldeCompte=" + soldeCompte +" ," ;
	}
	
}
