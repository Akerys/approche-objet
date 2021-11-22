package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur1.format(date1));
		Date date2 = new Date(116,4,19,23,59,30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formateur2.format(date2));

	}

}
