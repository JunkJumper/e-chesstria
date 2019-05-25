package piecesEchiquier;

public class Piece {
	
	//ATTRIBUTS
	private String couleur = "";	
	private String nom = "..";
	private boolean enVie = true;
	private Position position;
	private Position ini;
	private boolean verif = false;
	
	//CONSTRUCTEURS
	public Piece()
	{
		
	}
	
	public Piece(Position pos)
	{
		position = pos;
	}
	
	
	public Piece(String couleur,String l, Position pos)
	{
		this.couleur = couleur;
		this.nom = l;
		this.position = pos;
		this.ini=pos;
		
	}

	//METHODES
	public boolean aBouge() //voir si la piece a bouger pour certains deplacement
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

	//GETTERS AND SETTERS
	
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
		if(p.getCouleur().equals(this.getCouleur())) {
			return false;
		}
		return true;
	}
	
	public boolean metEnEchec(Echiquier e, Piece p)
	{
		if(this.deplacable(e,p) == true) //1er cas : la pièce se deplace une seconde fois (pas vraiment) et verifie qu'elle tombe sur la position du roi (soit noir, soit blanc selon la couleur de la pièce)
		{
			System.out.println("Le roi est en échec");
			return true;
		}
		
		return false;
	}
}
