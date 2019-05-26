package piecesEchiquier;
//voir equalsIgnoreCase
import joueurs.Joueur;

public class Echiquier {
	
	//ATTRIBUTS
	private String[][] codes = //pour définir quel code correspond a quel case
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

	//declaration de toutes les pieces de l'echiquier
	private Pion pionB1 = new Pion("Blanc","PB",new Position(1,2));
	private Pion pionB2 = new Pion("Blanc","PB",new Position(2,2));
	private Pion pionB3 = new Pion("Blanc","PB",new Position(3,2));
	private Pion pionB4 = new Pion("Blanc","PB",new Position(4,2));
	private Pion pionB5 = new Pion("Blanc","PB",new Position(5,2));
	private Pion pionB6 = new Pion("Blanc","PB",new Position(6,2));
	private Pion pionB7 = new Pion("Blanc","PB",new Position(7,2));
	private Pion pionB8 = new Pion("Blanc","PB",new Position(8,2));
	
	private Pion pionN1 = new Pion("Noir","PN",new Position(1,7));
	private Pion pionN2 = new Pion("Noir","PN",new Position(2,7));
	private Pion pionN3 = new Pion("Noir","PN",new Position(3,7));
	private Pion pionN4 = new Pion("Noir","PN",new Position(4,7));
	private Pion pionN5 = new Pion("Noir","PN",new Position(5,7));
	private Pion pionN6 = new Pion("Noir","PN",new Position(6,7));
	private Pion pionN7 = new Pion("Noir","PN",new Position(7,7));
	private Pion pionN8 = new Pion("Noir","PN",new Position(8,7));
	
	private Tour TourB1 = new Tour("Blanc","TB",new Position(1,1));
	private Tour TourB2 = new Tour("Blanc","TB",new Position(8,1));
	private Tour TourN1 = new Tour("Noir","TN",new Position(1,8));
	private Tour TourN2 = new Tour("Noir","TN",new Position(8,8));
	
	private Cavalier CavalierB1 = new Cavalier("Blanc","CB",new Position(2,1));
	private Cavalier CavalierB2 = new Cavalier("Blanc","CB",new Position(7,1));
	private Cavalier CavalierN1 = new Cavalier("Noir","CN",new Position(2,8));
	private Cavalier CavalierN2 = new Cavalier("Noir","CN",new Position(7,8));
	
	private Fou FouB1 = new Fou("Blanc","FB",new Position(3,1));
	private Fou FouB2 = new Fou("Blanc","FB",new Position(6,1));
	private Fou FouN1 = new Fou("Noir","FN",new Position(3,8));
	private Fou FouN2 = new Fou("Noir","FN",new Position(6,8));
	
	private Reine ReineB1 = new Reine("Blanc","QB",new Position(4,1));
	private Reine ReineN1 = new Reine("Noir","QN",new Position(4,8));
	
	private Roi RoiB1 = new Roi("Blanc","KB",new Position(5,1));
	private Roi RoiN1 = new Roi("Noir","KN",new Position(5,8));
	
	//remplissage de l'echiquier
	private Piece[][] echiquier = 
		{
			{TourN1,CavalierN1,FouN1,ReineN1,RoiN1,FouN2,CavalierN2,TourN2},
			{pionN1,pionN2,pionN3,pionN4,pionN5,pionN6,pionN7,pionN8},
			{new Piece(new Position(1,6)),new Piece(new Position(2,6)),new Piece(new Position(3,6)),new Piece(new Position(4,6)),new Piece(new Position(5,6)),new Piece(new Position(6,6)),new Piece(new Position(7,6)),new Piece(new Position(8,6))},
			{new Piece(new Position(1,5)),new Piece(new Position(2,5)),new Piece(new Position(3,5)),new Piece(new Position(4,5)),new Piece(new Position(5,5)),new Piece(new Position(6,5)),new Piece(new Position(7,5)),new Piece(new Position(8,5))},
			{new Piece(new Position(1,4)),new Piece(new Position(2,4)),new Piece(new Position(3,4)),new Piece(new Position(4,4)),new Piece(new Position(5,4)),new Piece(new Position(6,4)),new Piece(new Position(7,4)),new Piece(new Position(8,4))},
			{new Piece(new Position(1,3)),new Piece(new Position(2,3)),new Piece(new Position(3,3)),new Piece(new Position(4,3)),new Piece(new Position(5,3)),new Piece(new Position(6,3)),new Piece(new Position(7,3)),new Piece(new Position(8,3))},
			{pionB1,pionB2,pionB3,pionB4,pionB5,pionB6,pionB7,pionB8},
			{TourB1,CavalierB1,FouB1,ReineB1,RoiB1,FouB2,CavalierB2,TourB2}
		};
	
