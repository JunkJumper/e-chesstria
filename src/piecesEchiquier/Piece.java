package piecesEchiquier;

public class Piece {
	
	
	//variables
	
	private boolean couleur;	/* True = blanc & Flase = noir */
	private Position emplacement;
	private char lettre = '.';
	private boolean enVie = true;
	private Position depart;
	
	
	
	//constructeur par defaut qui devrait probablement remplacer vide
	
	public Piece()
	{
		
	}
	
	// constructeur 
	
	public Piece(boolean couleur,char l, int x, int y)
	{
		this.setCouleur(couleur);
		this.lettre = l;
		this.emplacement = new Position (x, y);
		this.depart = new Position(x, y);
	}
	
	// gets & sets
	
	
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}

	////////////
	
	public Position getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(Position emplacement) {
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
