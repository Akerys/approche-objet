package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Region;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.comparators.EnsemblePopComparateur;

public class RechercheRegionsPlusPeuplees extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Veuillez saisir un nombre de régions:");
		String nbRegionsStr = scanner.nextLine();
		int nbRegions = Integer.parseInt(nbRegionsStr);

		List<Ville> villes = recensement.getVilles();


		Map<String, Region> mapRegions = new HashMap<>();

		for (Ville ville : villes) {
			Region region = mapRegions.get(ville.getNomRegion());
			if (region == null) {
				region = new Region(ville.getCodeRegion(), ville.getNomRegion());
				mapRegions.put(ville.getNomRegion(), region);
			}
			region.addVille(ville);
		}

		List<Region> regions = new ArrayList<Region>();
		regions.addAll(mapRegions.values());
		Collections.sort(regions, new EnsemblePopComparateur(false));

		for (int i = 0; i < nbRegions; i++) {
			Region region = regions.get(i);
			System.out.println("Region " + region.getNom() + " : " + region.getPopulation() + " habitants.");
		}

	}

}
