package programaMatrix;

import java.util.Scanner;

public class ProgramaMatrix1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0; i<matrix.length;i++) { /* LINHA I */
			for(int j=0; j<matrix[i].length; j++) { /* COLUNA J */
				matrix[i][j] =sc.nextInt();
			}
		}
		System.out.println("---- Diagonal Principal ----");
		for (int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
		System.out.println("---- Contagem de negativos ----");
		int count=0;
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j]<0) {
					count+=1;
				}
			}			
		}
		System.out.println("Número de negativos: "+count);
		
		sc.close();
	}

}
