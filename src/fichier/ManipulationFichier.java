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
		Path fichier = Paths.get("C:/Users/Angie/Documents/workspace-spring-tool-suite-4-4.12.1.RELEASE/approche-objet/recensement.csv");
		List<String> lignes = Files.readAllLines(fichier,StandardCharsets.UTF_8);
		
		ArrayList<String> selection = new ArrayList<>();
		
		String ligneEntete = lignes.get(0);
		String[] colonnesEntete = ligneEntete.split(";");
		
		String ligneEnteteFinale = colonnesEntete[2]+";"+colonnesEntete[6]+";"+colonnesEntete[9];
		selection.add(ligneEnteteFinale);
		
		for(int i=1;i<lignes.size();i++) {
			System.out.println(lignes.get(i));
			
			String ligne = lignes.get(i);
			String[] colonnes = ligne.split(";");
			
			int population = Integer.parseInt(colonnes[9].replaceAll(" ",""));
			
			if(population>25000) {
				selection.add(colonnes[2]+";"+colonnes[6]+";"+colonnes[9]);
			}
		}
		
		Path pathCible = Paths.get("C:/Users/Angie/Documents/workspace-spring-tool-suite-4-4.12.1.RELEASE/approche-objet/recensement2.csv");
		Files.write(pathCible,selection);
	}

}
