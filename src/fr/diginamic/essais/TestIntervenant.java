package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie s = new Salarie("ANDURAND","Angie",1582.5);
		Pigiste p = new Pigiste("ANDURAND","Angie",2,15.5);
		
		System.out.println(s.getSalaire());
		System.out.println(p.getSalaire());
		s.afficherDonnees();
		p.afficherDonnees();
	}

}
