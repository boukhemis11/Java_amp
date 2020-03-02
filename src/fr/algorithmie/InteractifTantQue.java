package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in) ;

			int a=0;

			while (true)
			{
				a = saisie.nextInt() ;
				if(a>0 && a<11) {
					System.out.println("le numéro est :"+a);
					break;		
				}else {
					System.out.println("essayer un autre numéro svp");			
				}				
			}
	}
}
