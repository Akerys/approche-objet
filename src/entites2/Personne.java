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
	
	public Personne(String nom, String prenom) {
		this.Nom = nom;
		this.Prenom = prenom;
		this.Adresse = new AdressePostale();
	}
	
	public Personne(AdressePostale adresse) {
		this.Nom = "NaN";
		this.Prenom = "NaN";
		this.Adresse = adresse;
	}
	
	public void upperCase() {
		this.Nom = this.Nom.toUpperCase();
		this.Prenom = this.Prenom.toUpperCase();
	}

	@Override
	public String toString() {
		return "Personne [Nom=" + Nom + ", Prenom=" + Prenom + ", Adresse=" + Adresse.toString() + "]";
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		this.Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}

	public AdressePostale getAdresse() {
		return Adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.Adresse = adresse;
	}

	
	
}
