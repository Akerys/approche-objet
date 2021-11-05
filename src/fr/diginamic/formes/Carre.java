package fr.diginamic.formes;

public class Carre extends Rectangle{

	private int longueur;
	
	public Carre(int longueur) {
		super(longueur,longueur);
		this.longueur = longueur;
	}
	
	public double calculerPerimetre() {
		return 4*(longueur);
	}
	
	public double calculerSurface() {
		return Math.pow(longueur,2);
	}
}
