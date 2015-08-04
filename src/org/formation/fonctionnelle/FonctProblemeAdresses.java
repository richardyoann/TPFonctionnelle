package org.formation.fonctionnelle;
import java.util.Arrays;
public class FonctProblemeAdresses {
	public static void main(String[] args) {
		int cpt = 0;
		String[] tableauMail = new String[10];
		String[] listeFournisseurs = new String[tableauMail.length];			
		tableauMail[0] = "bob@sfr.fr";
		tableauMail[1] = "bob@gmail.com";
		tableauMail[2] = "bob@hotmail.fr";
		tableauMail[3] = "bob@hotmail.fr";
		tableauMail[4] = "bob@free.fr";
		tableauMail[5] = "bob@orange.fr";
		tableauMail[6] = "bob@gmail.com";
		tableauMail[7] = "bob@gmail.com";
		tableauMail[8] = "bob@fifi.fr";
		tableauMail[9] = "bob@momo.fr";
		// traitement des fournisseurs
		for (String adresse : tableauMail) {
			listeFournisseurs[cpt] = operateur(adresse);
			cpt++;
		}

		// Tri listeFournisseurs		
		Arrays.sort(listeFournisseurs);
		//Affichage des parts de marche
		for (int i = 0; i < listeFournisseurs.length-1; i++) {
			
			if (!listeFournisseurs[i].equals(listeFournisseurs[i+1]))
				System.out.println(listeFournisseurs[i] + " posséde : " + partMarche(listeFournisseurs[i], listeFournisseurs) * 10
						+ "% de part de marché");
		}		
		
	}
	/**
	 * Methode pour recuperer le fournisseur
	 * @param  text
	 * @return String
	 */
	public static String operateur(String text) {
		return text.substring(text.indexOf("@") + 1);
	}
	/**
	 * Calcul les parts de marche de chaque fournisseur
	 * @param  text
	 * @param  t 
	 * @return int
	 */
	public static int partMarche(String text, String[] t) {
		int cpt = 0;
		for (String string : t) {
			if (text.equals(string)) {
				cpt++;
			}
		}
		return cpt;
	}
}
