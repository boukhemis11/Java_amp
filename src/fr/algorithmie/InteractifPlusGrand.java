package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	
	public static void main(String[] args) {
		int[] array = new int[10];	
		Scanner saisie = new Scanner(System.in) ;
		// affiche le plus grand des nombres entré par l'utilisateur.
		for(int i=0; i<10 ; i++) {

			int a = saisie.nextInt() ;
			array[i]=a;
			System.out.println(a);
		}
		
		int max=array[0];
		
		for(int n : array) {
			
			if(n > max) {
				max = n;
			}
		}
		System.out.println("Le plus grand nombre est : "+max);
	}

}
