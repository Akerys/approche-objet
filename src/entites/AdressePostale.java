package entites;

public class AdressePostale {

	int NumeroRue;
	String NomRue;
	String CodePostal;
	String Ville;
	
	public AdressePostale(int numero, String nom, String code, String ville) {
		// TODO Auto-generated constructor stub
		this.NumeroRue = numero;
		this.NomRue = nom;
		this.CodePostal = code;
		this.Ville = ville;
	}
	
	public AdressePostale() {
		// TODO Auto-generated constructor stub
		this.NumeroRue = 0;
		this.NomRue = "NaN";
		this.CodePostal = "NaN";
		this.Ville = "NaN";
	}

	@Override
	public String toString() {
		return "AdressePostale [NumeroRue=" + NumeroRue + ", NomRue=" + NomRue + ", CodePostal=" + CodePostal
				+ ", Ville=" + Ville + "]";
	}
	
	
}
