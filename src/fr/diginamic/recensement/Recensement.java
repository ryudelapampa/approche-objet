package fr.diginamic.recensement;

import java.util.ArrayList;

public class Recensement {
	
	ArrayList<Ville> mesVilles = new ArrayList<Ville>();

	public Recensement(ArrayList<Ville> mesVilles) {
		super();
		this.mesVilles = mesVilles;
	}

	@Override
	public String toString() {
		return "Recensement [mesVilles=" + mesVilles + "]";
	}
	
	

}
