package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	Random ab = new Random();
	
	
	
			
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druite " + nom + " et ma potion peut aller d'une force " + 
		    effetPotionMin + " � " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		forcePotion=ab.nextInt(effetPotionMax);
		if (forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force :" + forcePotion);
		} else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force");
			System.out.println(forcePotion);

		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
	
	

}
