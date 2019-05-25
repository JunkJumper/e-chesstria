package piecesEchiquier;

public class Tour extends Piece {
	
	public Tour(String couleur,String l, Position pos)
	{
		super(couleur,l,pos);
	}
	
	public boolean deplacable(Echiquier e,Piece p) 
	{
		if (e.estVide(p.getPosition()) == false) //si on mange une piece
		{
			if(!(p.getNom().equals("KN") || p.getNom().equals("KB"))) // si la pièce n'est pas un roi , on affiche le message
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
		else 
			return false;
	}
	
}
