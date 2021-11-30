package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

		for (Double valeur : set) {
			System.out.print(valeur + " ");
		}
		System.out.println();

		double max = Collections.max(set); 
		double min = Collections.min(set); 

		System.out.println("Mon maximum est : " + max);
		System.out.println("Mon minimum est : " + min);

		set.remove(min);

		for (Double valeur : set) {
			System.out.print(valeur + " ");
		}
	}

}
