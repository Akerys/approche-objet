package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c = new Cercle(5);
		Rectangle r = new Rectangle(2,4);
		Carre ca = new Carre(4);
		
		AffichageForme.afficher(c);
		AffichageForme.afficher(r);
		AffichageForme.afficher(ca);
	}

}
