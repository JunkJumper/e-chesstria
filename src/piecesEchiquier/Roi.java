package piecesEchiquier;

//import joueurs.Joueur;

public class Roi extends Piece {
	private boolean verif=false;
	
	public Roi(String c,String l, Position pos)
	{
		super(c,l,pos);
	}
	
	/*
	public void enEchec(Piece piece, Position position) {
		boolean[][] mouvementsPossibles;
		mouvementsPossibles=piece.getMouvementsPossibles();
		
		positionCourante = super.getEmplacement();
		
		
	}
	*/
	
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
	
	public boolean deplacable(Echiquier e, Piece p) // vérifie que le roi peut être déplacé
	{
		//Côté droit
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut et x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY())) //Verifie deplacement x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas et x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		//Coté haut
		if((p.getPosition().getX()) == (this.getPosition().getX()) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		//Côté bas
		if((p.getPosition().getX()) == (this.getPosition().getX()) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		//Côté gauche
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut et x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY())) //Verifie deplacement x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas et x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		return false;
	}
	

}

