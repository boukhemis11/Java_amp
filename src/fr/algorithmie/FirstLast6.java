package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {6,33,45,1,-85,96,5};
		
		/*On calcule une valeur booléenne qui contrôle le tableau de la sorte : 
		    elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		    elle vaut false dans les autres cas */
		
		boolean cont = ((array.length> 0 ) && (array[0] == 6) || (array[array.length-1 ] == 6)) ;
		System.out.println("controle est " +cont);
	}

}
