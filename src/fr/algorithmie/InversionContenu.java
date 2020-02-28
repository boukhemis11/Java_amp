package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		int j =0;
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 for(int i=array.length-1; i >-1; i--) {
			 int a = array[i];
			 System.out.println("a= "+a);
			 int[] arrayCopy = new int[array.length];
			 
			 arrayCopy[j] =arrayCopy[j] + a ;

			 System.out.println("b= "+ Arrays.toString( arrayCopy ));
			 j++;

		 }


	}

}
