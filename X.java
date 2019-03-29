public class X {
	private String nom;
	private String prenom;


	public X() {
		this.nom = null;
		this.preom = null;
	}

	public X(String s1, String s2) {
		this.nom = s1;
		this.prenom = s2;
	}

	public getNom() {
		return this.nom;
	}

	public getPrenom() {
		return this.prenom;
	}

	public setNom(String s) {
		this.nom = s;
	}

	public setPrenom(Sting s) {
		this.prenom = s;
	}

	@Override
	public String toString() {
		return "La personne s'appelle " + this.prenom + " " + this.nom;
	}
}
