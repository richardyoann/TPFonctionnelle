package org.formation.fonctionnelle;

public class Fonct1 {

	public static void main(String[] args) {
		final  double p = 3.14159;
		System.out.println("Merci de saisir x");		
		@SuppressWarnings("resource")
		java.util.Scanner entree =   new java.util.Scanner(System.in);
		int x, y, a;
		x = entree.nextInt();		
		System.out.println("Le rayon :"+x* p);		
		System.out.println("Merci de saisir rayon du cylindre");		
		y = entree.nextInt();
		System.out.println("Merci de saisir la longueur du cylindre");		
		a = entree.nextInt();		
		System.out.println("Le volume du cylindre :" + y* a );
		
	}

}
