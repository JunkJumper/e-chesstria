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
		if (e.estVide(p.getPosition()) == false) //si on mange une piece
		{
			if(!(p.getNom().equals("KN") || p.getNom().equals("KB"))) // si la pièce n'est pas un roi , on affiche le message
			{
				System.out.println("Vous avez mangé une pièce !");
			}
		}
		
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
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur())&& (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur())&& (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur())&& (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur())&& (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur())&& (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
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
						if((e.getEchiquier()[i][j].getCouleur() != this.getCouleur())&& (e.getEchiquier()[i][j].getCouleur() != "") ) //si la piece est de couleur adverse
						{
							if(e.getEchiquier()[i][j].metEnEchec(e,p) == true) //si la piece est en echec sur la 2eme coor
							{
								return false;
							}
						}
					}
				}
				return true;
			}
		}
		return false;
	}
	
}


