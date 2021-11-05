package fr.diginamic.entites;

import java.util.Arrays;

public class Theatre {
	
	private String nom;
	private int capacite;
	private int clients;
	private double recette;
	
	public Theatre(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.clients = 0;
		this.recette = 0;
	}

	public void inscrire(int entrees, double prix) {
		if(clients+entrees>capacite) {System.out.println("Capacité maximale atteinte !");}
		else {
			clients += entrees;
			recette += (entrees*prix);
		}
	}

	public int getClients() {
		return clients;
	}

	public double getRecette() {
		return recette;
	}
	
	
}
