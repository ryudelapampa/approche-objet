package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	private Piece[] pieces ;
	
	public Maison() {
		pieces = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {
		pieces = Arrays.copyOf(pieces, pieces.length+1);
		pieces[pieces.length-1] = piece;
	}
	
	public double getSuperficieTotale() {
		int i = 0;
		double sommeSuperficie = 0;
		while (i < pieces.length) {
			sommeSuperficie +=  pieces[i].getSuperficie();
			i++;
		}
		return sommeSuperficie;
	}
	
	public double getSuperficiePiece(int etage) {
		int i = 0;
		double sommeSuperficie = 0;
		while (i < pieces.length) {
			if (pieces[i].getEtage() == etage) {
				sommeSuperficie += pieces[i].getSuperficie();
			}
		}
		return sommeSuperficie;
	}

	@Override
	public String toString() {
		return "Maison [piece = " + Arrays.toString(pieces) + "]";
	}
	
	
	
}
