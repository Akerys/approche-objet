package fr.diginamic.jdr;

import java.util.Random;

public class Personnage extends Entite{
	
	private int score;

	public Personnage() {
		super();
		Random r1 = new Random();
		Random r2 = new Random();
		super.setForce((int) ((Math.random() * (19 - 12)) + 12));
		super.setPdv((int) ((Math.random() * (51 - 20)) + 20));
		this.score =0;
	}

	@Override
	public void setScore(int score) {
		this.score += score;
	}

	public int getScore() {
		return score;
	}	
	
}
