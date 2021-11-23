package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		@SuppressWarnings("deprecation")
		Date dateJour = new Date(121,10,22);
		@SuppressWarnings("deprecation")
		Date date1 = new Date(116,4,19,23,59,30);

		
		System.out.println(formateur.format(dateJour));
		System.out.println(formateur2.format(date1));
	}

}
