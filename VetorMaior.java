package VetorMatriz;

public class VetorMaior {

	public static void main(String[] args) {
	
		int[] arrayVetor = new int[6]; // -> [0]...[9]

		arrayVetor[0] = 200;
		arrayVetor[1] = 150;
		arrayVetor[2] = 100;
		arrayVetor[3] = 1000;
		arrayVetor[4] = 500;
		
		int numero = arrayVetor[3];
		
	    for( int l = 0; l <= 5; l++) {
			System.out.println(l + " = " + arrayVetor[l]);
		}
	    
	    System.out.println("O maior é: " + numero);
		
	}

}
