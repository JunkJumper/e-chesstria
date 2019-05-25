package piecesEchiquier;

public class Reine extends Piece {
	
	public Reine(String c,String l, Position pos)
	{
		super(c,l,pos);
	}
	
	public boolean deplacable(Echiquier e,Piece p)
	{
		if (p.getCouleur().equals(this.getCouleur())) {
			System.err.println("Vous ne pouvez pas manger une pièce de votre faction");
		}
		if (e.estVide(p.getPosition()) == false) //si on mange une piece
		{
			if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB"))) // si la pièce n'est pas un roi , on affiche le message
			{
				System.out.println("Vous avez mangé une pièce !");
			}
			
		}
		
		if(p.getPosition().getX() == this.getPosition().getX()) // verification les 2 pieces sont sur la meme colonne
		{
			if (p.getPosition().getY() > this.getPosition().getY()) // Test si la 2 eme piece est au dessus de la 1ere
			{
				for (int i = this.getPosition().getY()+1; i <= p.getPosition().getY()-1;i++) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[8-i][this.getPosition().getX()-1].getNom().equalsIgnoreCase(".."))) // SI case non vide
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {
							System.err.println("Le chemin n'est pas libre.");
		                }
						return false;
					}
				}
				return true; 
			}
			
			else if (p.getPosition().getY() < this.getPosition().getY()) // Test si la 2 eme piece est en dessous de la 1ere
			{
				for (int i = this.getPosition().getY()-1; i >= p.getPosition().getY()+1;i--)
				{
					if (!(e.getEchiquier()[8-i][this.getPosition().getX()-1].getNom().equals(".."))) // SI case non vide
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {
							System.err.println("Le chemin n'est pas libre.");
		                }
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
				for (int i = this.getPosition().getX()+1; i <= p.getPosition().getX()-1;i++) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[8-this.getPosition().getY()][i-1].getNom().equals(".."))) // SI case non vide
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {
							System.err.println("Le chemin n'est pas libre.");
		                }
						return false;
					}
				}
				return true;
			}
			
			else if (p.getPosition().getX() < this.getPosition().getX()) // Test si la 2 eme piece est au dessus de la 1ere
			{
				for (int i = this.getPosition().getX()-1; i >= p.getPosition().getX()+1;i--) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[8-this.getPosition().getY()][i-1].getNom().equals(".."))) // SI case non vide
					{
						return false;
					}
				}
				return true;
			}
			return false;
		}
		
		if (p.getPosition().getX() < this.getPosition().getX())
		{
			if (this.getPosition().getX() - p.getPosition().getX() == p.getPosition().getY()-this.getPosition().getY())
			{
				for (int i = 1; i < p.getPosition().getY()-this.getPosition().getY();i++)
				{
					if ( !(e.getEchiquier()[8-this.getPosition().getY()-i][this.getPosition().getX()-i-1].getNom().equals(".."))   )
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {
							System.err.println("Le chemin n'est pas libre.");
		                }
						return false;
					}
				}
				return true;
			}
			else if (this.getPosition().getX() - p.getPosition().getX() == this.getPosition().getY()-p.getPosition().getY())
			{
				for (int i = 1; i < this.getPosition().getY()-p.getPosition().getY();i++)
				{
					if ( !(e.getEchiquier()[8-this.getPosition().getY()+i][this.getPosition().getX()-i-1].getNom().equals(".."))   )
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {	
							System.err.println("Le chemin n'est pas libre.");
		                }
						return false;
					}
				}
				return true;
			}
		}else if (p.getPosition().getX() > this.getPosition().getX())
		{
			if (p.getPosition().getX() - this.getPosition().getX() == p.getPosition().getY()-this.getPosition().getY())
			{
				for (int i = 1; i < p.getPosition().getY()-this.getPosition().getY();i++)
				{
					if ( !(e.getEchiquier()[8-this.getPosition().getY()-i][this.getPosition().getX()+i-1].getNom().equals(".."))   )
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {
							System.err.println("Le chemin n'est pas libre.");
		                }
						return false;
					}
				}
				return true;
			}
			else if (p.getPosition().getX() - this.getPosition().getX() == this.getPosition().getY()-p.getPosition().getY())
			{
				for (int i = 1; i < this.getPosition().getY()-p.getPosition().getY();i++)
				{
					if ( !(e.getEchiquier()[8-this.getPosition().getY()+i][this.getPosition().getX()+i-1].getNom().equals(".."))   )
					{
						if(!(p.getNom().equalsIgnoreCase("KN") || p.getNom().equalsIgnoreCase("KB") || p.getNom().equalsIgnoreCase("..") )) // si la pièce n'est pas un roi et que c'est pas une case vide , on affiche le message
		                {
							System.err.println("Le chemin n'est pas libre.");
		                }
						return false;
					}
				}
				return true;
			}
			
		}
		return false;
		
	}
}
