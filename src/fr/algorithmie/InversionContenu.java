package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int j =0;
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 
		 // parcourir le tableau array dans l’ordre inverse et remplir le tableau arrayCopy
		 
		 for(int i=array.length-1; i >-1; i--) {
			 int a = array[i];
			 System.out.println("l’ordre inverse du tableau array :"+a);
			 int[] arrayCopy = new int[array.length];			 
			 arrayCopy[j] = a ;
			 System.out.println("les éléments du tableau arrayCopy: " + arrayCopy[j]);
			 j++;
		 }


	}

}
