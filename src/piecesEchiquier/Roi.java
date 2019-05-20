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
	
/*	public boolean enEchec(Echiquier e, Joueur Jopp)
	{
		for (int i = 0; i < e.getEchiquier().length;i++)
		{
			for (int j = 0; j < e.getEchiquier().length;j++)
			{
				if ( !(e.getEchiquier()[i][j].getCouleur() == this.getCouleur() ) && (e.verificationMouvementSilencieuse(Jopp,e.getCodes()[i][j],e.getCodes()[8-this.getPosition().getY()][this.getPosition().getX()-1]) == true) )
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean enEchecEtMat(Echiquier e, Joueur Jopp)
	{
		if (this.getPosition().getY() <= 7 && e.getEchiquier()[8-(this.getPosition().getY()+1)][this.getPosition().getX()-1].getNom().equals("..")) // verification mouvement vers le haut libre
		{
			e.getEchiquier()[8-(this.getPosition().getY()+1)][this.getPosition().getX()-1] = this; // on fait un fantome roi
			e.getEchiquier()[8-(this.getPosition().getY()+1)][this.getPosition().getX()-1].getPosition().setY(this.getPosition().getY()+1); // on corrige sa position
			if (!(this.enEchec(e,Jopp) )) // si pas en echec possibilité de mouvement donc pas echec et mat
			{
				e.getEchiquier()[8-(this.getPosition().getY()+1)][this.getPosition().getX()-1] = new Piece(new Position(this.getPosition().getX(),this.getPosition().getY()+1));
				// on tue le fantome de test
				return false;
			}
				
		}
		
		if (e.getEchiquier()[8-(this.getPosition().getY()-1)][this.getPosition().getX()-1].getNom().equals("..")) // verification mouvement vers le bas libre
		{
			e.getEchiquier()[8-(this.getPosition().getY()-1)][this.getPosition().getX()-1] = this; // on fait un fantome roi
			e.getEchiquier()[8-(this.getPosition().getY()-1)][this.getPosition().getX()-1].getPosition().setY(this.getPosition().getY()-1); // on corrige sa position
			if (!(this.enEchec(e,Jopp) )) // si pas en echec possibilité de mouvement donc pas echec et mat
			{
				e.getEchiquier()[8-(this.getPosition().getY()-1)][this.getPosition().getX()-1] = new Piece(new Position(this.getPosition().getX(),this.getPosition().getY()-1));
				// on tue le fantome de test
				return false;
			}
				
		}
		
		if (e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)-1].getNom().equals("..")) // verification mouvement vers la gauche libre
		{
			e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)-1] = this; // on fait un fantome roi
			e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)-1].getPosition().setX(this.getPosition().getX()-1); // on corrige sa position
			if (!(this.enEchec(e,Jopp) )) // si pas en echec possibilité de mouvement donc pas echec et mat
			{
				e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)-1] = new Piece(new Position(this.getPosition().getX()-1,this.getPosition().getY()) );
				// on tue le fantome de test
				return false;
			}
				
		}
		
		if (e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)+1].getNom().equals("..")) // verification mouvement vers la droite libre
		{
			e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)+1] = this; // on fait un fantome roi
			e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)+1].getPosition().setX(this.getPosition().getX()+1); // on corrige sa position
			if (!(this.enEchec(e,Jopp) )) // si pas en echec possibilité de mouvement donc pas echec et mat
			{
				e.getEchiquier()[8-this.getPosition().getY()][(this.getPosition().getX()-1)+1] = new Piece(new Position(this.getPosition().getX()+1,this.getPosition().getY()) );
				// on tue le fantome de test
				return false;
			}
				
		}
		return true;
	}*/
}

