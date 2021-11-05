package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte c = new Compte("0154",666);
		CompteTaux ct = new CompteTaux(0.5,"04523",777);
		Compte[] b = {c,ct};
		
		System.out.println(c);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
