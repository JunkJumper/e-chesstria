package piecesEchiquier;

public class Tour extends Piece {
	private boolean verif=false;
	
	public Tour(String couleur,String l, Position pos)
	{
		super(couleur,l,pos);
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
