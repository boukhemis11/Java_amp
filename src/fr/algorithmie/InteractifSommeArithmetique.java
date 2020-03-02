package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in) ;
		int a = saisie.nextInt() ;
		int b=0;	
		//calcule la somme de tous les entiers compris entre 1 et le nombre entré
		for(int i=1; i<=a ; i++) {
			System.out.println(b=b+i);
		}

	}

}
