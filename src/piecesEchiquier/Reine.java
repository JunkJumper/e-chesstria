package piecesEchiquier;

public class Reine extends Piece {
	
	public Reine(String c,String l, Position pos)
	{
		super(c,l,pos);
	}
	
	public boolean deplacable(Echiquier e,Piece p)
	{
		if (e.estVide(p.getPosition()) == false) //si on mange une piece
			System.out.println("Vous avez mangé une pièce !");
		
		if(p.getPosition().getX() == this.getPosition().getX()) // verification les 2 pieces sont sur la meme colonne
		{
			System.out.println("test");
			if (p.getPosition().getY() > this.getPosition().getY()) // Test si la 2 eme piece est au dessus de la 1ere
			{
				System.out.println("test2");
				for (int i = this.getPosition().getY()+1; i <= p.getPosition().getY()-1;i++) // verifie qu'il n'y a pas d'obstacles sur le chemin
				{
					if (!(e.getEchiquier()[8-i][this.getPosition().getX()-1].getNom().equals(".."))) // SI case non vide
					{
						System.err.println("Le chemin n'est pas libre.");
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
						System.err.println("Le chemin n'est pas libre.");
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
						System.err.println("Le chemin n'est pas libre.");
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
		
		for (int i = 1; i < 8; i++)				// ON CHERCHE SI LA 2EME COORS EST EN DIAGONALE DE LA 1 ERE
		{
			System.out.println("test");
			if ( p.getPosition().getX() == this.getPosition().getX()+i)		// 2eme coors a droite de la 1 ere
			{
				
				
				if (p.getPosition().getY() == this.getPosition().getY()+i )	// on teste si quand on avance de x vers la droite on monte aussi de x
				{
					for (int j = 1;this.getPosition().getX()+j <= p.getPosition().getX()-1;j++) // on verifie que le chemin est libre
					{
						if ( !(e.getEchiquier()[8-(this.getPosition().getY()+j)][this.getPosition().getX()+j-1].getNom().equals(".."))   )
						{
							System.err.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					return true;
				}
				
				
				else if (p.getPosition().getY() == this.getPosition().getY()-i)  // on teste si quand on avance de x vers la droite on descend aussi de x
				{
					for (int j = 1;this.getPosition().getX()+j <= p.getPosition().getX()-1;j++) 	// on verifie que le chemin est libre
					{
						if ( !(e.getEchiquier()[8-(this.getPosition().getY()-j)][this.getPosition().getX()+j-1].getNom().equals(".."))   )
						{
							System.err.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					return true;
				}
				
				
				
			}

			else if ( p.getPosition().getX() == this.getPosition().getX()-i)	// 2eme coors a gauche de la 1 ere
			{
				
				if (p.getPosition().getY() == this.getPosition().getY()+i )	// on teste si quand on va en x vers la gauche on monte aussi de x
				{
					for (int j = 1;this.getPosition().getX()-j >= p.getPosition().getX()+1;j++) // on verifie que le chemin est libre
					{
						if ( !(e.getEchiquier()[8-(this.getPosition().getY()+j)][this.getPosition().getX()+j-1].getNom().equals(".."))   )
						{
							System.err.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					return true;
				}
				
				
				else if (p.getPosition().getY() == this.getPosition().getY()-i)  // on teste si quand on va de x vers la droite on descend aussi de x
				{
					for (int j = 1;this.getPosition().getX()-j >= p.getPosition().getX()+1;j++) 	// on verifie que le chemin est libre
					{
						if ( !(e.getEchiquier()[8-(this.getPosition().getY()-j)][this.getPosition().getX()+j-1].getNom().equals(".."))   )
						{
							System.err.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					return true;
				}
				
				
				
				return false;
			}
		}
		
		return false;
	}
}
