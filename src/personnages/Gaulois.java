package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public int getEffetPotion() {
		return effetPotion;
	}

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		
	}
	
	public void parler(String texte) {
		prendreParole();
	}
	public void parler(String texte) {
		String parole = prendreParole();
		
	}
	

}
