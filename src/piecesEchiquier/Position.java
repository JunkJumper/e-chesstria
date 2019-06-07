package piecesEchiquier;

public class Position {
	//ATTRIBUTS
	private int x;
	private int y;
	
	//CONSTRUCTEURS
	public Position() {
		
	}
	
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	//GETTERS AND SETTERS
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
