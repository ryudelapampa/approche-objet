package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	Piece[] piece1 ;
	
	public Maison(Piece[] piece1) {
		super();
		this.piece1 = piece1;
	}

	public void ajouterPiece(Piece piece) {
		piece1 = Arrays.copyOf(piece1, piece1.length+1);
		piece1[piece1.length-1] = piece;
	}
	
	public double getSuperficieTotale() {
		int i = 0;
		double sommeSuperficie = 0;
		while (i < piece1.length) {
			sommeSuperficie +=  piece1[i].getSuperficie();
			i++;
		}
		return sommeSuperficie;
	}
	
	public double getSuperficiePiece(int etage) {
		int i = 0;
		double sommeSuperficie = 0;
		while (i < piece1.length) {
			if (piece1[i].getEtage() == etage) {
				sommeSuperficie += piece1[i].getSuperficie();
			}
		}
		return sommeSuperficie;
	}

	@Override
	public String toString() {
		return "Maison [piece1=" + Arrays.toString(piece1) + "]";
	}
	
	
	
}
