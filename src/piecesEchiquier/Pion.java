package piecesEchiquier;

public class Pion extends Piece {
	private boolean verif=false;
	
	public Pion(String couleur,String l, Position pos) {
		
		super(couleur,l, pos);
		
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

}
