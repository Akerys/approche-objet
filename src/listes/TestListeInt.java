package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		for(int i=0;i<liste.size();i++) {System.out.println(liste.get(i));}
		System.out.println(liste.size());
		System.out.println(Collections.max(liste));
		liste.remove(liste.indexOf(Collections.min(liste)));
		for(int i=0;i<liste.size();i++) {System.out.println(liste.get(i));}
		for(int i=0;i<liste.size();i++) {if(liste.get(i)<0) {liste.set(i, Math.abs(liste.get(i)));}}
		for(int i=0;i<liste.size();i++) {System.out.println(liste.get(i));}
	}

}
