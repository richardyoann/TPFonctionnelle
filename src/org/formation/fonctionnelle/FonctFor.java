package org.formation.fonctionnelle;

/**
 * @author Yoann RICHARD
 *
 */
public class FonctFor {
	public static final String VILLE ="Saint-Herblain";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Boucle affichant les chiffres 0 - 12 
		 */
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		/**
		 * Création tableau avec une serie de chiffre 
		 * Affichage des elements avec foreach
		 */
		int[] tab = {1,2,3,4,5,6,7,8,9,10,11,12};
		for (int i : tab) {
			System.out.println(i);
		}
		
		/**
		 * Affichage des elements avec for
		 */
		for (int i = 0; i < tab.length; i++) {
			System.out.println(i);
		}
		
		String[] listeVille =   {"Saint-Alban","Saint-Brieuc",VILLE,"Lamballe","Rennes", "Nantes","Paris"};
		for (int i = 0; i < listeVille.length; i++) {
			if(VILLE.equals(listeVille[i]))
				System.out.println( "c'est ma ville préférée : " + VILLE);
			else 
				System.out.println("C'est tres bien : " + listeVille[i]);
				
		}
		
				
	}

}
