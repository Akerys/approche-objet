package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);
		Date date1 = cal1.getTime();
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur1.format(date1));
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
		System.out.println(formateur2.format(date2));
		System.out.println(formateur3.format(date2));
	}

}
