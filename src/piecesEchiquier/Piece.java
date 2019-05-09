package piecesEchiquier;

public abstract class Piece {
	
	
	private String couleur;	
	private String lettre = "..";
	private boolean enVie = true;
	private Position position;
	private Position ini;
	private boolean verif = false;
	
	//constructeur par defaut qui devrait probablement remplacer vide
	
	public Piece()
	{
		
	}
	
	// constructeur 
	public Piece(Position pos)
	{
		position = pos;
	}
	
	
	public Piece(String couleur,String l, Position pos)
	{
		this.couleur = couleur;
		this.lettre = l;
		//this.emplacementIni = emp;
		this.position = pos;
		this.ini=pos;
		
	}

	public boolean aBouge()
	{
		
		if(this.getIni() != this.getPosition())
		{
			verif=true;
		}
		if(this.getIni() == this.getPosition() && verif == false)
		{
			verif=false;
		}
		return verif;
	}
	
	public abstract boolean[][] deplacable(Echiquier e,Piece p);

	
/*	//verifie une eventuelle collision a chaque case
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
	
	
	public String getLettre() {
		return lettre;
	}
	public void setLettre(String lettre) {
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
	
	public Position getIni() {
		return ini;
	}

	public void setIni(Position ini) {
		this.ini = ini;
	}
	
	public boolean deplacable(Echiquier e,Piece p)
	{
		return true;
	}



	
	
	
}
