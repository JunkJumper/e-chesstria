package piecesEchiquier;

public class Roi extends Piece {
	private boolean verif=false;
	
	public Roi(String c,String l, Position pos)
	{
		super(c,l,pos);
	}
	
	/*
	public void enEchec(Piece piece, Position position) {
		boolean[][] mouvementsPossibles;
		mouvementsPossibles=piece.getMouvementsPossibles();
		
		positionCourante = super.getEmplacement();
		
		
	}
	*/
	
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
