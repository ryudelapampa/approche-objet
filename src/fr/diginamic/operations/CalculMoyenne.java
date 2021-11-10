package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	private double[] tableau ; 
	
	public CalculMoyenne(double[] tableau) {
		super();
		this.tableau = tableau;
	}

	public void ajout(double newDouble) {
		tableau = Arrays.copyOf(tableau, tableau.length+1);
		tableau[tableau.length -1] = newDouble;
	}
	
	public double calcul() {
		int i = 0;
		double somme = 0;
		while (i<tableau.length) {
			somme += tableau[i];
			i++;
		}
		return somme/tableau.length;
	}

	@Override
	public String toString() {
		return "CalculMoyenne [tableau=" + Arrays.toString(tableau) + "]";
	}
	
	
	
}
