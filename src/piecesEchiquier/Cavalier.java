package piecesEchiquier;

public class Cavalier extends Piece {
	
	public Cavalier(String c,String l, Position pos)
	{
		super(c,l,pos);
	}
	
	public boolean deplacable(Echiquier e, Piece p) // vérifie que le Cavalier peut être déplacé
	{
		if (e.estVide(p.getPosition()) == false) //si on mange une piece
			System.out.println("Vous avez mangé une pièce !");
		
		//COTE DROIT
			//HAUT
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY()+2)) //Verifie deplacement y+2 vers le haut et x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()+2) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut et x+2 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
			//BAS
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY()-2)) //Verifie deplacement y-2 vers le bas et x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()+2) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas et x+2 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		//COTE GAUCHE
			//HAUT
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY()+2)) //Verifie deplacement y+2 vers le haut et x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()-2) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas et x-2 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
			//BAS
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY()-2)) //Verifie deplacement y-2 vers le bas et x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()-2) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y+1 vers le haut et x-2 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur())
			{
				return true;
			}
		}
		
		return false;
	}
}
