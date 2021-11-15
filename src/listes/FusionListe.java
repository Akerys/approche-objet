package listes;

import java.util.ArrayList;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste1 = new ArrayList<>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		ArrayList<String> liste3 = new ArrayList<>(liste1);
		liste3.addAll(liste2);
		
		for(String s : liste3) {System.out.println(s);}
	}

}
