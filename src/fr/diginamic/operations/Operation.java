package fr.diginamic.operations;

public class Operation {

	public double calcul(double a, double b, char operateur) {
		double resultat = 0;
		if (operateur == '+') {
			resultat = a+b;
		} else if (operateur == '-') {
			resultat = a-b;
		} else if (operateur == '*') {
			resultat = a*b;
		} else if (operateur == '/') {
			resultat = a/b;
		}
		return resultat;
	}
	
}
