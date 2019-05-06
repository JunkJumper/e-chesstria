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
	
	public boolean[][] deplacementsPossibles() {
		boolean[][] deplacementsPossibles = new boolean[8][8];
		Position position = this.getPosition();
		int x = position.getX();
		int y = position.getY();
		for(int i=x; i<8; i++) {
			//if(echiquier.estVide(position))
			deplacementsPossibles[i][y]=true;
		}	
		for(int j=0; j<8; j++) {
			deplacementsPossibles[x][j]=true;
		}
		deplacementsPossibles[x][y]=false;
		return deplacementsPossibles;
	}
}
