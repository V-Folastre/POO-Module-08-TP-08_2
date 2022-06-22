package fr.cmfp.tp8_2;

import java.util.Random;

public class Jeu {
	
	private int cU;
	private int cO;
	private int compteurU;
	private int compteurO;
	private int partie;
	private int gagne;
	private int score;

	public Jeu() {
	}

	public int getcO() {
		
		Random r = new Random();
		
		cO = r.nextInt(3);
		
		return cO+1;
	}

	public Jeu(int cU, int cO) {
		super();
		this.cU = cU;
		this.cO = cO;
	}

	public int getPartie(int cU, int cO) {
		   
		   if (cU == 1 & cO == 1 | cU == 2 & cO == 2 | cU == 3 & cO == 3) { 
	    	   gagne = 3;	           
		   }
		   
		   if (cU == 1 & cO == 2 | cU == 2 & cO == 3 | cU == 3 & cO == 1) { 
	    	   gagne = 2;	           
		   }
		   
		   if (cU == 2 & cO == 1 | cU == 3 & cO == 2 | cU == 1 & cO == 3) { 
	    	   gagne = 1;	           
		   }
		
		   return gagne;
	   
	}

}
