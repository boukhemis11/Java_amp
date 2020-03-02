package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int secretNb = new Random().nextInt(100)+1;
		Scanner saisie = new Scanner(System.in) ;
		System.out.println(secretNb);
		boolean cond= true;
		int i=0;
		while (cond)
		{
			i++;
			int a = saisie.nextInt();
			if(a==secretNb) {

				System.out.println("waw"+i);
				cond= false;
				break;
				}
				else if(a<secretNb) {
					System.out.println("il est au-dessus");
				}else {
					System.out.println("il est au-dessous");			
				}

		}
	}

}
