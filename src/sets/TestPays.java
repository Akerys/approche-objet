package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("Usa", 193_000, 1));
		set.add(new Pays("France", 12_000, 2));
		set.add(new Pays("Allemagne", 87_060, 3));
		set.add(new Pays("Uk", 210, 4));
		set.add(new Pays("Italie", 720, 5));
		set.add(new Pays("Japon", 4_300, 6));
		set.add(new Pays("Chine", 80_000, 7));
		set.add(new Pays("Russie", 92_100_000, 8));
		set.add(new Pays("Inde", 20_000, 9));


		Pays paysReference = set.iterator().next(); 

		for (Pays pays : set) {
			if (pays.getPibParHabitant() > paysReference.getPibParHabitant()) {
				paysReference = pays;
			}
		}
		System.out.println("Pays avec le PIB/Hab le plus élevé: " + paysReference);

		paysReference = set.iterator().next(); 

		for (Pays pays : set) {

			if (pays.getPibTotal() > paysReference.getPibTotal()) {
				paysReference = pays;
			}
		}
		System.out.println("Pays avec le PIB total le plus élevé: " + paysReference);



		paysReference = set.iterator().next(); 

		for (Pays pays : set) {
			if (pays.getPibTotal() < paysReference.getPibTotal()) {
				paysReference = pays;
			}
		}
		String nomEnMajuscules = paysReference.getNom().toUpperCase();
		paysReference.setNom(nomEnMajuscules);

		for (Pays pays : set) {

			System.out.println(pays);
		}

		set.remove(paysReference);

		for (Pays pays : set) {

			System.out.println(pays);
		}
	}

}