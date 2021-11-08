package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte[] cpt1 = {new Compte("1",10000), new CompteTaux("2",15000, 0.12)};
		
		int i = 0;
		
		while (i < 2) {
			System.out.println(cpt1[i]);
			i++;
		}
		
	}

}
