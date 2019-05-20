package piecesEchiquier;

public class Pion extends Piece {
	private boolean verif=false;
	
	public Pion(String couleur,String l, Position pos) {
		
		super(couleur,l, pos);
		super.setIni(pos);
		
	}
	
	public boolean deplacable(Echiquier e, Piece p)   // CHECK QUE PION PEUT ETRE DEPLACE
	{
		if (p.getPosition().getX()-1 == this.getPosition().getX() || p.getPosition().getX()+1 == this.getPosition().getX())		//vERIFICATION SI LA PERSONNE SOUHAITE MANGER LA PIECE
		{
			if ((this.getCouleur().equals("Blanc") && p.getPosition().getY()-1 == this.getPosition().getY()) || (this.getCouleur() == "noir" && p.getPosition().getY()+1 == this.getPosition().getY()))
			{
				if (p.getNom().equals(".."))
				{
					System.err.println("Vous tentez de manger une case vide.");
					return false;
				}

				System.out.println("Vous avez mangé une pièce !");
				return true;
			}	
		}
		
		
		// Avancer tout droit
		else if (p.getPosition().getX() == this.getPosition().getX())
		{
			if (!(p.getNom().equals(".."))) // SI case non vide
			{
				System.err.println("Vous ne pouvez pas manger en avancant tout droit.");
				return false;
			}
			if ( ((this.getCouleur().equals("Blanc")) && (p.getPosition().getY()-1 == this.getPosition().getY()) ) || ((this.getCouleur().equals("Noir")) && (p.getPosition().getY()+1 == this.getPosition().getY())))
			{
				return true;
			}

			if ( (this.aBouge() == false && (this.getCouleur().equals("Blanc") && p.getPosition().getY()-2 == this.getPosition().getY()) )
					|| (this.getCouleur().equals("Noir") && p.getPosition().getY()+2 == this.getPosition().getY()) )
			{
				return true;	
			}
		}
		return false;
	}
	
	public boolean aBouge()
	{
		if(this.getIni() != this.getPosition())
		{
			verif=true;
		}
		else if(this.getIni() == this.getPosition())
		{
			verif=false;
		}
		return verif;
	}

}
