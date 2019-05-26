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
		
		if (p.getNom().equals("KN"))
		{
			
			if (e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2].getCouleur() == "Noir" && //gauche
					e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()].getCouleur() == "Noir" && //droite
					e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1].getCouleur() == "Noir" && //bas 
					e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2].getCouleur() == "Noir" && //bas gauche
					e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()].getCouleur() == "Noir" // bas droite 
					)
				{
					return false;
				}
			if(!(p.getPosition().getX()>7 ||p.getPosition().getY()>7 ||p.getPosition().getX()<0
					||p.getPosition().getY()<0))//verifie que ca va pas chercher une case vide si elle est en dehors de la matrice
			{
			if( p.aBouge()==false && 
					(e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == true)      // gauche  verifie si le roi ne peut pas de deplacer autour de lui
					|| (e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) == true )  //droite
					|| (e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-1]) == true) // bas
					|| (e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()-2]) == true) // bas gauche
					|| (e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()-1)][p.getPosition().getX()]) == true) // bas droite
					)
			{
				return false;
			} else
				return true;
		}
		}
	
		if(p.getNom() == "KN" && p.aBouge()==true)
		{
			if ( (8-(p.getPosition().getY()+1 ) )<0) //traite le cas où le roi se trouve sur la bordure du haut de l'échiquier
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
		
		if (p.getNom().equals("KB"))
		{
			if (e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2].getCouleur() == "Blanc" && //gauche
					e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()].getCouleur() == "Blanc" && //droite
					e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1].getCouleur() == "Blanc" && //haut 
					e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2].getCouleur() == "Blanc" && //haut gauche
					e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()].getCouleur() == "Blanc" // haut droite 
					)
				{
					return false;
				}
			if(!(p.getPosition().getX()>7 ||p.getPosition().getY()>7 ||p.getPosition().getX()<0
					||p.getPosition().getY()<0)) //verifie que ca va pas chercher une case vide si elle est en dehors de la matrice
			{
				if ( p.aBouge()==false && 
				
					(e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == true)      // gauche  verifie si le roi ne peut pas de deplacer autour de lui
					|| (e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) == true )  //droite
					|| (e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1]) == true) // haut
					|| (e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2]) == true) // haut gauche
					|| (e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()].getNom().equals("..") && this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()]) == true) // haut droite
					)
			{
				return false;
			} 
			}
			else
				return true;
		}
	
		if(p.getNom() == "KB" && p.aBouge()==true)
		{
			if ( (8-(p.getPosition().getY()+1 ) )<0) //traite le cas où le roi se trouve sur la bordure du haut de l'échiquier
			{
				if (this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()-2]) == false      // gauche  verifie si le roi ne peut pas de deplacer autour de lui
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY())][p.getPosition().getX()]) ==false //droite
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-1]) == false // haut
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()-2]) == false // haut gauche
						&& this.deplacable(e, e.getEchiquier()[8-(p.getPosition().getY()+1)][p.getPosition().getX()]) == false)	// haut droite
				{
					return true;
				}
			}
		}

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


