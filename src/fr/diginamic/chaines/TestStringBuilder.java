package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		long debut = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			builder.append(i+1);
		}
		
		// Code à chronométrer
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		System.out.println(builder.toString());
	}

}
