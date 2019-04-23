package piecesEchiquier;

public abstract class Piece {
	
	
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
	
	public Piece(boolean couleur,char l, int X, int Y)
	{
		this.setCouleur(couleur);
		this.lettre = l;
		this.emplacement.setEmplacement(X, Y);
		this.depart.setEmplacement(X, Y);
	}

	//vérifie une éventuelle collision a chaque case
	public boolean collision(Case caseArrivee){
		return caseArrivee.estVide();
		}
	
	//check si la case est alliee
	public boolean estAllie(Case caseArrivee) {
		return possesseur.equals(caseArrivee.getPieceCase().getPossesseur()) ;
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
