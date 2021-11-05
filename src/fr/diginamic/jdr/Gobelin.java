package fr.diginamic.jdr;

public class Gobelin extends Creature{

	private static int score = 2;
	
	public Gobelin() {
		// TODO Auto-generated constructor stub
		super();
		super.setForce((int) ((Math.random() * (11 - 5)) + 5));
		super.setPdv((int) ((Math.random() * (16 - 10)) + 10));
		System.out.println("\n"+this.getClass().getSimpleName()+" : "+this.getForce()+"Force ; "+this.getPdv()+"Pdv\n");
		System.out.println("---------------------------");
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return this.score;
	}

	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		
	}

}
