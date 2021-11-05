package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne("ANDURAND","Angie",new AdressePostale(16,"Rue de l'Aramon","34430","Saint Jean de Védas"));
		Personne p2 = new Personne("CADUC","Rémi",new AdressePostale(6,"Rue des Coteaux","91370","Verrières-Les-Buisson"));
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
