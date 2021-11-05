package fr.diginamic.jdr;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix = 0;
		int serie = 0;
		boolean code = false;
		Scanner scanner = new Scanner(System.in);
		Personnage p = new Personnage();
		
		while((choix<4) && (choix>=0)) {
			System.out.println("1. Créer un personnage");
			System.out.println("2. Combattre une créature");
			System.out.println("3. Afficher le score");
			System.out.println("4. Quiter");
			System.out.println("Que voulez-vous faire ?");
			System.out.println("---------------------------");
		
			choix = scanner.nextInt();
		
			if(choix==1) {
				p = new Personnage();
				code = true;
				System.out.println("\nPersonnage : "+p.getForce()+"Force ; "+p.getPdv()+"Pdv\n");
				System.out.println("---------------------------");
			}
			else if(((choix==2)||(choix==3)) && !code) {
				System.out.println("\nVous n'avez pas de personnage\n");
				System.out.println("---------------------------");
			}
			else if(choix==2 && code && p.getPdv()>0) {
				Combat c = new Combat();
				c.start(p);
				if(p.getPdv()<=0) {
					System.out.println("\nVous avez gagné une série de "+serie+" combats avant de mourir !"+"\n");	
					System.out.println("---------------------------");
					serie=0;
				}
				else {serie++;}
			}
			else if(choix==2 && code && p.getPdv()<=0) {
				System.out.println("\nVotre personnage est décédé. Il a obtenu le score de "+p.getScore()+" points. Veuillez créer un nouveau personnage\n");
				System.out.println("---------------------------");
			}
			else if(choix==3 && code) {
				System.out.println("\nVotre score est de "+p.getScore()+"\n");
				System.out.println("---------------------------");
			}
			else if(choix==0) {break;}
		}
		scanner.close();
	}

}
