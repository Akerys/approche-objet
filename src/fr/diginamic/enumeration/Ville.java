package fr.diginamic.enumeration;


public class Ville {

	private String nom;
	private int nbHabitants;
	private Continent continent;


	public Ville(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + " : " + nbHabitants + " millions d'habitants. Continent :" + continent.getLibelle();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
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
		return autre.getNom().equals(this.nom) && autre.getNbHabitants() == this.nbHabitants
				&& autre.getContinent().equals(this.continent);
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
