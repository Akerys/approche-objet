package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		String[] decoupe = chaine.split(";");
		
		System.out.println("Premier caractère : " + premierCaractere);
		System.out.println("Longueur de la chaîne : " + chaine.length());
		System.out.println("Index du premier ; : " + chaine.indexOf(';'));
		System.out.println("Nom de la personne : " + chaine.substring(0,chaine.indexOf(';')));
		System.out.println("Nom de la personne en masjuscules : " + chaine.substring(0,chaine.indexOf(';')).toUpperCase());
		System.out.println("Nom de la personne en minuscules : " + chaine.substring(0,chaine.indexOf(';')).toLowerCase());
		System.out.print("Découpage de la chaîne : ");
		for(int i=0;i<decoupe.length;i++) {System.out.print("[" + decoupe[i]+"]");}
		System.out.print("\n");
		
		Salarie s = new Salarie(decoupe[0],decoupe[1],Double.parseDouble(decoupe[2].replace(" ","")));
		System.out.println(s.toString());
	}

}
