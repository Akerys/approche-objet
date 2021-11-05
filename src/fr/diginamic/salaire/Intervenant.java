package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public void afficherDonnees() {
		System.out.println(this.nom+" "+this.prenom+" "+this.getSalaire()+" "+this.getClass().getSimpleName());
	}
}
