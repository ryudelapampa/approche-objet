package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static String afficher(Forme forme) {
		return "Le p�rim�tre de la forme est : "+forme.calculerPerimetre()+" cm et sa surface est de : "+forme.calculerSurface()+" cm�\n";
	}
	
}
