package piecesEchiquier;

public class Fou extends Piece {
	
	public Fou(String c,String n, Position pos)
	{//c = couleur, n = nom, pos = position
		super(c,n,pos);
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