	//CONSTRUCTEURS
	public Echiquier() {
	
	}

	public String toString()	// FONCTION AFFICHAGE
	{
		char alphabet[]= {'A','B','C','D','E','F','G','H'};
		String echec = "";
		int compteur=8;
		for (int i = 0; i < 8;i++) //pour chaque ligne
		{
			echec+= compteur + " "; //afichage num ligne
			for (int j = 0; j < 8;j++) //pour chaque colonne
			{
				echec +=echiquier[i][j].getNom();
				echec += " ";
			}
			echec += "\n";
			compteur--;
		}
		for (int i=0; i<8;i++)
		{
			echec+= "  " + alphabet[i]; //affichage des lettres
		}
		return echec;
	}
	
	public boolean verificationMouvement(Joueur J, String A, String B)	// FONCTION TRADUCTION, VERIF + DEPLACEMENTS SI POSSIBLE
	{// String A = coordonées de A; String B = coordonées de B 
		B.toUpperCase();
		int i = -1;
		int j = -1;
		int k;
		int l;
		Position stock;
		Position stock2;
		
		/// TEST 1ERE SOURCE
		do {  							
			i++;
			j = -1;
			
			
			do {
				j++;
				if (getCodes()[i][j].equals(A))		//Si la coors entré est un code possible
				{
					if (this.getEchiquier()[i][j].getNom().equalsIgnoreCase("..")) // Verifie si la case choisie n'est pas vide
					{
						System.err.println("Vous avez choisi une case vide. Recommencez.");
						return false;
					}
					else if (this.getEchiquier()[i][j].getCouleur() != J.getCouleur()) // Verifie si la piece choisie n'est pas de la faction opposée
					{
						System.err.println("Le pion choisi n'est pas de votre faction. Recommencez !");
						return false;
					}	
				}
			}while(( (getCodes()[i][j].equalsIgnoreCase(A)) == false) && (j+1 < codes.length));
		}while((getCodes()[i][j].equalsIgnoreCase(A) == false) && (i+1 < codes.length));
		
		/// TEST 2EME DESTINATION
		for (k = 0; k < codes.length;k++)	
		{
			for (l = 0; l < codes.length;l++) 
			{
				if (getCodes()[k][l].equalsIgnoreCase(B) == true)
				{
					if (this.getEchiquier()[k][l].getCouleur() == J.getCouleur())  // Verifie si la  piece visée est de ta faction
					{
						System.err.println("Le pion que vous voulez manger est de votre faction. Recommencez !");
						return false;
					}
					
					if(this.getEchiquier()[i][j].getNom() == "KB" || this.getEchiquier()[i][j].getNom() == "KN") //test si le roi ne se colle pas à un autre roi
						{
							if (this.getEchiquier()[i][j].getNom() == "KB")
							{
								if(this.getEchiquier()[k][l+1].getNom() == "KN" || this.getEchiquier()[k+1][l+1].getNom()=="KN" 
										|| this.getEchiquier()[k-1][l+1].getNom()== "KN" || this.getEchiquier()[k-1][l].getNom()== "KN" || this.getEchiquier()[k+1][l].getNom()== "KN" 
										|| this.getEchiquier()[k-1][l-1].getNom()== "KN" || this.getEchiquier()[k][l-1].getNom()== "KN" || this.getEchiquier()[k+1][l-1].getNom()== "KN")
								{
									System.err.println("Le roi ne peut pas se coller à l'autre roi");
									return false;
								}
							}
							if (this.getEchiquier()[i][j].getNom() == "KN")
							{
								if(this.getEchiquier()[k][l+1].getNom() == "KB" || this.getEchiquier()[k+1][l+1].getNom()=="KB" 
										|| this.getEchiquier()[k-1][l+1].getNom()== "KB" || this.getEchiquier()[k-1][l].getNom()== "KB" || this.getEchiquier()[k+1][l].getNom()== "KB" 
										|| this.getEchiquier()[k-1][l-1].getNom()== "KB" || this.getEchiquier()[k][l-1].getNom()== "KB" || this.getEchiquier()[k+1][l-1].getNom()== "KB")
								{
									System.err.println("Le roi ne peut pas se coller à l'autre roi");
									return false;
								}
							}
						}
					 if (this.getEchiquier()[i][j].deplacable(this,this.getEchiquier()[k][l]) == false) // VERIFICATION AVEC FONCTION DEPLACABLE
					{
						System.err.println("Déplacement impossible. Recommencez ! \n");
						return false;
					}
					
					
					else //PARTIE DEPLACEMENT DE LA PIECE
					{
					System.out.println("Choix validé ! Déplacement en cours.");
					stock = new Position(l+1,8-k); //stockage de la pos destination
					stock2 = new Position(j+1,8-i); //stockage de la pos source 
					this.getEchiquier()[k][l] = this.getEchiquier()[i][j]; //deplacement de la piece
					this.getEchiquier()[k][l].setPosition(stock); //donner nouvelle position a la piece déplacer
					this.getEchiquier()[i][j] = new Piece(stock2); //mettre piece vide dans la pos source, car la case est maintenant vide
					int p; 
					int q; 
					Piece stockageRoi=null;				
					if( this.getEchiquier( )[k][l].getCouleur().equals("Blanc") ) {  
						for ( p=0; p < codes.length;p++)            //cherche le roi noir dans la matrice
						{
							for ( q=0; q < codes.length;q++)
							{
								if(this.getEchiquier()[p][q].getNom().equals("KN"))
								{
									stockageRoi=this.getEchiquier()[p][q];
								}
							}
						}
					}
					else
					{
						for ( p=0; p < codes.length;p++)    //cherche le roi blanc dans la matrice
						{
							for ( q=0; q < codes.length;q++)
							{
								if(this.getEchiquier()[p][q].getNom().equals("KB"))
								{
									stockageRoi=this.getEchiquier()[p][q];
								}
							}
						}
					}
					
						this.getEchiquier()[k][l].metEnEchec(this,stockageRoi); //Verifie si le roi sera en echec
						return true;
					}
				}
			}
		}
	System.err.println("Un de vos codes est faux. Recommencez.");			// si coors entré inexistante
	return false;
	}

	
	public boolean estVide(Position position) { //Voir si la piece dans la position indiqué est vide
		int x = position.getX();
		int y = position.getY();

		if(this.echiquier[8-y][x-1].getNom()=="..") 
		{
			return true;
		}
		return false;
	}


