package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation[] o = {new Credit("05/11/2021",5),new Debit("05/11/2021",3),new Credit("05/11/2021",5),new Debit("05/11/2021",3)};
		
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]+o[i].getType());
		}
		
		int total = 0;
		for(int i=0;i<o.length;i++) {
			if(o[i].getType()=="CREDIT") {total += o[i].Montant;}
			else {total -= o[i].Montant;}
		}
		System.out.println(total);
	}

}
