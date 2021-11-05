package fr.diginamic.jdr;

public class Troll extends Creature{
	
	private static int score = 5;

	public Troll() {
		// TODO Auto-generated constructor stub
		super();
		super.setForce((int) ((Math.random() * (16 - 10)) + 10));
		super.setPdv((int) ((Math.random() * (31 - 20)) + 20));
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