	//GETTESRS AND SETTERS
	public Piece[][] getEchiquier() {
		return echiquier;
	}


	public String[][] getCodes() {
		return codes;
	}
	
	//////////////////
	
	public Pion getPionB1() {
		return pionB1;
	}



	public void setPionB1(Pion pionB1) {
		this.pionB1 = pionB1;
	}



	public Pion getPionB2() {
		return pionB2;
	}



	public void setPionB2(Pion pionB2) {
		this.pionB2 = pionB2;
	}



	public Pion getPionB3() {
		return pionB3;
	}



	public void setPionB3(Pion pionB3) {
		this.pionB3 = pionB3;
	}



	public Pion getPionB4() {
		return pionB4;
	}



	public void setPionB4(Pion pionB4) {
		this.pionB4 = pionB4;
	}



	public Pion getPionB5() {
		return pionB5;
	}



	public void setPionB5(Pion pionB5) {
		this.pionB5 = pionB5;
	}



	public Pion getPionB6() {
		return pionB6;
	}



	public void setPionB6(Pion pionB6) {
		this.pionB6 = pionB6;
	}



	public Pion getPionB7() {
		return pionB7;
	}



	public void setPionB7(Pion pionB7) {
		this.pionB7 = pionB7;
	}



	public Pion getPionB8() {
		return pionB8;
	}



