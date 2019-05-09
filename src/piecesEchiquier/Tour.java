package piecesEchiquier;

public class Tour extends Piece {
	private boolean verif=false;
	
	public Tour(String couleur,String l, Position pos)
	{
		super(couleur,l,pos);
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
	
	public boolean deplacable(Echiquier e,Piece p) 
	{
		/*boolean[][] deplacementsInherentsPiece = new boolean[8][8];
		Position position = this.getPosition();
		int x = position.getX();
		int y = position.getY();
		
		for(int i=x; i<8; i++) {
			deplacementsInherentsPiece[i][y]=true;
		}	
		for(int j=0; j<8; j++) {
			deplacementsInherentsPiece[x][j]=true;
		}
		deplacementsInherentsPiece[x][y]=false;
		return deplacementsInherentsPiece;*/
		if(p.getPosition().getX() == this.getPosition().getX()) // verification les 2 pieces sont sur la meme colonne
		{
			if (p.getPosition().getY() > this.getPosition().getY()) // Test si la 2 eme piece est au dessus de la 1ere
			{
				for (int i = this.getPosition().getY()+1; i < p.getPosition().getY();i++) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[this.getPosition().getX()][i].getLettre().equals(".."))) // SI case non vide
					{
						return false;
					}
				}
				return true; 
			}
			
			else if (p.getPosition().getY() < this.getPosition().getY()) // Test si la 2 eme piece est en dessous de la 1ere
			{
				for (int i = this.getPosition().getX()-1; i > p.getPosition().getX();i--)
				{
					if (!(e.getEchiquier()[this.getPosition().getY()][i].getLettre().equals(".."))) // SI case non vide
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}

		else if(p.getPosition().getY() == this.getPosition().getY()) // verification les 2 pieces sont sur la meme colonne
		{
			if (p.getPosition().getX() > this.getPosition().getX()) // Test si la 2 eme piece est au dessus de la 1ere
			{
				for (int i = this.getPosition().getX()+1; i < p.getPosition().getX();i++) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[i][this.getPosition().getY()].getLettre().equals(".."))) // SI case non vide
					{
						System.out.println("test");
						return false;
					}
				}
				return true;
			}
			
			else if (p.getPosition().getX() < this.getPosition().getX()) // Test si la 2 eme piece est au dessus de la 1ere
			{
				for (int i = this.getPosition().getX()-1; i > p.getPosition().getX();i--) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[i][this.getPosition().getY()].getLettre().equals(".."))) // SI case non vide
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}
		else 
			return false;
	}
}
