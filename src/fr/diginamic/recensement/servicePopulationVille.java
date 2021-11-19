package fr.diginamic.recensement;

import java.util.Scanner;

public class servicePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de la ville voullu :");
		String scan = scanner.next();
		
		for (Ville villes : recensement.mesVilles) {
			if (villes.getNomCommune().equals(scan)) {
				System.out.println("La ville : "+villes.getNomCommune()+" compte : "+villes.getPopulationTotale()+" d'habitants !");
			}
		}
		
	}

}
