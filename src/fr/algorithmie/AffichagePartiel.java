package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		 //afficher les éléments du tableau array
		 for (int i =0; i<array.length ;i++) {
			 int a = array[i];
			 if(a > 3) {
			 System.out.println("l'éléments du tableau plus de trois est :" +a);
			 }
		 }

	}

}
