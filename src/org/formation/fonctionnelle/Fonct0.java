/**
 * 
 */
package org.formation.fonctionnelle;



/**
 * @author Yoann RICHARD
 *
 */
public class Fonct0 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner entree =   new java.util.Scanner(System.in);
		// TODO Auto-generated method stub
		int x , y, a;
		System.out.println("Merci de saisir x");
		x = entree.nextInt();
		System.out.println("Merci de saisir y");
		y=entree.nextInt();		
		System.out.println("Merci de saisir un nombre");
		a=entree.nextInt();		
		System.out.println("Int");
		System.out.println(sommeInt(x,y));
		System.out.println(soustractionInt(x,y));
		System.out.println(multiplicationInt(x,y));
		System.out.println(divisionInt(x,y));
		System.out.println(resteInt(x,y));
		
		System.out.println("Float");
		
		System.out.println(sommeFloat(x,y));
		System.out.println(soustractionFloat(x,y));
		System.out.println(multiplicationFloat(x,y));
		System.out.println(divisionFloat(x,y));
		System.out.println(resteFloat(x,y));
		
		System.out.println(calculDigi(a));
	}
	/**
	 * Fonction  somme 
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int sommeInt(int a, int b) {
		return a + b;
	}
	/**
	 * Fonction  soustration 
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int soustractionInt(int a, int b){		
		return a-b;		
	}
	/**
	 * Fonction  multiplication
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int multiplicationInt(int a, int b){		
		return a*b;		
	}
	/**
	 * Fonction division  
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int divisionInt(int a, int b){		
		return a/b;	
	}	
	/**
	 * Fonction modulo 
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int resteInt(int a, int b)
	{
		return a%b;
	}
	
	/**
	 * Fonction  somme
	 * @param a
	 * @param b
	 * @return  float
	 */
	public static Float sommeFloat(float a, float b){		
		return a+b;		
	}
	/**
	 * Fonction  soustration
	 * @param a
	 * @param b
	 * @return  float
	 */
	public static Float soustractionFloat(float a, float b){		
		return a-b;		
	}
	/**
	 * Fonction  multiplication
	 * @param a
	 * @param b
	 * @return  float
	 */
	public static Float multiplicationFloat(float a, float b){		
		return a*b;		
	}
	/**
	 * Fonction  division
	 * @param a
	 * @param b
	 * @return  float
	 */
	public static Float divisionFloat(float a, float b){		
		return a/b;		
	}
	/**
	 * Fonction modulo 
	 * @param a
	 * @param b
	 * @return float
	 */
	public static Float resteFloat(float a, float b)
	{
		return a%b;
	}
	/**
	 * Calcul de la taille d'un monbre passé en parametre
	 * @param y
	 * @return un int
	 */
	public static int taille (int y)
	{
		return String.valueOf(y).length();
	}
	
	/**
	 * Calcul de la somme des monbres d'un chiffre
	 * @param nombre
	 * @return un int
	 */
	public static int calculDigi(int nombre)
	{
		int resultat=0;		
		System.out.println(taille(nombre));
		int pas = taille(nombre);
		for (int i = 0; i < pas ; i++) {
			resultat += nombre%10;
			System.out.println(resultat);			
			nombre /=10; 		
			System.out.println(nombre);			
		}		
		return resultat;		
	}
	
	
}
