package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in) ;
		int a = saisie.nextInt() ;
		
		if(a>1 && a<11) {
			for(int i =1; i<11;i++) {
				System.out.println(a +" * "+i+" = "+ (a*i));
			}
		}

	}

}
