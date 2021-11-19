package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("C:/test/recensement.csv");
//		boolean exists = Files.exists(path);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		ArrayList<String> selection = new ArrayList<>();
		
		String ligneEntete = lines.get(0);
		String[] colonnesEntete = ligneEntete.split(";");
		
		String ligneEnteteFinal = colonnesEntete[2]+";"+colonnesEntete[6]+";"+colonnesEntete[9];
		selection.add(ligneEnteteFinal);
		
		for (int i=1; i<lines.size();i++) {

			String ligne = lines.get(i);
			String[] colonnes = ligne.split(";");
			
			int population = Integer.parseInt(colonnes[9].replaceAll(" ", ""));
			if (population > 25000) {
				selection.add(colonnes[2]+";"+colonnes[6]+";"+colonnes[9]);
			}
		}
		
		Path pathCible = Paths.get("C:/test/recensement25000.csv");
		Files.write(pathCible, selection);
		
	}

}
