
package piecesEchiquier;

public class Piece {
	
	
	private String couleur;	
	//private Position emplacementIni;
	private String emp;
	private char lettre = '.';
	private boolean enVie = true;
	private Position position;
	
	
	
	//constructeur par defaut qui devrait probablement remplacer vide
	
	public Piece()
	{
		
	}
	
	// constructeur 
	public Piece(Position pos)
	{
		position = pos;
	}
	
	public Piece(String couleur,String emp, char l, Position pos)
	{
		this.couleur = couleur;
		this.lettre = l;
		//this.emplacementIni = emp;
		this.emp = emp;
		this.position = pos;
	}

/*	//vérifie une éventuelle collision a chaque case
	public boolean collision(Case caseArrivee){
		return caseArrivee.estVide();
		}*/
	/*
	//check si la case est alliee
	public boolean estAllie(Case caseArrivee) {
		return possesseur.equals(caseArrivee.getPieceCase().getPossesseur()) ;
	}
*/


	
	// gets & sets
	
	
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}

	////////////
	/*
	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
*/
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public boolean deplacable(Piece p)
	{
		return true;
	}



	
	
	
}
