package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nombre = new ArrayList<Integer>();
		nombre.add(-1);
		nombre.add(5);
		nombre.add(7);
		nombre.add(3);
		nombre.add(-2);
		nombre.add(4);
		nombre.add(8);
		nombre.add(5);
		
		for (Integer nbr : nombre) {
			System.out.println(nbr);
		}
		
		int max = 0;
		for (Integer nbr : nombre) {
			if (nbr > max) {
				max = nbr;
			}
		}
		
		int min = 0;
		for (Integer nbr : nombre) {
			if (nbr < min) {
				min = nbr;
			}
		}
		
		Iterator<Integer> iter = nombre.iterator();
		while (iter.hasNext()) {
			int inte = iter.next();
			if (inte == min) {
				iter.remove();
			}
		}
		
		for (int i =0; i < nombre.size(); i++) {
			if (nombre.get(i) < 0) {
				nombre.set(i, Math.abs(nombre.get(i)));
			}
		}
		
		 for (Integer nbr : nombre) {
			 if (nbr.equals(min)) {
				 nombre.remove(nbr);
			 }
		 }

		System.out.println("\nLe chiffre max est : "+max);
		System.out.println("\nListe de taille : "+nombre.size()+"\n");
		
		for (Integer nbr : nombre) {
			System.out.println(nbr);
		}
	}

}
