package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice",343000));
		villes.add(new Ville("Carcassonne",47800));
		villes.add(new Ville("Narbonne",53400));
		villes.add(new Ville("Lyon",484000));
		villes.add(new Ville("Foix",9700));
		villes.add(new Ville("Pau",77200));
		villes.add(new Ville("Marseille",850700));
		villes.add(new Ville("Tarbes",40600));
		
		int max = 0;
		String ville = "";
		for(int i=0;i<villes.size();i++) {
			if(max<villes.get(i).getNb()){
				max=villes.get(i).getNb();ville=villes.get(i).getNom();
			}
		}
		System.out.println(ville);
		int min = villes.get(0).getNb();
		Ville supp = new Ville("",0);
		for(int i=0;i<villes.size();i++) {
			if(min>villes.get(i).getNb()){
				min=villes.get(i).getNb();supp=villes.get(i);
			}
		}
		villes.remove(villes.indexOf(supp));
		for(int i=0;i<villes.size();i++) {
			if(villes.get(i).getNb()<100000){
				villes.get(i).setNom(villes.get(i).getNom().toUpperCase());;
			}
		}
		for(Ville v : villes) {
			System.out.println(v.toString());
		}
		
		Collections.sort(villes);
		for(Ville v : villes) {
			System.out.println(v.toString());
		}
	}

}
