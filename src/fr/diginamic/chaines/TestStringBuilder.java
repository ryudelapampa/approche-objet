package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder();
		String nombres = "";
		long debut = System.currentTimeMillis();
		
		for (int i =0;i<100000;i++) {
			nombres = nombres+i;
		}
		
		long fin = System.currentTimeMillis();
		
		long debut2 = System.currentTimeMillis();
		
		for (int i =0;i<1000000;i++) {
			builder.append(i);
		}
		
		long fin2 = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes (Concaténation) : " + (fin - debut));
		System.out.println("Temps écoulé en millisecondes (Builder) : " + (fin2 - debut2));
		
	}

}
