package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "12";
		int valeur = Integer.parseInt(chaine);
		System.out.println(valeur);
		int a = 3;
		int b = 15;
		System.out.println(max(a,b));		
	}
	
	public static String max(int a, int b) {
		if(a>b) {
			return "Le max entre a("+a+") et b("+b+") est : "+a;
		}
		else return "Le max entre a("+a+") et b("+b+") est : "+b;
	}
}
