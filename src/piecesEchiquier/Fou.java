package piecesEchiquier;

public class Fou extends Piece {
	
	public Fou(String c,String n, Position pos)
	{//c = couleur, n = nom, pos = position
		super(c,n,pos);
	}
	
	public boolean deplacable(Echiquier e,Piece p)
	{
		for (int i = 1; i < 8; i++)				// ON CHERCHE SI LA 2EME COORS EST EN DIAGONALE DE LA 1 ERE
		{

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
					System.out.println("Vous avez mangé une pièce !");
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
					System.out.println("Vous avez mangé une pièce !");
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
							System.out.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					System.out.println("Vous avez mangé une pièce !");
					return true;
				}
				
				
				else if (p.getPosition().getY() == this.getPosition().getY()-i)  // on teste si quand on va de x vers la droite on descend aussi de x
				{
					for (int j = 1;this.getPosition().getX()-j >= p.getPosition().getX()+1;j++) 	// on verifie que le chemin est libre
					{
						if ( !(e.getEchiquier()[8-(this.getPosition().getY()-j)][this.getPosition().getX()+j-1].getNom().equals(".."))   )
						{
							System.out.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					System.out.println("Vous avez mangé une pièce !");
					return true;
				}
				
				
				System.out.println("Vous avez mangé une pièce !");
				return true;
			}
		}
		return false;
		
	}
	
	
}
