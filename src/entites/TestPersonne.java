package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale(87,"Rue de Falaise","14000","Caen");
		Personne p1 = new Personne("ANDURAND","Angie",new AdressePostale(16,"Rue de l'Aramon","34430","Saint Jean de Védas"));
		Personne p2 = new Personne("CADUC","Rémi",new AdressePostale(6,"Rue des Coteaux","91370","Verrières-Les-Buisson"));
		Personne p3 = new Personne("CORDRAY","Jeanne-Angélique",a);
		Personne p4 = new Personne("andurand","Lucile");
		Personne p5 = new Personne(new AdressePostale(16,"Rue de l'Aramon","34430","Saint Jean de Védas"));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		p4.upperCase();
		System.out.println(p4);
		p5.setNom("Andurand");
		p5.setPrenom("PHILIPPE");
		System.out.println(p5);
		p4.setAdresse(new AdressePostale(16,"Rue de l'Aramon","34430","Saint Jean de Védas"));
		System.out.println(p4);
	}

}
