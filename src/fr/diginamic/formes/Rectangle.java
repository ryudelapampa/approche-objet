package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Rectangle(double longueur) {
		// TODO Auto-generated constructor stub
		super();
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return (longueur*2)+(largeur*2);
	}
	
	
	
}
