package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		 //afficher les éléments du tableau array
		 for (int i =0; i<array.length ;i++) {
			 int a = array[i];
			 System.out.println("les éléments du tableau :" +a);
		 }
		 
		 //afficher l’ordre inverse du tableau array
		 for(int i=array.length-1; i >-1; i--) {
			 int a = array[i];
			 System.out.println("l’ordre inverse du tableau :"+a);
		 }
		 
		 //Copier array dans arrayCopy
		 int[] arrayCopy = new int[array.length];	
		 for(int i=0; i <array.length; i++) {
			 arrayCopy[i] = array[i];
			 System.out.println("les éléments du tableau arrayCopy :"+ arrayCopy[i]);
		 }


		 

	}

}
