package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	
	public static void main(String[] args) {
		int[] array = new int[10];	
		Scanner saisie = new Scanner(System.in) ;
		for(int i=0; i<10 ; i++) {

			int a = saisie.nextInt() ;
			array[i]=a;
			System.out.println(a);
		}
		int max=array[0];
		for(int nombre : array) {
			
			if(nombre > max) {
				max = nombre;
			}
		}
		System.out.println("Le plus grand nombre que vous avez entré est : "+max);
	}

}
