package piecesEchiquier;

public class Piece {
	
	
	//variables
	
	private String couleur;	
	private String emplacement;
	private char lettre = '.';
	private boolean enVie = true;
	
	
	
	//constructeur par defaut qui devrait probablement remplacer vide
	
	public Piece()
	{
		
	}
	
	// constructeur 
	
	public Piece(String c, String emp,char l)
	{
		couleur = c;
		emplacement = emp;
		lettre = l;
	}
	
	// gets & sets
	
	
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}

	////////////
	
	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	///////////
	
	public boolean isEnVie() {
		return enVie;
	}
	
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}

	///////////
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	
	
	
}
