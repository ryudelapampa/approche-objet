package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maison maMaison = new Maison();
		Chambre chambre1 = new Chambre(12.5, 1);
		maMaison.ajouterPiece(chambre1);
		
		
		System.out.println(maMaison);
		System.out.println(maMaison.getSuperficiePiece(1));
	}

}
