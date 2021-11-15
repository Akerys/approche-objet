package listes;

public class Ville {
	private String nom;
	private int nb;
	
	public Ville(String nom, int nb) {
		super();
		this.nom = nom;
		this.nb = nb;
	}

	public String getNom() {
		return nom;
	}

	public int getNb() {
		return nb;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nb=" + nb + "]";
	}

	
	
}


