package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	private int jours;
	private double paie;
	
	public Pigiste(String nom, String prenom, int jours, double paie) {
		super(nom, prenom);
		this.jours = jours;
		this.paie = paie;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return jours*paie;
	}
}
