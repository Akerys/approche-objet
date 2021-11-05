package fr.diginamic.jdr;

public class Combat {

	private Entite[] protagonistes;
	private int tour;

	public Combat() {
		this.protagonistes = new Entite[2];
	}
	
	public void start(Personnage personnage) {
		if(personnage!=null && personnage.getPdv()>0) {
			int monstre = ((int) ((Math.random() * (4 - 1)) + 1));
			this.protagonistes[0] = personnage;
			if(monstre==1) {this.protagonistes[1] = new Loup();}
			else if(monstre==2) {this.protagonistes[1] = new Gobelin();}
			else {this.protagonistes[1] = new Troll();}
			this.tour = 0;
			tour();
		}
		else if(personnage==null){System.out.println("Vous n'avez pas de personnage");}
	}
	
	public void tour() {
		while(protagonistes[0].getPdv()>0 && protagonistes[1].getPdv()>0) {
			this.tour ++;
			int a1 = ((int) ((Math.random() * (11 - 1)) + 1)) + protagonistes[0].getForce();
			int a2 = ((int) ((Math.random() * (11 - 1)) + 1)) + protagonistes[1].getForce();
			System.out.println("---------------------------");
			System.out.println("Début du tour "+tour);
			System.out.println("Pdv créature :"+protagonistes[1].getPdv());
			System.out.println("Pdv personnage :"+protagonistes[0].getPdv());
			System.out.println("Attaque de la créature :"+a1);
			System.out.println("Attaque du personnage :"+a2);
		
			int degats = 0;
			if(a1>a2) {
				degats=a1-a2;
				protagonistes[1].setPdv(protagonistes[1].getPdv()-degats);
				System.out.println("Vous remportez le tour "+tour);
				System.out.println("Dégats :"+degats);
				System.out.println("Pdv créature :"+protagonistes[1].getPdv());
				System.out.println("Pdv personnage :"+protagonistes[0].getPdv());
				System.out.println("---------------------------");
			}
			else {
				degats=a2-a1;
				protagonistes[0].setPdv(protagonistes[0].getPdv()-degats);
				System.out.println("Vous perdez le tour "+tour);
				System.out.println("Dégats :"+degats);
				System.out.println("Pdv créature :"+protagonistes[1].getPdv());
				System.out.println("Pdv personnage :"+protagonistes[0].getPdv());		
				System.out.println("---------------------------");
			}	
		}
		this.tour = 0;
		if(protagonistes[0].getPdv()>0) {
			protagonistes[0].setScore(protagonistes[1].getScore());
			System.out.println("Votre personnage a gagné le combat contre le "+protagonistes[1].getClass().getSimpleName()+" !");
			System.out.println("Votre score actuel est de "+protagonistes[0].getScore());
			System.out.println("---------------------------");
		}
		else {
			System.out.println("Votre personnage est mort contre le "+protagonistes[1].getClass().getSimpleName()+" !");
			System.out.println("---------------------------");
		}
	}
}
