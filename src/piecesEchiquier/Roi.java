package piecesEchiquier;

//import joueurs.Joueur;

public class Roi extends Piece {
	private boolean verif=false;
	
	public Roi(String c,String l, Position pos)
	{
		super(c,l,pos);
	}

	// verifie si le roi a bougé de sa place initiale NE SERT PAS POUR ROI 
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
	
	public boolean deplacable(Echiquier e, Piece p) // vérifie que le roi peut être déplacé
	{
		
		//Côté droit
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut et x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						
						
						
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
						
						
						
						
					}
				}
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY())) //Verifie deplacement x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()+1) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas et x+1 vers la droite
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		//Coté haut
		if((p.getPosition().getX()) == (this.getPosition().getX()) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		//Côté bas
		if((p.getPosition().getX()) == (this.getPosition().getX()) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		//Côté gauche
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY()+1)) //Verifie deplacement y+1 vers le haut et x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY())) //Verifie deplacement x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		
		if((p.getPosition().getX()) == (this.getPosition().getX()-1) && (p.getPosition().getY()) == (this.getPosition().getY()-1)) //Verifie deplacement y-1 vers le bas et x-1 vers la gauche
		{
			if(p.getCouleur()!=this.getCouleur()) //roi couleur différente de la pièce
			{
				for (int i=0; i<8;i++) // parcours de la matrice
				{
					for (int j=0; j<8;j++)
					{
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur()) && (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Roi(this.getCouleur(),this.getNom(),new Position(p.getPosition().getX(),p.getPosition().getY()));
							if(e.getEchiquier()[i][j].metEnEchec(e,e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1]) == true) //si la piece est en echec sur la 2eme coor
							{
								e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
								return false;
							}
							e.getEchiquier()[8-p.getPosition().getY()][p.getPosition().getX()-1] = new Piece(new Position(p.getPosition().getX(),p.getPosition().getY()));
						}
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean enEchecEtMat(Echiquier e, Piece p)
	{
		if ( !((8-(p.getPosition().getY()+1 ) )<0 || 8-(p.getPosition().getY()-1 )>7 || (p.getPosition().getX()-2 )<0 || (p.getPosition().getX() )>7)) //verifie que le roi n'est pas dans un coin
		{
			if (this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1]) == false      //HAUT verifie que si le roi ne peut pas de deplacer autour de lui
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1]) ==false // BAS 
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()]) == false // HAUT DROITE
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) == false // DROITE
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()]) == false // BAS DROITE
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2]) == false // HAUT GAUCHE
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == false // GAUCHE
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2]) == false) // BAS GAUCHE
			{
				return true;
			}
		}
	if (this.getPosition().getX() == 5 && this.getPosition().getY() == 8 && e.getEchiquier()[0][4].getNom().equals("KN"))
	{
	if(!(e.getEchiquier()[0][4].getNom().equals("KN") && p.aBouge()==false) || ( e.getEchiquier()[0][4].getNom().equals("KN") && (
			e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1].getNom().equals("..") || 
			e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()].getNom().equals("..")  ||
			e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()].getNom().equals("..") ||
			e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2].getNom().equals("..") ||
			e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2].getNom().equals("..") 
			))
			)
	
		{
			if ( (8-(p.getPosition().getY()+1 ) )<0 ) //traite le cas où le roi se trouve sur la bordure du haut de l'échiquier
			{
				if (this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == false      // gauche  verifie si le roi ne peut pas de deplacer autour de lui
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) ==false //droite
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1]) == false // bas
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2]) == false // bas gauche
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()]) == false)	// bas droite
				{
					return true;
				}
			}
		}	
	}
	/*
	if (this.getPosition().getX() == 5 && this.getPosition().getY() == 1 && e.getEchiquier()[7][4].getNom().equals("KB"))
	{
	if(!(e.getEchiquier()[7][4].getNom() == "KB" && p.aBouge()==false) ||  (e.getEchiquier()[0][4].getNom().equals("KB") && (
			e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1].getNom().equals("..") || // HAUT
			
			))
	)
		
		
		
	{
		if ( 8-(p.getPosition().getY()-1 )>7) //traite le cas où le roi se trouve sur la bordure du bas de l'échiquier
			{
				if (this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == false      // gauche  verifie si le roi ne peut pas de deplacer autour de lui
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) ==false // droite
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1]) == false // haut 
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2]) == false // haut gauche
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()]) == false)	// haut droite
				{
					return true;
				}	
			}
	}
	}*/
		if ( (p.getPosition().getX()-2)<0) //traite le cas où le roi se trouve sur la bordure gauche de l'échiquier
		{
			if (this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1]) == false      //haut  verifie si le roi ne peut pas de deplacer autour de lui
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1]) ==false // bas
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) == false // droite
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()]) == false //haut droite
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()]) == false)	//bas droite
			{
				return true;
			}	
		}
		if ( (p.getPosition().getX())>7) //traite le cas où le roi se trouve sur la bordure droite de l'échiquier
		{
			if (this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1]) == false      //haut   verifie si le roi ne peut pas de deplacer autour de lui
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1]) ==false //bas
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == false //gauche
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2]) == false //bas gauche
					&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2]) == false) //haut gauche	
			{
				return true;
			}	
		}
			return false;
	}
	
}


