package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme extends AffichageForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cercle cercle1 = new Cercle(12);
		Rectangle rectangle1 = new Rectangle(15, 10);
		Carre carre1 = new Carre(10);
		
		String Cercle = afficher(cercle1);
		System.out.println(Cercle);
		
		String Rectangle = afficher(rectangle1);
		System.out.println(Rectangle);
		
		String Carre = afficher(carre1);
		System.out.println(Carre);
	}

}
