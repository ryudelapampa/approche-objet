package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		cal.set(2016,5, 29, 23, 59, 30);
		
		Date maDate = cal.getTime();
		
		cal.set(2021, 11,22,14,22,30);
		
		Date dateJour = cal.getTime();
		
		Locale russie = new Locale("ru", "RU");
		
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formateur2 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
		SimpleDateFormat formateurAll = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
		SimpleDateFormat formateurRusse = new SimpleDateFormat("EEEE dd MMMM yyyy", russie);
		SimpleDateFormat formateurChinois = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
		
		
		System.out.println(formateur.format(maDate));
		System.out.println(formateur2.format(dateJour));
		System.out.println(formateur2.format(new Date()));
		System.out.println(formateurRusse.format(new Date()));
		System.out.println(formateurAll.format(new Date()));
		System.out.println(formateurChinois.format(new Date()));
		
	}

}
