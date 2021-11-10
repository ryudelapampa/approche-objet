package fr.diginamic.entities;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle cercle1 = new Cercle(12);
		Cercle cercle2 = new Cercle(4);
		
		System.out.println("Cercle 1 [Surface : "+Math.round(cercle1.getSurface()) +" - Périmetre : "+Math.round(cercle1.getPerimetre())+"]");
		System.out.println("Cercle 2 [Surface : "+Math.round(cercle2.getSurface()) +" - Périmetre : "+Math.round(cercle2.getPerimetre())+"]");
		
		Cercle cercle3 = CercleFactory.getCercle(3);
		System.out.println(cercle3);
	}

}
