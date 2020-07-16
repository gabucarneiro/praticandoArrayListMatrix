package programaMatrix;

import java.util.Scanner;

public class ProgramaMatrix2Praticando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de linhas: ");
		int l = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		int c = sc.nextInt();
		System.out.println("Insira os valores da matriz:");
		int[][] matrix2 = new int[l][c];
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Número a ser buscado na matriz: ");
		int numeroBuscar = sc.nextInt();
		System.out.println();
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				if (matrix2[i][j]==numeroBuscar) {
					System.out.println("Número encontrado!");
					System.out.println("Posição na matriz >>> Linha:"+ i +" Coluna: "+ j);
					if(j-1>=0) {
						System.out.println("Esquerda: "+matrix2[i][j-1]);
					}
					if(i-1>=0) {
						System.out.println("Acima: "+matrix2[i-1][j]);
					}
					if(j+1<matrix2[i].length) {
						System.out.println("Direita: "+matrix2[i][j+1]);
					}
					if(i+1<matrix2.length) {
						System.out.println("Abaixo: "+matrix2[i+1][j]);
					}
				}
			}
		}		
		sc.close();
	}

}
