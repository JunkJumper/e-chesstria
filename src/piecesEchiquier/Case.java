package echec;

public class Case {
	//attribut
		private String NomCase;
		private int posXCase;
		private int posYCase;
		private Piece pieceCase;
		
		//constructeur
		public Case(String name, int x, int y) {
			this.NomCase=name;
			this.posXCase=x;
			this.posYCase=y;
		}
		
		//méthodes
		public boolean estVide() {
			return pieceCase == null;
		}
		
		//piecesInstantiation
		
		public void pieceClone(Case clone) {
			clone.setPieceCase(this.getPieceCase());
		}
		
		public void ajouterPion(Joueur j) {
			this.pieceCase = new Pion("Pi"+j.getNom().charAt(0), j);
		}
		
		public void ajouterTour(Joueur j) {
			this.pieceCase = new Tour("To"+j.getNom().charAt(0), j);
		}
		
		public void ajouterCavalier(Joueur j) {
			this.pieceCase = new Cavalier("Ca"+j.getNom().charAt(0), j);
		}
		
		public void ajouterFou(Joueur j) {
			this.pieceCase = new Fou("Fo"+j.getNom().charAt(0), j);
		}
		
		public void ajouterReine(Joueur j) {
			this.pieceCase = new Reine("Re"+j.getNom().charAt(0), j);
		}
		
		public void ajouterRoi(Joueur j) {
			this.pieceCase = new Roi("Ro"+j.getNom().charAt(0), j);
		}
		
		public void vider() {
			this.pieceCase = null;
		}
		
		public int stringToX(Plateau p, String cas) {
			for (Case[] cl : p.getCases()) {
				for (Case c : cl) {
					if(c.getcNom()== cas) {
						return c.getcX();
					}
				}
			}
			return -1;
		}
		
		public int stringToY(Plateau p, String cas) {
			for (Case[] cl : p.getCases()) {
				for (Case c : cl) {
					if(c.getcNom()== cas) {
						return c.getcY();
					}
				}
			}
			return -1;
		}
		
		public static Case stringToCase(Plateau p, String cas) {
			for (Case[] cl : p.getCases()) {
				for (Case c : cl) {
					if(c.getcNom().equals(cas)) {
						return c;
					}
				}
			}
			return null;
		}

		@Override
		public String toString() {
			return "Case [cNom=" + cNom + ", cX=" + cX + ", cY=" + cY + ", pieceCase=" + pieceCase + "]";
		}

	}
