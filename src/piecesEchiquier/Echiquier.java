package piecesEchiquier;

public class Echiquier {
	
	private String[][] codes = 
    {
{"A8","B8","C8","D8","E8","F8","G8","H8"},
{"A7","B7","C7","D7","E7","F7","G7","H7"},
{"A6","B6","C6","D6","E6","F6","G6","H6"},
{"A5","B5","C5","D5","E5","F5","G5","H5"},
{"A4","B4","C4","D4","E4","F4","G4","H4"},
{"A3","B3","C3","D3","E3","F3","G3","H3"},
{"A2","B2","C2","D2","E2","F2","G2","H2"},
{"A1","B1","C1","D1","E1","F1","G1","H1"}
};
//a refaire
	public Pion pionB1 = new Pion(true, 'P', 6, 0);
	public Pion pionB2 = new Pion(true, 'P', 6, 1);
	public Pion pionB3 = new Pion(true, 'P', 6, 2);
	public Pion pionB4 = new Pion(true, 'P', 6, 3);
	public Pion pionB5 = new Pion(true, 'P', 6, 4);
	public Pion pionB6 = new Pion(true, 'P', 6, 5);
	public Pion pionB7 = new Pion(true, 'P', 6, 6);
	public Pion pionB8 = new Pion(true, 'P', 6, 7);
	
	public Pion pionN1 = new Pion(false, 'P', 1, 0);
	public Pion pionN2 = new Pion(false, 'P', 1, 1);
	public Pion pionN3 = new Pion(false, 'P', 1, 2);
	public Pion pionN4 = new Pion(false, 'P', 1, 3);
	public Pion pionN5 = new Pion(false, 'P', 1, 4);
	public Pion pionN6 = new Pion(false, 'P', 1, 5);
	public Pion pionN7 = new Pion(false, 'P', 1, 6);
	public Pion pionN8 = new Pion(false, 'P', 1, 7);
	
	public Tour TourB1 = new Tour(true, 'T', 7, 0);
	public Tour TourB2 = new Tour(true, 'T', 7, 7);
	public Tour TourN1 = new Tour(false, 'T', 0, 0);
	public Tour TourN2 = new Tour(false, 'T', 0, 7);
	
	public Cavalier CavalierB1 = new Cavalier(true, 'C', 7, 1);
	public Cavalier CavalierB2 = new Cavalier(true, 'C', 7, 6);
	public Cavalier CavalierN1 = new Cavalier(false, 'C', 0, 1);
	public Cavalier CavalierN2 = new Cavalier(false, 'C', 0, 6);
	
	public Fou FouB1 = new Fou(true ,'F' , 7, 2);
	public Fou FouB2 = new Fou(true ,'F' , 7, 5);
	public Fou FouN1 = new Fou(false ,'F' , 0, 2);
	public Fou FouN2 = new Fou(false ,'F' , 0, 5);
	
	public Reine ReineB1 = new Reine(true ,'R' , 7, 4);
	public Reine ReineN1 = new Reine(false ,'R' , 0, 4);
	
	public Roi RoiB1 = new Roi(true ,'K' , 7, 3);
	public Roi RoiN1 = new Roi(false ,'K' , 0, 3);
	
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


