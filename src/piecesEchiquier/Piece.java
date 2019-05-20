package piecesEchiquier;

public class Piece {
	
	
	private String couleur = "";	
	//private String lettre = "..";
	private String nom = "..";
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
		this.nom = l;
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

	// gets & sets
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	////////////

	
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
