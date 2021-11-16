package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville>{
	
	

	public ComparatorHabitant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		if (o1.getNb() > o2.getNb()){
			return 1;
		}
		if (o1.getNb() < o2.getNb()){
			return -1;
		}
		return 0;
	}

}
