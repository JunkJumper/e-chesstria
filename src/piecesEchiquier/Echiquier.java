package piecesEchiquier;

import joueurs.Joueur;

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
	private Pion pionB1 = new Pion("Blanc",codes[6][0],'P',new Position(1,2));
	private Pion pionB2 = new Pion("Blanc",codes[6][1],'P',new Position(2,2));
	private Pion pionB3 = new Pion("Blanc",codes[6][2],'P',new Position(3,2));
	private Pion pionB4 = new Pion("Blanc",codes[6][3],'P',new Position(4,2));
	private Pion pionB5 = new Pion("Blanc",codes[6][4],'P',new Position(5,2));
	private Pion pionB6 = new Pion("Blanc",codes[6][5],'P',new Position(6,2));
	private Pion pionB7 = new Pion("Blanc",codes[6][6],'P',new Position(7,2));
	private Pion pionB8 = new Pion("Blanc",codes[6][7],'P',new Position(8,2));
	
	private Pion pionN1 = new Pion("Noir",codes[1][0],'p',new Position(1,7));
	private Pion pionN2 = new Pion("Noir",codes[1][1],'p',new Position(2,7));
	private Pion pionN3 = new Pion("Noir",codes[1][2],'p',new Position(3,7));
	private Pion pionN4 = new Pion("Noir",codes[1][3],'p',new Position(4,7));
	private Pion pionN5 = new Pion("Noir",codes[1][4],'p',new Position(5,7));
	private Pion pionN6 = new Pion("Noir",codes[1][5],'p',new Position(6,7));
	private Pion pionN7 = new Pion("Noir",codes[1][6],'p',new Position(7,7));
	private Pion pionN8 = new Pion("Noir",codes[1][7],'p',new Position(8,7));
	
	private Tour TourB1 = new Tour("Blanc",codes[7][0],'T',new Position(1,1));
	private Tour TourB2 = new Tour("Blanc",codes[7][7],'T',new Position(8,1));
	private Tour TourN1 = new Tour("Noir",codes[0][0],'t',new Position(1,8));
	private Tour TourN2 = new Tour("Noir",codes[0][7],'t',new Position(8,8));
	
	private Cavalier CavalierB1 = new Cavalier("Blanc",codes[7][1],'C',new Position(2,1));
	private Cavalier CavalierB2 = new Cavalier("Blanc",codes[7][6],'C',new Position(7,1));
	private Cavalier CavalierN1 = new Cavalier("Noir",codes[0][1],'c',new Position(2,8));
	private Cavalier CavalierN2 = new Cavalier("Noir",codes[0][6],'c',new Position(7,8));
	
	private Fou FouB1 = new Fou("Blanc",codes[7][2],'F',new Position(3,1));
	private Fou FouB2 = new Fou("Blanc",codes[7][5],'F',new Position(6,1));
	private Fou FouN1 = new Fou("Noir",codes[0][2],'f',new Position(3,8));
	private Fou FouN2 = new Fou("Noir",codes[0][5],'f',new Position(6,8));
	
	private Reine ReineB1 = new Reine("Blanc",codes[7][4],'R',new Position(4,1));
	private Reine ReineN1 = new Reine("Noir",codes[0][4],'r',new Position(4,8));
	
	private Roi RoiB1 = new Roi("Blanc",codes[7][3],'K',new Position(5,1));
	private Roi RoiN1 = new Roi("Noir",codes[0][3],'k',new Position(5,8));
	
	// A choisir soit on enleve abstract de piece pour avoir le vide soit on garde la classe vide
	//private Vide vide = new Vide();
	//private Piece vide = new Piece();
	
	private Piece[][] echiquier = 
		{
			{TourN1,CavalierN1,FouN1,RoiN1,ReineN1,FouN2,CavalierN2,TourN2},
			{pionN1,pionN2,pionN3,pionN4,pionN5,pionN6,pionN7,pionN8},
			{new Piece(new Position(1,6)),new Piece(new Position(2,6)),new Piece(new Position(3,6)),new Piece(new Position(4,6)),new Piece(new Position(5,6)),new Piece(new Position(6,6)),new Piece(new Position(7,6)),new Piece(new Position(8,6))},
			{new Piece(new Position(1,5)),new Piece(new Position(2,5)),new Piece(new Position(3,5)),new Piece(new Position(4,5)),new Piece(new Position(5,5)),new Piece(new Position(6,5)),new Piece(new Position(7,5)),new Piece(new Position(8,5))},
			{new Piece(new Position(1,4)),new Piece(new Position(2,4)),new Piece(new Position(3,4)),new Piece(new Position(4,4)),new Piece(new Position(5,4)),new Piece(new Position(6,4)),new Piece(new Position(7,4)),new Piece(new Position(8,4))},
			{new Piece(new Position(1,3)),new Piece(new Position(2,3)),new Piece(new Position(3,3)),new Piece(new Position(4,3)),new Piece(new Position(5,3)),new Piece(new Position(6,3)),new Piece(new Position(7,3)),new Piece(new Position(8,3))},
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


	public String[][] getCodes() {
		return codes;
	}



	public String toString()
	{
		String echec = "";
		for (int i = 0; i < 8;i++)
		{
			
			for (int j = 0; j < 8;j++)
			{
				echec +=echiquier[i][j].getLettre();
			}
			echec += "\n";
		}
		return echec;
	}
	
	public boolean VerifFinale(Joueur J, String A, String B)
	{
		int i = -1;
		int j = -1;
		int k;
		int l;
		
		do {
			i++;
			j = -1;
			do {
				j++;
				if (getCodes()[i][j].equals(A))
				{
					if (this.getEchiquier()[i][j].getClass().getName().equals("Piece"))
					{
						System.out.println("Vous avez choisi une case vide. Recommencez.");
						return false;
					}
					else if (this.getEchiquier()[i][j].getCouleur() != J.getCouleur())
					{
						System.out.println("Le pion choisi n'est pas de votre faction. Recommencez.");
						return false;
					}	
				}
				
			}while(( (getCodes()[i][j].equals(A)) == false) && (j+1 < codes.length));
			
		}while((getCodes()[i][j].equals(A) == false) && (i+1 < codes.length));
		if (i == 9)
		{
			System.out.println("Code de la pièce a déplacer invalide. Recommencez.");
			return false;
		}
	
	
			
	
		for (k = 0; k < codes.length;k++)
		{
			for (l = 0; l < codes.length;l++) {
				if (getCodes()[k][l].equals(B) == true)
				{
					if (this.getEchiquier()[k][l].getCouleur() == J.getCouleur())
					{
						System.out.println("Le pion que vous voulez manger est de votre faction. Recommencez.");
						return false;
					}else if (this.getEchiquier()[i][j].deplacable(this.getEchiquier()[k][l]) == false)
					{
						System.out.println("Déplacement impossible. Recommencez.");
						return false;
					}else
					{
					System.out.println("Choix validés. Déplacement en cours.");
					this.getEchiquier()[k][l] = this.getEchiquier()[i][j];
					this.getEchiquier()[i][j] = new Piece(new Position(i,j));
					return true;
					}
					
				}
			}
		}
	System.out.println("Un de vos codes est faux. Recommencez.");
	return false;
	}		
}
