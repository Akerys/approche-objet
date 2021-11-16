package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNom implements Comparator<Ville>{
	
	

	public ComparatorNom() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		int result = o1.getNom().compareToIgnoreCase(o2.getNom());
		return result;
	}

}
