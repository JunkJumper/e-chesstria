package piecesEchiquier;

public class Pion extends Piece {
	public Pion(String couleur, String emp,String l, Position pos) {
		
		super(couleur,emp,l, pos);
		
	}
	
	public boolean deplacable(Piece p)
	{
		if (this.getPosition().getX() != p.getPosition().getX())
		{
			return false;
		}
		else if (p.getPosition().getY()-1 > this.getPosition().getY())
		{
			return false;
		}
		else 
			return true;
	}
	

}
