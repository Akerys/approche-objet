package fr.diginamic.formes;

public class Cercle extends Forme{
	
	private int rayon;

	public Cercle(int r) {
		super();
		this.rayon = r;
	}

	public double calculerPerimetre() {
		return 2*Math.PI*rayon;
	}
	
	public double calculerSurface() {
		return Math.PI*Math.pow(rayon,2);
	}

}
