package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] tab = {1,15,20,30,60,40,80};
		CalculMoyenne calc1 = new CalculMoyenne(tab);
		
		System.out.println(calc1.calcul());
		System.out.println(Math.round(calc1.calcul()));
		
		calc1.ajout(20.5);
		System.out.println(calc1);
		System.out.println(calc1.calcul());
	}
}
