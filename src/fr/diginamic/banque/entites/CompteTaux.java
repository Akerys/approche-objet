package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	double Taux;

	public CompteTaux(double taux, String numero, int solde) {
		super(numero,solde);
		this.Taux = taux;
	}

	@Override
	public String toString() {
		return "CompteTaux [Taux=" + Taux + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
