package fr.diginamic.banque.entites;

public abstract class Operation {

	String Date;
	int Montant;
	
	public Operation(String date, int montant) {
		this.Date = date;
		this.Montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [Date=" + Date + ", Montant=" + Montant + "]";
	}
	
	public abstract String getType();
}
