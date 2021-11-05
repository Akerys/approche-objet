package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] liste;
	
	public CalculMoyenne(double[] liste) {
		this.liste = liste;
	}

	public void ajout(double nombre) {
		this.liste = Arrays.copyOf(this.liste,this.liste.length+1);
		this.liste[this.liste.length-1] = nombre;
	}
	
	public double calcul() {
		double somme = 0;
		for(int i=0;i<this.liste.length;i++) {
			somme += this.liste[i];
		}
		return somme/this.liste.length;
	}
}
