package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		int max = 0;
		int index = 0;
		for(int i=0;i<liste.size();i++) {
			if(max<liste.get(i).length()){
				max=liste.get(i).length();index=i;
			}
		}
		System.out.println(liste.get(index));
		for(String s : liste) {
			liste.set(liste.indexOf(s), liste.get(liste.indexOf(s)).toUpperCase());
		}
		
		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.startsWith("N")) {
				iter.remove();
			}
		}
		for(String s : liste) {System.out.println(s);}
	}

}
