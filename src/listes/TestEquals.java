package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville paris = new Ville("Paris", 5_000_000);
		Ville paris2 = new Ville("Paris",4_000_000);
		Ville carcassonne = new Ville("Carcassonne",70_000);
		
		System.out.println(paris.equals(paris2));
		System.out.println(paris.equals(carcassonne));
		System.out.println(paris == paris2);
		System.out.println(paris == carcassonne);
		paris2 = paris;
		System.out.println(paris == paris2);
		
	}

}
