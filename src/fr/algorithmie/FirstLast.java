package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = {4,3,6,1,4};
		boolean cont;
		
		if(array.length> 1 && array[0] == array[array.length-1 ] ) {
			cont = true;
			System.out.println("controle est " +cont);
		}else {
			cont = false;
			System.out.println("controle est " +cont);
		}

	}

}
