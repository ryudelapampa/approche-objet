package entities;

public class AdressePostale {

	int numeroRue ;
	String libelleRue ;
	int codePostale ;
	String libelleVille ;
	
	public AdressePostale(int numRue,String libRue,int codePost,String libVille ) {
		numeroRue = numRue;
		libelleRue = libRue;
		codePostale = codePost;
		libelleVille = libVille;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostale=" + codePostale
				+ ", libelleVille=" + libelleVille + "]";
	}
	
}
