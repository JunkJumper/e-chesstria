package piecesEchiquier;

public class Fou extends Piece {
	
	public Fou(String c,String n, Position pos)
	{//c = couleur, n = nom, pos = position
		super(c,n,pos);
	}
	
	public boolean[][] deplacable(Echiquier e,Piece p) {
		boolean[][] deplacementsInherentsPiece = new boolean[8][8];
		Position position = this.getPosition();
		int x = position.getX();
		int y = position.getY();
		
		for(int i=x; i<8; i++) {
			deplacementsInherentsPiece[i][y]=true;
		}	
		for(int j=0; j<8; j++) {
			deplacementsInherentsPiece[x][j]=true;
		}
		deplacementsInherentsPiece[x][y]=false;
		return deplacementsInherentsPiece;
	}

}
