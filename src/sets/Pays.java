package sets;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Pays {

	private String nom;
	private long nbHabitants;
	private long pibParHabitant;

	public Pays(String nom, int nbHabitants, int pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (nbHabitants ^ (nbHabitants >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + (int) (pibParHabitant ^ (pibParHabitant >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pays)) {
			return false;
		}
		
		Pays other = (Pays) obj; 
		
		EqualsBuilder builder = new EqualsBuilder();
		boolean resultat = builder.append(this.nom, other.getNom())
					      .append(this.nbHabitants, other.getNbHabitants())
					      .append(this.pibParHabitant, other.getPibParHabitant())
					      .isEquals();
		return resultat;
	}

	public long getPibTotal() {
		return pibParHabitant * nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public long getNbHabitants() {
		return nbHabitants;
	}

	public long getPibParHabitant() {
		return pibParHabitant;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public void setPibParHabitant(long pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return this.nom + " - PIB : " + this.pibParHabitant + "USD - Population : " + this.nbHabitants;
	}

}