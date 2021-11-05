package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calculMoyenne = new CalculMoyenne(new double[0]);
		// TODO Auto-generated method stub
		calculMoyenne.ajout(2);
		calculMoyenne.ajout(3);
		calculMoyenne.ajout(1);
		calculMoyenne.ajout(2);
		calculMoyenne.ajout(2);
		System.out.println(calculMoyenne.calcul());
	}

}
