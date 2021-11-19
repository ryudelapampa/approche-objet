package listes;
import java.util.ArrayList;

public class CreationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nombres = new ArrayList<>();
		
		int i =0;
		while (i<100) {
			nombres.add(i);
			i++;
		}
		System.out.println(nombres.size());
	}

}
