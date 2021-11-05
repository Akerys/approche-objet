package fr.diginamic.entites;

public class Cercle {
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public float perimetre() {
		return (float) (2*Math.PI*rayon);
	}
	
	public float surface() {
		return (float) (Math.PI*Math.pow(rayon,2));
	}
}
