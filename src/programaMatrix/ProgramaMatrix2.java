package programaMatrix;

import java.util.Scanner;
public class ProgramaMatrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de linhas: ");
		int linha = sc.nextInt();
		System.out.print("Número de colunas: ");
		int coluna = sc.nextInt();
		int[][] matrix2 = new int[linha][coluna];
		
		for(int i=0; i<matrix2.length; i++) {
			for (int j=0; j<matrix2[i].length; j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		int mais=1;
		while(mais==1) {
			System.out.println("---- Número a ser buscado ----");
			System.out.print("Digite o número para a busca: ");
			int numeroBusca = sc.nextInt();
			
			for(int i=0; i<matrix2.length; i++) {
				for(int j=0; j<matrix2[i].length; j++) {
					if(matrix2[i][j]==numeroBusca) {
						System.out.println("Encontrado!");
						System.out.print("Linha: "+i);
						System.out.println(" - Coluna: "+j);
						if(j-1>=0) {
							int left = matrix2[i][j-1];
							System.out.println("Esquerda: "+ left);
						}
						if(i-1>=0) {
							int up = matrix2[i-1][j];
							System.out.println("Acima: "+ up);
						}
						if(j+1<matrix2[i].length) {
							int right = matrix2[i][j+1];
							System.out.println("Direita: "+ right);
						}
						if(i+1<matrix2.length) {
							int down = matrix2[i+1][j];
							System.out.println("Abaixo: "+ down);
						}
						//int left = matrix2[i][j-1];
						//int up = matrix2[i-1][j];
						//int right = matrix2[i][j+1];
						//int down = matrix2[i+1][j];
						//System.out.println("Esquerda: "+ left);
						//System.out.println("Acima: "+ up);
						//System.out.println("Direita: "+ right);
						//System.out.println("Abaixo: "+ down);
					}
				}
			}
			System.out.println("Mais? (1)");
			mais = sc.nextInt();
		}
		
		
		// TOP: i-- j=
		// RIGHT: i= j++
		// DOWN: i++ j=
		// LEFT: i= j--
		
		
		
		sc.close();

	}

}
