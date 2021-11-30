package sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 */
public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.addAll(Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));


		String paysMaxLettres = set.iterator().next(); 

		for (String nom : set) {
			if (nom.length() > paysMaxLettres.length()) {
				paysMaxLettres = nom;
			}
		}
		System.out.println("Pays avec le max de lettres : " + paysMaxLettres);

		set.remove(paysMaxLettres);

		for (String nom : set) {
			System.out.println(nom);
		}
	}

}
