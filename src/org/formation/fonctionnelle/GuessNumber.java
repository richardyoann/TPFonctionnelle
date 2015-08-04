package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		// initialisation des variables
		int x;
		int cpt = 0;
		// création d'un chiffre aleatore entre 0 et 1000
		int nb1 = (int) (Math.random() * 1000);
		// initialisation du scanner
		@SuppressWarnings("resource")
		Scanner entree = new Scanner(System.in);
		System.out.println("Merci d'entree un chiffre entre 0 -- 1000");
		do {
			// saisi du nombre
			x = entree.nextInt();
			// test des limites
			if (x > 0 && x <= 1000) {
				// test si x est plus grand ou plus petit que nb1
				if (x > nb1)
					System.out.println("c'est moins");
				if (x < nb1)
					System.out.println("c'est plus");
			} else {
				System.out.println("Vous etes hors limite!, merci de saisir un chiffre entre 0 -- 1000");
			}
			// incrementation de cpt
			cpt++;
		} while (x != nb1);
		System.out.println("Bravo vous avez réussi en : " + cpt + " coups ");
	}
}
