package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int compt = 0;
		

		System.out.println("Choisissez le chiffre correspondant à votre choix : \n 1 : Ajouter un nombre \n 2 : Afficher les nombres existants");
		int valeur = scanner.nextInt();		

		while (valeur == 1 || valeur == 2){			
			if (valeur == 1){
				System.out.println("Choisissez un nombre");
				int nb = scanner.nextInt();
				
				array[compt] = nb;
				compt++;
				
				System.out.println("Choisissez le chiffre correspondant à votre choix : \n 1 : Ajouter un nombre \n 2 : Afficher les nombres existants");
				valeur = scanner.nextInt();
			}
			else if (valeur == 2){
				for (int i = 0; i < compt; i++) {
					System.out.println(array[i]);				
				}
				System.out.println("Choisissez le chiffre correspondant à votre choix : \n 1 : Ajouter un nombre \n 2 : Afficher les nombres existants");
				valeur = scanner.nextInt();
			}

		}


	}

}
