package fr.diginamic.operations;

public class Operations {

	public static double calcul(int a, int b, char signe) {
		if(signe=='+') {return a+b;}
		else if(signe=='-') {return a-b;}
		else if(signe=='*') {return a*b;}
		else if(signe=='/') {return a/b;}
		else return 0;
	}
}