	public void setPionB8(Pion pionB8) {
		this.pionB8 = pionB8;
	}

	//////////////////

	public Pion getPionN1() {
		return pionN1;
	}



	public void setPionN1(Pion pionN1) {
		this.pionN1 = pionN1;
	}



	public Pion getPionN2() {
		return pionN2;
	}



	public void setPionN2(Pion pionN2) {
		this.pionN2 = pionN2;
	}



	public Pion getPionN3() {
		return pionN3;
	}



	public void setPionN3(Pion pionN3) {
		this.pionN3 = pionN3;
	}



	public Pion getPionN4() {
		return pionN4;
	}



	public void setPionN4(Pion pionN4) {
		this.pionN4 = pionN4;
	}



	public Pion getPionN5() {
		return pionN5;
	}



	public void setPionN5(Pion pionN5) {
		this.pionN5 = pionN5;
	}



	public Pion getPionN6() {
		return pionN6;
	}



	public void setPionN6(Pion pionN6) {
		this.pionN6 = pionN6;
	}



	public Pion getPionN7() {
		return pionN7;
	}



	public void setPionN7(Pion pionN7) {
		this.pionN7 = pionN7;
	}



	public Pion getPionN8() {
		return pionN8;
	}



	public void setPionN8(Pion pionN8) {
		this.pionN8 = pionN8;
	}



	public Tour getTourB1() {
		return TourB1;
	}



	public void setTourB1(Tour tourB1) {
		TourB1 = tourB1;
	}



	public Tour getTourB2() {
		return TourB2;
	}



	public void setTourB2(Tour tourB2) {
		TourB2 = tourB2;
	}



	public Tour getTourN1() {
		return TourN1;
	}



	public void setTourN1(Tour tourN1) {
		TourN1 = tourN1;
	}



	public Tour getTourN2() {
		return TourN2;
	}



	public void setTourN2(Tour tourN2) {
		TourN2 = tourN2;
	}



	public Cavalier getCavalierB1() {
		return CavalierB1;
	}



	public void setCavalierB1(Cavalier cavalierB1) {
		CavalierB1 = cavalierB1;
	}



	public Cavalier getCavalierB2() {
		return CavalierB2;
	}



	public void setCavalierB2(Cavalier cavalierB2) {
		CavalierB2 = cavalierB2;
	}



	public Cavalier getCavalierN1() {
		return CavalierN1;
	}



	public void setCavalierN1(Cavalier cavalierN1) {
		CavalierN1 = cavalierN1;
	}



	public Cavalier getCavalierN2() {
		return CavalierN2;
	}



	public void setCavalierN2(Cavalier cavalierN2) {
		CavalierN2 = cavalierN2;
	}



	public Fou getFouB1() {
		return FouB1;
	}



	public void setFouB1(Fou fouB1) {
		FouB1 = fouB1;
	}



	public Fou getFouB2() {
		return FouB2;
	}



	public void setFouB2(Fou fouB2) {
		FouB2 = fouB2;
	}



	public Fou getFouN1() {
		return FouN1;
	}



	public void setFouN1(Fou fouN1) {
		FouN1 = fouN1;
	}



	public Fou getFouN2() {
		return FouN2;
	}



	public void setFouN2(Fou fouN2) {
		FouN2 = fouN2;
	}



	public Reine getReineB1() {
		return ReineB1;
	}



	public void setReineB1(Reine reineB1) {
		ReineB1 = reineB1;
	}



	public Reine getReineN1() {
		return ReineN1;
	}



	public void setReineN1(Reine reineN1) {
		ReineN1 = reineN1;
	}



	public Roi getRoiB1() {
		return RoiB1;
	}



	public void setRoiB1(Roi roiB1) {
		RoiB1 = roiB1;
	}



	public Roi getRoiN1() {
		return RoiN1;
	}



	public void setRoiN1(Roi roiN1) {
		RoiN1 = roiN1;
	}



	public void setCodes(String[][] codes) {
		this.codes = codes;
	}



	public void setEchiquier(Piece[][] echiquier) {
		this.echiquier = echiquier;
	}
}
