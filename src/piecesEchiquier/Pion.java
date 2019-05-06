package piecesEchiquier;

public class Pion extends Piece {
	private boolean verif=false;
	
	public Pion(String couleur,String l, Position pos) {
		
		super(couleur,l, pos);
		super.setIni(pos);
		
	}
	
	public boolean deplacable(Piece p)
	{
		if (p.getPosition().getX()-1 == this.getPosition().getX() || p.getPosition().getX()+1 == this.getPosition().getX())
		{
			//System.out.println("test4");
			if ((this.getCouleur().equals("Blanc") && p.getPosition().getY()-1 == this.getPosition().getY()) || (this.getCouleur() == "noir" && p.getPosition().getY()+1 == this.getPosition().getY()))
			{
				//System.out.println("test5");
				if (p.getLettre().equals(".."))
				{
					System.out.println("Vous tentez de manger une case vide.");
					return false;
				}
				System.out.println("Vous avez mangé une pièce !");
				return true;
			}
			
		}			
		
		else if (p.getPosition().getX() == this.getPosition().getX())
		{
			
			if ((this.getCouleur().equals("Blanc")) && (p.getPosition().getY()-1 == this.getPosition().getY()) || (this.getCouleur().equals("Noir")) && (p.getPosition().getY()+1 == this.getPosition().getY()))
			{
				//System.out.println("test1");
				return true;
			}
			/*
			else if ((this.getCouleur().equals("Noir")) && (p.getPosition().getY()+1 == this.getPosition().getY()))
			{
				return true;
			} */
			if (this.aBouge() == false && ((this.getCouleur().equals("Blanc") && p.getPosition().getY()-2 == this.getPosition().getY()) || (this.getCouleur().equals("Noir") && p.getPosition().getY()+2 == this.getPosition().getY())))
			{
				System.out.println("test2");
				return true;	
			}
		}
		System.out.println("test1");
		return false;
	}
	
	public boolean aBouge()
	{
		if(this.getIni() != this.getPosition())
		{
			verif=true;
		}
		else if(this.getIni() == this.getPosition() && this.verif == false)
		{
			verif=false;
		}
		return verif;
	}

}
