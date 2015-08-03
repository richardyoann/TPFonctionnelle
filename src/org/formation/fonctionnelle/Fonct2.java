package org.formation.fonctionnelle;

public class Fonct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		java.util.Scanner entree =   new java.util.Scanner(System.in);
		System.out.println("Merci de saisir soit 1 ou 0 ");
		int x ,y;			
		x = entree.nextInt();				
		y =  (int) (Math.random()*2);
		if (x==y)System.out.println("Gagné");		
		else System.out.println("Perdu");		
	}
}
