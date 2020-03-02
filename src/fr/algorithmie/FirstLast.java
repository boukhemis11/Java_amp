package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = {4,3,6,1,4};
		
		/*On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		 	elle vaut true si le tableau est de longueur strictement supérieure à 1 et que le
			premier et le dernier élément du tableau ont la même valeur
			elle vaut false dans les autres cas
		 */
		
		boolean cont = ((array.length> 1 )&& (array[0] == array[array.length-1 ] ));
			System.out.println("controle est " +cont);

	}

}
