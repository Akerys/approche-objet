package fr.diginamic.jdr;

public class Loup extends Creature{
	
	private static int score = 1;

	public Loup() {
		// TODO Auto-generated constructor stub
		super();
		super.setForce((int) ((Math.random() * (9 - 3)) + 3));
		super.setPdv((int) ((Math.random() * (11 - 5)) + 5));
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
