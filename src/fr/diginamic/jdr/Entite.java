package fr.diginamic.jdr;

import java.util.Random;

public abstract class Entite {
	
	private int force;
	private int pdv;	
	
	public Entite() {
		this.force = 0;
		this.pdv = 0;
	}

	public int getForce() {
		return force;
	}

	public int getPdv() {
		return pdv;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	public abstract void setScore(int score);
	public abstract int getScore();

}
