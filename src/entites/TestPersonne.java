package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale(87,"Rue de Falaise","14000","Caen");
		Personne p1 = new Personne("ANDURAND","Angie",new AdressePostale(16,"Rue de l'Aramon","34430","Saint Jean de Védas"));
		Personne p2 = new Personne("CADUC","Rémi",new AdressePostale(6,"Rue des Coteaux","91370","Verrières-Les-Buisson"));
		Personne p3 = new Personne("CORDRAY","Jeanne-Angélique",a);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
