package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(5);
		Cercle c2 = new Cercle(10);
		
		System.out.println(c1.perimetre());
		System.out.println(c2.perimetre());
		System.out.println(c1.surface());
		System.out.println(c2.surface());
	}

}
