package piecesEchiquier;

public class Plateau {
	//attributs
	private Case[][] cases;
	
	//constructeur
	public Plateau() {
		this.cases= new Case[8][8];
	}
		
		//1
		this.cases[0][0] = new Case("A1",1,1);
		this.cases[1][0] = new Case("B1",2,1);
		this.cases[2][0] = new Case("C1",3,1);
		this.cases[3][0] = new Case("D1",4,1);
		this.cases[4][0] = new Case("E1",5,1);
		this.cases[5][0] = new Case("F1",6,1);
		this.cases[6][0] = new Case("G1",7,1);
		this.cases[7][0] = new Case("H1",8,1);

		//2
		this.cases[0][1] = new Case("A2",1,2);
		this.cases[1][1] = new Case("B2",2,2);
		this.cases[2][1] = new Case("C2",3,2);
		this.cases[3][1] = new Case("D2",4,2);
		this.cases[4][1] = new Case("E2",5,2);
		this.cases[5][1] = new Case("F2",6,2);
		this.cases[6][1] = new Case("G2",7,2);
		this.cases[7][1] = new Case("H2",8,2);
		
		//3
		this.cases[0][2] = new Case("A3",1,3);
		this.cases[1][2] = new Case("B3",2,3);
		this.cases[2][2] = new Case("C3",3,3);
		this.cases[3][2] = new Case("D3",4,3);
		this.cases[4][2] = new Case("E3",5,3);
		this.cases[5][2] = new Case("F3",6,3);
		this.cases[6][2] = new Case("G3",7,3);
		this.cases[7][2] = new Case("H3",8,3);
		
		//4
		this.cases[0][3] = new Case("A4",1,4);
		this.cases[1][3] = new Case("B4",2,4);
		this.cases[2][3] = new Case("C4",3,4);
		this.cases[3][3] = new Case("D4",4,4);
		this.cases[4][3] = new Case("E4",5,4);
		this.cases[5][3] = new Case("F4",6,4);
		this.cases[6][3] = new Case("G4",7,4);
		this.cases[7][3] = new Case("H4",8,4);
		
		//5
		this.cases[0][4] = new Case("A5",1,5);
		this.cases[1][4] = new Case("B5",2,5);
		this.cases[2][4] = new Case("C5",3,5);
		this.cases[3][4] = new Case("D5",4,5);
		this.cases[4][4] = new Case("E5",5,5);
		this.cases[5][4] = new Case("F5",6,5);
		this.cases[6][4] = new Case("G5",7,5);
		this.cases[7][4] = new Case("H5",8,5);
	
		//6
		this.cases[0][5] = new Case("A6",1,6);
		this.cases[1][5] = new Case("B6",2,6);
		this.cases[2][5] = new Case("C6",3,6);
		this.cases[3][5] = new Case("D6",4,6);
		this.cases[4][5] = new Case("E6",5,6);
		this.cases[5][5] = new Case("F6",6,6);
		this.cases[6][5] = new Case("G6",7,6);
		this.cases[7][5] = new Case("H6",8,6);
	
		//7
		this.cases[0][6] = new Case("A7",1,7);
		this.cases[1][6] = new Case("B7",2,7);
		this.cases[2][6] = new Case("C7",3,7);
		this.cases[3][6] = new Case("D7",4,7);
		this.cases[4][6] = new Case("E7",5,7);
		this.cases[5][6] = new Case("F7",6,7);
		this.cases[6][6] = new Case("G7",7,7);
		this.cases[7][6] = new Case("H7",8,7);
		
		//8
		this.cases[0][7] = new Case("A8",1,8);
		this.cases[1][7] = new Case("B8",2,8);
		this.cases[2][7] = new Case("C8",3,8);
		this.cases[3][7] = new Case("D8",4,8);
		this.cases[4][7] = new Case("E8",5,8);
		this.cases[5][7] = new Case("F8",6,8);
		this.cases[6][7] = new Case("G8",7,8);
		this.cases[7][7] = new Case("H8",8,8);
	}
	
	
	public void afficherPlateau() {
		for (int j = 7 ; j > -1 ; j--)  {
			System.out.print(j+1+" |");
			for (int i = 0 ; i < 8 ; i++){
				if(this.getCases()[i][j].getPieceCase() == null) {
					System.out.print("   |");
				}
				else {
					System.out.print(this.getCases()[i][j].getPieceCase().getNom()+"|");
				}
				
			}
			System.out.println();
			System.out.println("  +---+---+---+---+---+---+---+---+");
		}
		System.out.print("    A   B   C   D   E   F   G   H  ");
		System.out.println();
		}

	//place les points au commencement de la partie
	public void ajouterPions(Joueur J1, Joueur J2) {
		for (int x = 0; x<8;x++) 
		{
			cases[x][1].ajouterPion(J1);
			cases[x][6].ajouterPion(J2);

		}
		cases[0][0].ajouterTour(J1);
		cases[1][0].ajouterCavalier(J1);
		cases[2][0].ajouterFou(J1);
		cases[3][0].ajouterRoi(J1);
		cases[4][0].ajouterReine(J1);
		cases[5][0].ajouterFou(J1);
		cases[6][0].ajouterCavalier(J1);
		cases[7][0].ajouterTour(J1);
		
		cases[0][7].ajouterTour(J2);
		cases[1][7].ajouterCavalier(J2);
		cases[2][7].ajouterFou(J2);
		cases[3][7].ajouterReine(J2);
		cases[4][7].ajouterRoi(J2);
		cases[5][7].ajouterFou(J2);
		cases[6][7].ajouterCavalier(J2);
		cases[7][7].ajouterTour(J2);
	
	}
	
	//simplification pour bouger des pieces
	public static boolean move(Plateau p, Joueur J, String depart, String arrivee) {
		Case dep = Case.stringToCase(p, depart);
		if(dep == null) {
			System.err.println("Case Inexistante");
			return false;
		}
		int dX = dep.getcX();
		int dY = dep.getcY();
		return p.getCases()[dX-1][dY-1].getPieceCase().move(p,J,depart,arrivee);
	}
	
	//getters and setters
	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}
	
}
