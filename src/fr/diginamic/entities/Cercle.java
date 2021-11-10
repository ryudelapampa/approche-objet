package fr.diginamic.entities;

public class Cercle {
	
	private double rayon = 0 ;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}

	public double getSurface() {
		return Math.PI * rayon*rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon = " + rayon + "]";
	}
	
	
}
