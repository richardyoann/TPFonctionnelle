package org.formation.fonctionnelle;

public class StringvsBuilder {

	public static void main(String[] args) {
		
		String tortue = "";
		long tempsTortue,tempsTortue1 = 0;	
		
		
		for (int i = 0; i <= 10000; i++) {
			tortue = tortue + " " + i;			
		}
		tempsTortue=System.currentTimeMillis();	
		System.out.println(tortue.length()+" " + tempsTortue );
		
		for (int i = 0; i < 10000; i++) {
			
		}
		System.out.println('a'+1);
	}
   
}
