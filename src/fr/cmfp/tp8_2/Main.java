package fr.cmfp.tp8_2;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.cmfp.tp8_2.Choix.choix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int saisie;
		int saisie2;
		int gagne;
		boolean valide;
		boolean sortie = false;
		int compteurU = 0;
		int compteurO = 0;
		
		Jeu score = new Jeu();
		
		System.out.println("Bienvenu dans le jeu pierre feuille ciseau.");
		

		do {
			
			do {
				
				do {
				
					valide = true;
					
					System.out.println("1 - " + choix.values()[0]);
					System.out.println("2 - " + choix.values()[1]);
					System.out.println("3 - " + choix.values()[2]);
					System.out.println();
					System.out.println("A vous de commencer (0 - sortir) :");
					
					try {
								
					saisie = sc.nextInt();
					
					} catch (InputMismatchException e) {
							
						System.err.println("Réponse incorrecte");
						
						valide = false;
						
						saisie = 0;
						
					} finally {
						
						sc.nextLine();
					}
					
				} while (valide != true);
				
				if (saisie < 0 | saisie > 3) {
					
					valide = false;
					
					System.err.println("Réponse incorrecte");
					
				} else {
					
					sortie = true;
					
				}
			
			} while (valide != true);
		
			if (saisie != 0) {
				
				Jeu tourOrdinateur = new Jeu();
				
				saisie2 = tourOrdinateur.getcO();
				
				System.out.println(choix.values()[saisie2-1]);
				
				Jeu laParie = new Jeu(saisie, saisie2);
				
				gagne = laParie.getPartie(saisie, saisie2);
				
				switch (gagne) {
				
					case 1 :
						System.out.println("Bravo vous avez gagné !");
						break;
						
					case 2 :
						System.out.println("Dommage vous avez perdu !");
						break;
						
					case 3 :
						System.out.println("Egalité !");
						break;
				
				}
				
				switch (gagne) {
				
				case 1 :
					compteurU = compteurU + 1;
					break;
					
				case 2 :
					compteurO = compteurO + 1;
					break;
					
				case 3 :

					break;
					
					
				}
			
				System.out.println("Score : Joueur : " + compteurU + " | Ordinateur : " + compteurO);
				
				do {
					
					do {
					
						valide = true;
						
						System.out.println("Voulez vous rejouer ? :");
						System.out.println();
						System.out.println("1 - Oui");
						System.out.println("2 - Non");
						
						try {
									
						saisie = sc.nextInt();
						
						} catch (InputMismatchException e) {
								
							System.err.println("Réponse incorrecte");
							
							valide = false;
							
							saisie = 0;
							
						} finally {
							
							sc.nextLine();
						}
						
					} while (valide != true);
					
					if (saisie < 1 | saisie > 2) {
						
						valide = false;
						
						System.err.println("Réponse incorrecte");
						
					}
				
				} while (valide != true);
				
				if (saisie == 2) {
					
					sortie = true;
					
				} else {
					
					sortie = false;
					
				}
				
			}
	
		} while (sortie != true);
		
		System.out.println("Merci d'avoir jouer.");
	
	}

}
