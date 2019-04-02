package piecesEchiquier;

public class Piece {
	
	
	//variables
	
	private boolean couleur;	
	private String emplacement;
	private char lettre = '.';
	private boolean enVie = true;
	
	
	
	//constructeur par defaut qui devrait probablement remplacer vide
	
	public Piece()
	{
		
	}
	
	// constructeur 
	
	public Piece(boolean couleur, String emp,char l)
	{
		this.setCouleur(couleur);
		this.emplacement = emp;
		this.lettre = l;
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
	
	public boolean isCouleur() {
		return couleur;
	}

	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}

	
	
	
}
