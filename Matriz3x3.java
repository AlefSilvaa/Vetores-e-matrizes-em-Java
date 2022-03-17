package VetorMatriz;

import java.util.Random;

public class Matriz3x3 {

	public static void main(String[] args) {
		
		int[][] numAle = new int[3][3];
		int soma, som1;
		
		Random numeroRandom = new Random();
		
		for (int i=0; i<numAle.length; i++) {
			for (int j=0; j<numAle[i].length; j++) {
				numAle[i][j] = numeroRandom.nextInt(100);
			}
		}
		int maior = 0;
		int linha = 0;
		int col = 0;
		for (int i=0; i<numAle.length; i++) {
			for (int j=0; j<numAle[i].length; j++) {
				if(numAle[i][j] > maior) {
					maior = numAle[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		for (int i=0; i<numAle.length; i++) {
			for (int j=0; j<numAle[i].length; j++) {
				System.out.print(numAle[i][j] + " ");
			}
			System.out.println();
		}
			
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
		System.out.println();
		
		som1 = numAle[0][0] + numAle[0][1] + numAle[0][2] + numAle[1][0] + numAle[1][1] + numAle[1][2] + numAle[2][0] + numAle[2][1] + numAle[2][2];
		System.out.println("A soma de todos os valores é: " + som1);
		System.out.println();
	    soma = numAle[0][0] + numAle[1][1] + numAle[2][2];
	    System.out.println("A soma da coluna é: " + soma);
			
		
	}

}