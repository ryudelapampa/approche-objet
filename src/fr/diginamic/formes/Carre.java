package fr.diginamic.formes;

public class Carre extends Rectangle{

	private double longueur;
	
	public Carre(double longueur) {
		super(longueur);
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur*longueur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return longueur*4;
	}
}
