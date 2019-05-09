package piecesEchiquier;

public class Tour extends Piece {
	
	public Tour(String couleur,String l, Position pos)
	{
		super(couleur,l,pos);
	}
	
	public boolean deplacable(Echiquier e,Piece p) 
	{

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
