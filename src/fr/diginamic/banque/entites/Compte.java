package fr.diginamic.banque.entites;

public class Compte {
	
	String Numero;
	int Solde;
	
	public Compte(String numero, int solde) {
		super();
		this.Numero = numero;
		this.Solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [Numero=" + Numero + ", Solde=" + Solde + "]";
	}
	
	
}
