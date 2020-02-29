package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		 //afficher les éléments du tableau plus de trois
		 for (int i =0; i<array.length ;i++) {
			 int a = array[i];
			 if(a > 3) {
			 System.out.println("l'élément du tableau plus de trois est :" +a);
			 }
		 }
		 
		 //afficher les éléments pairs du tableau
		 for (int i =0; i<array.length ;i++) {
			 int a = array[i];
			 if(a%2 == 0) {
			 System.out.println("l'élément pairs du tableau :" +a);
			 }
		 }
		 
		 //les valeurs correspondant aux index pairs du tableau
		 for (int i =0; i<array.length ;i++) {
			 int a = array[i];
			 if(i%2 == 0) {
			 System.out.println("la valeur correspondant aux index pairs du tableau :" +a);
			 }
		 }
		 
		//afficher les éléments impairs du tableau
		 for (int i =0; i<array.length ;i++) {
			 int a = array[i];
			 if(a%2 != 0) {
			 System.out.println("l'élément impairs du tableau :" +a);
			 }
		 }

	}

}
