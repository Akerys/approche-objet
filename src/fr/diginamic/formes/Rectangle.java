package fr.diginamic.formes;

public class Rectangle extends Forme{

	private int longueur;
	private int largeur;
	
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double calculerPerimetre() {
		return 2*(longueur+largeur);
	}
	
	public double calculerSurface() {
		return longueur*largeur;
	}
}
