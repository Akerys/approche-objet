package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre t1 = new Theatre("Moulin Rouge",15);
		
		t1.inscrire(10,3);
		t1.inscrire(4,3);
		t1.inscrire(2,3);
		
		System.out.println(t1.getClients());
		System.out.println(t1.getRecette());
	}

}
