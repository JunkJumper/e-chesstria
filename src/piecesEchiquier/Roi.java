package piecesEchiquier;

public class Roi extends Piece {
	
	public Roi(boolean couleur,char l, int x, int y)
	{
		super(couleur, l, x, y);
	}
	
	public void enEchec() {
		Position positionCourante;
		positionCourante= super.getEmplacement();
		
	}
	
}
