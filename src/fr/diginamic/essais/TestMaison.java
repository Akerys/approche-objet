package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece[] pieces = new Piece[0];
		Maison maison = new Maison(pieces);
		
		maison.ajouterPiece(new Chambre(10,1));
		maison.ajouterPiece(new Cuisine(15,0));
		maison.ajouterPiece(new WC(5,1));
		maison.ajouterPiece(new SalleDeBain(10,1));
		maison.ajouterPiece(new Salon(20,0));
		maison.ajouterPiece(new WC(5,0));
		maison.ajouterPiece(new Chambre(10,0));
		maison.ajouterPiece(new Chambre(10,0));
		maison.ajouterPiece(new Chambre(10,1));
		
		System.out.println(maison.superficieTotale());
		System.out.println(maison.superficieEtage(0));
		System.out.println(maison.superficieEtage(1));
		System.out.println(maison.superficieGlobalePiece("Chambre"));
		System.out.println(maison.superficieGlobalePiece("Salon"));
		System.out.println(maison.superficieGlobalePiece("WC"));
		System.out.println(maison.superficieGlobalePiece("SalleDeBain"));
		System.out.println(maison.superficieGlobalePiece("Cuisine"));
		System.out.println(maison.nombrePiece("Chambre"));
		System.out.println(maison.nombrePiece("Salon"));
		System.out.println(maison.nombrePiece("WC"));
		System.out.println(maison.nombrePiece("SalleDeBain"));
		System.out.println(maison.nombrePiece("Cuisine"));
	}

}
