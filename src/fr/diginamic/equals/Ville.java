package fr.diginamic.equals;


public class Ville {

	private String nom;
	private int nbHabitants;


	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return nom + " " + nbHabitants;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbHabitants;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville) obj;
		return autre.getNom().equals(this.nom) && autre.getNbHabitants() == this.nbHabitants;
	}


	public String getNom() {
		return nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}