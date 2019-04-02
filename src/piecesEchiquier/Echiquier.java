package piecesEchiquier;

public class Echiquier {
	
	private String[][] codes = 
{
{"8A","8B","8C","8D","8E","8F","8G","8H"},
{"7A","7B","7C","7D","7E","7F","7G","7H"},
{"6A","6B","6C","6D","6E","6F","6G","6H"},
{"5A","5B","5C","5D","5E","5F","5G","5H"},
{"4A","4B","4C","4D","4E","4F","4G","4H"},
{"3A","3B","3C","3D","3E","3F","3G","3H"},
{"2A","2B","2C","2D","2E","2F","2G","2H"},
{"1A","1B","1C","1D","1E","1F","1G","1H"}
};
//a refaire
	public Pion pionB1 = new Pion("Blanc",codes[6][0],'P');
	public Pion pionB2 = new Pion("Blanc",codes[6][1],'P');
	public Pion pionB3 = new Pion("Blanc",codes[6][2],'P');
	public Pion pionB4 = new Pion("Blanc",codes[6][3],'P');
	public Pion pionB5 = new Pion("Blanc",codes[6][4],'P');
	public Pion pionB6 = new Pion("Blanc",codes[6][5],'P');
	public Pion pionB7 = new Pion("Blanc",codes[6][6],'P');
	public Pion pionB8 = new Pion("Blanc",codes[6][7],'P');
	
	public Pion pionN1 = new Pion("Noir",codes[1][0],'P');
	public Pion pionN2 = new Pion("Noir",codes[1][1],'P');
	public Pion pionN3 = new Pion("Noir",codes[1][2],'P');
	public Pion pionN4 = new Pion("Noir",codes[1][3],'P');
	public Pion pionN5 = new Pion("Noir",codes[1][4],'P');
	public Pion pionN6 = new Pion("Noir",codes[1][5],'P');
	public Pion pionN7 = new Pion("Noir",codes[1][6],'P');
	public Pion pionN8 = new Pion("Noir",codes[1][7],'P');
	
	public Tour TourB1 = new Tour("Blanc",codes[7][0],'T');
	public Tour TourB2 = new Tour("Blanc",codes[7][7],'T');
	public Tour TourN1 = new Tour("Noir",codes[0][0],'T');
	public Tour TourN2 = new Tour("Noir",codes[0][7],'T');
	
	public Cavalier CavalierB1 = new Cavalier("Blanc",codes[7][1],'C');
	public Cavalier CavalierB2 = new Cavalier("Blanc",codes[7][6],'C');
	public Cavalier CavalierN1 = new Cavalier("Noir",codes[0][1],'C');
	public Cavalier CavalierN2 = new Cavalier("Noir",codes[0][6],'C');
	
	public Fou FouB1 = new Fou("Blanc",codes[7][2],'F');
	public Fou FouB2 = new Fou("Blanc",codes[7][5],'F');
	public Fou FouN1 = new Fou("Noir",codes[0][2],'F');
	public Fou FouN2 = new Fou("Noir",codes[0][5],'F');
	
	public Reine ReineB1 = new Reine("Blanc",codes[7][4],'R');
	public Reine ReineN1 = new Reine("Noir",codes[0][4],'R');
	
	public Roi RoiB1 = new Roi("Blanc",codes[7][3],'K');
	public Roi RoiN1 = new Roi("Noir",codes[0][3],'K');
	
	// A choisir soit on enleve abstract de piece pour avoir le vide soit on garde la classe vide
	
	//private Vide vide = new Vide();
	private Piece vide = new Piece();
	
	private Piece[][] echiquier = 
		{
			{TourN1,CavalierN1,FouN1,RoiN1,ReineN1,FouN2,CavalierN2,TourN2},
			{pionN1,pionN2,pionN3,pionN4,pionN5,pionN6,pionN7,pionN8},
			{vide,vide,vide,vide,vide,vide,vide,vide},
			{vide,vide,vide,vide,vide,vide,vide,vide},
			{vide,vide,vide,vide,vide,vide,vide,vide},
			{vide,vide,vide,vide,vide,vide,vide,vide},
			{pionB1,pionB2,pionB3,pionB4,pionB5,pionB6,pionB7,pionB8},
			{TourB1,CavalierB1,FouB1,RoiB1,ReineB1,FouB2,CavalierB2,TourB2}
		};
	
	public Echiquier()
	{
		
	}
	
	
	
	public Piece[][] getEchiquier() {
		return echiquier;
	}



	public void setEchiquier(Piece[][] echiquier) {
		this.echiquier = echiquier;
	}



	public String toString()
	{
		String echec = "";
		for (int i = 0; i < 8;i++)
		{
			for (int j = 0; j < 8;j++)
			{
				echec += echiquier[i][j].getLettre();
			}
			echec += "\n";
		}
		return echec;
	}
	
	public void deplacer(int x1,int y1,int x2,int y2)
	{
		if (this.getEchiquier()[x2][y2] != vide && this.getEchiquier()[x2][y2].getCouleur() != this.getEchiquier()[x1][y1].getCouleur())
			System.out.println("Vous avez manger une piece adverse !");
		this.getEchiquier()[x2][y2] = this.getEchiquier()[x1][y1];
		this.getEchiquier()[x1][y1] = vide;
	}
}


