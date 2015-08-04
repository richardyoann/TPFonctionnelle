package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean trouve = false;
		int[] tabInt1 = {32, 87, 3, 589};
		int[] tabInt2 = {12, 1076, 2000, 8};
		int[] tabInt3 = {622, 127, 77, 955};
		int[][] tabInt4 = {tabInt1,tabInt2,tabInt3};
		// Création du scanner 
		Scanner entree =   new Scanner(System.in);
		System.out.println("Merci d'inscrire un nombre  : ");
		int x = entree.nextInt();
		// Création de la boucle avec un label
		// On boucle sur la ligne 
		search:for (int i = 0; i < tabInt4.length; i++) {
			// On boucle sur les colonnes du tableau en cours  
			for (int j = 0; j < tabInt4[i].length; j++) {
				// On test si la valeur en cours est egal à la valeur saisie
				if (tabInt4[i][j] == x)
				{
					System.out.println("Vous avez trouvé un chiffre du tableau ");	
					trouve=true;
					//si trouvé on quitte la boucle nommée search
					break search;
				}				
			}
		}
		if (!trouve)
			 System.out.println("cette valeur n'existe pas");		
	}

}
