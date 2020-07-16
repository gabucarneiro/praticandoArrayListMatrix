package programaMatrix;

import java.util.Scanner;

public class ProgramaMatrix1Praticando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal:");
		for(int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i]+" ");			
		}
		
		System.out.println();
		System.out.println("Números negativos:");
		int count = 0;
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j]<0) {
					System.out.print(matrix[i][j] + " ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.print("Quantidade de números negativos: ");
		System.out.println(count);
		
		
		sc.close();
	}

}
