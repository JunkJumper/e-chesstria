package piecesEchiquier;

public class Position {
	private int ligne;
	private int colonne;
	
	public Position() {
		
	}
	
	public Position(int x, int y)
	{
		ligne = x;
		colonne = y;
	}

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	
	
}
