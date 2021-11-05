package entites2;

import entites.AdressePostale;

public class Personne {
	
	public String Nom;
	public String Prenom;
	public AdressePostale Adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.Nom = nom;
		this.Prenom = prenom;
		this.Adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [Nom=" + Nom + ", Prenom=" + Prenom + ", Adresse=" + Adresse.toString() + "]";
	}

	
}
