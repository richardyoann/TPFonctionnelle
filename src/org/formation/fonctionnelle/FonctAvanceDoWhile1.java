package org.formation.fonctionnelle;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {		
		int nb1, nb2,nb3,cpt = 0;
		// On boucle tant la condition n'est pas trouvée
		do {
			 nb1 = (int) (Math.random() * 1000);
			 nb2 = (int) (Math.random() * 1000);
			 nb3 = (int) (Math.random() * 1000);
			 cpt+=1;			 
		} while (!(test(nb1)&& test(nb2) &&!test(nb3)));
		System.out.println("Il a fallu : " + cpt +" fois pour trouver la bonne réponse");
	}
	//fonction de test 
	public static boolean test (int nb){
		boolean pair = false;
		if (nb%2==0)
			pair =true;
		return pair;
		
	}
}
