package fr.diginamic.banque.entites;

public abstract class Operation {

	private String date;
	private double montant;
	
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	
	public abstract String getType();

	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + getMontant() + "]";
	}

	public double getMontant() {
		return montant;
	}

	
	
	
	
}
