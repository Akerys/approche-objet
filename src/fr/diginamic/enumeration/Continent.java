package fr.diginamic.enumeration;


public enum Continent {

	AFRIQUE("Afrique"), AMERIQUE_NORD("Amérique du nord"), AMERIQUE_SUD("Amérique du sud"), ASIE("Asie"),
	EUROPE("Europe"), OCEANIE("Océanie");

	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return libelle;
	}

	public String getLibelle() {
		return libelle;
	}
}
