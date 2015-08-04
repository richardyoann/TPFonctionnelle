package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabInt = {32, 87, 3, 589,12, 1076, 2000,8, 622, 127};
		@SuppressWarnings("resource")
		Scanner entree =   new Scanner(System.in);
		System.out.println("Merci d'inscrire un nombre  : ");
		int x = entree.nextInt();	
		boolean trouve = false;
		for (int i : tabInt) {
			if (x == i)
			{
				System.out.println("Vous avez trouvé un chiffre du tableau ");
				trouve=true;
				break;
			}			
		}
		if (!trouve)
			 System.out.println("cette valeur n'existe pas");		
	}
}
