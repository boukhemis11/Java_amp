package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {6,33,45,1,-85,96,5};
		boolean cont;
		
		/*On calcule une valeur bool�enne qui contr�le le tableau de la sorte : 
		    elle vaut true si le tableau a au moins 1 �l�ment et si le premier �l�ment ou le dernier �l�ment vaut 6.
		    elle vaut false dans les autres cas */
		 
		
		if(array.length> 0 && array[0] == 6 || array[array.length-1 ] == 6) {
			cont = true;
			System.out.println("controle est " +cont);
		}else {
			cont = false;
			System.out.println("controle est " +cont);
		}
	}

}
