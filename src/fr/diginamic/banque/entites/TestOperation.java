package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] ope1 = {new Debit("08/11/2021",567), new Debit("08/11/2021",150), new Credit("08/11/2021",250), new Credit("08/11/2021",1100) };
		
		int i =0;
		double total = 0;
		while (i<ope1.length) {
			System.out.println(ope1[i]+" de type : "+ ope1[i].getType() );
//			total = total + ope1[i].getMontant();
			
			if (ope1[i].getType()== "debit") {
				total = total - ope1[i].getMontant();
			} else if (ope1[i].getType()== "credit") {
				total = total + ope1[i].getMontant();
			}
			i++;
		}
		System.out.println("Le total de mes opération est de "+total+" €");
	}

}
