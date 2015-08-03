package org.formation.fonctionnelle;

public class GradeEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Merci de saisir une note entre 0 et 100");		
		@SuppressWarnings("resource")
		java.util.Scanner entree =   new java.util.Scanner(System.in);
		int x= entree.nextInt();				
		if (x<63)
		{
			System.out.println("Vous avez un F");
		}
		else if (x>89)
		{
			System.out.println("Vous avez un A");
		}
		else if (x>79)
			System.out.println("Vous avez un B");
			else System.out.println("Vous avez un C");
	}

}
