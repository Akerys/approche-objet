package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	private Piece[] maison;
	
	public Maison(Piece[] maison) {
		this.maison = maison;
	}

	public void ajouterPiece(Piece piece) {
		if(piece!=null) {
			if((piece.getSuperficie()!=0) && (piece.getEtage()>=0)) {
				this.maison = Arrays.copyOf(this.maison,this.maison.length+1);
				this.maison[this.maison.length-1] = piece;
			}
		}
	}
	
	public int superficieTotale() {
		int superficie = 0;
		for(int i=0;i<maison.length;i++) {
			superficie += maison[i].getSuperficie();
		}
		return superficie;
	}
	
	public int superficieEtage(int etage) {
		int superficie = 0;
		for(int i=0;i<maison.length;i++) {
			if(maison[i].getEtage()==etage) {
				superficie += maison[i].getSuperficie();
			}
		}
		return superficie;
	}

	public int superficieGlobalePiece(String piece) {
		int superficie = 0;
		for(int i=0;i<maison.length;i++) {
			if(maison[i].getClass().getSimpleName().equals(piece)) {
				superficie += maison[i].getSuperficie();
			}
		}
		return superficie;
	}
	
	public int nombrePiece(String piece) {
		int nombre = 0;
		for(int i=0;i<maison.length;i++) {
			if(maison[i].getClass().getSimpleName().equals(piece)) {
				nombre ++;
			}
		}
		return nombre;
	}
}
