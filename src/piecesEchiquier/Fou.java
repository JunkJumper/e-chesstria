package piecesEchiquier;

public class Fou extends Piece {
	
	public Fou(String c,String n, Position pos)
	{//c = couleur, n = nom, pos = position
		super(c,n,pos);
	}
	
	public boolean deplacable(Echiquier e,Piece p)
	{
		System.out.println("test");
		System.out.println(p.getPosition().getX());
		System.out.println(p.getPosition().getY());
		System.out.println(this.getPosition().getX());
		System.out.println(this.getPosition().getY());
		for (int i = 1; i < 8; i++)
		{
			System.out.println("test2");
			if ( p.getPosition().getX() == this.getPosition().getX()+i)		// On trouve le x de la 2eme coors
			{
				System.out.println("test3");
				if (p.getPosition().getY() == this.getPosition().getY()+i )	// on verifie que quand on avance de x vers la droite on monte aussi de x
				{
					System.out.println("test4");
					//for (int j = this.getPosition().getX()+1;j <= p.getPosition().getX()-1;j++) // on verifie que le chemin est libre
					for (int j = 1;this.getPosition().getX()+j <= p.getPosition().getX()-1;j++) // on verifie que le chemin est libre
					{
						System.out.println(e.getEchiquier()[this.getPosition().getX()+j][this.getPosition().getY()+j].getPosition().getX());
						if ( !(e.getEchiquier()[this.getPosition().getX()+j][this.getPosition().getY()+j].getNom().equals(".."))   )
						{
							System.out.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					return true;
				}
				
				
				else if (p.getPosition().getY() == this.getPosition().getY()-i)
				{
					for (int j = this.getPosition().getX()+1;j <= p.getPosition().getX()-1;j++) // on verifie que le chemin est libre
					{
						System.out.println("test5.2");
						if ( !(e.getEchiquier()[j][this.getPosition().getY()-j].getNom().equals(".."))   )
						{
							System.out.println("Le chemin n'est pas libre.");
							return false;
						}
					}
					return true;
				}
			}
			
			
			
			
			
			else if ( p.getPosition().getX() == this.getPosition().getX()-i)
			{
				System.out.println("test6");
				if (p.getPosition().getY() == this.getPosition().getY()+i || p.getPosition().getY() == this.getPosition().getY()-i)
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
	
}
