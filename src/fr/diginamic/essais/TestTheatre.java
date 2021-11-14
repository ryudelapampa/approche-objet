package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre salle1 = new Theatre("Theatre du Sud", 50, 45, 0);
		System.out.println(salle1);
		
		salle1.inscrire(2, 400);
		System.out.println(salle1);
		salle1.inscrire(1, 185);
		System.out.println(salle1);
		salle1.inscrire(10, 1500);
		System.out.println(salle1);
		salle1.inscrire(1, 50);
		System.out.println(salle1);
	}

}
