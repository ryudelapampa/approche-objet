package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salarie salarie1 = new Salarie(1200, "Jimmy", "Garcia","CDI");
		Pigiste pigiste1 = new Pigiste(15, 70, "Quentin", "Fournie");
		
		System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire());
		pigiste1.afficherDonnes();
		salarie1.afficherDonnes();
	}

}
