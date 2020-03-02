package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in) ;
		int a = saisie.nextInt() ;
		
		//affiche les 10 nombres suivants le nombre entré 
		for(int i=0; i<10 ; i++) {

			System.out.println(a+=1);
		}

	}

}
