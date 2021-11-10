package fr.diginamic.essais;

import fr.diginamic.operations.Operation;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation ope1 = new Operation();
		
		double adition = ope1.calcul(5, 15, '+');		
		System.out.println("Adition = "+adition);
		
		double soustraction = ope1.calcul(5, 15, '-');		
		System.out.println("\nsoustraction = "+soustraction);
		
		double multiplication = ope1.calcul(5, 15, '*');		
		System.out.println("\nmultiplication = "+multiplication);
		
		double division = ope1.calcul(15, 5, '/');		
		System.out.println("\ndivision = "+division);
	}

}
