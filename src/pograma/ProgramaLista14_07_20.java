package pograma;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

import e_tidade.Funcionarios14_07_20;

public class ProgramaLista14_07_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionarios14_07_20> funcionarios = new ArrayList<>();
		
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Agora: " + sdt.format(agora));
		System.out.println();
		
		System.out.print("Número de funcionarios: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("--- Funcionário N %d ---%n", (i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			while(idUsado(funcionarios, id)) {
				System.out.print("ID usado, atribua outro: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			funcionarios.add(new Funcionarios14_07_20(id, nome, salario)); 
		}
		for(Funcionarios14_07_20 funci: funcionarios) {
			System.out.println(funci.toString());
		}
		System.out.println();
		System.out.println(" --- Aumento do salário --- ");
		System.out.print("ID do funcionário: ");
		int idAumento = sc.nextInt();
		Funcionarios14_07_20 funcio = funcionarios.stream().filter(w->w.getId()==idAumento).findFirst().orElse(null);
		if(funcio==null) {
			System.out.println("ID inexistente");
		}
		else {
			System.out.print("Valor em % para aumento: ");
			double porcentagem = sc.nextDouble();
			funcio.aumentoSalario(porcentagem);
			System.out.println("Dados atualizados: "+ funcio.toString());
		}
		System.out.println();
		System.out.println(" --- LISTA --- ");
		for(Funcionarios14_07_20 funci: funcionarios) {
			System.out.println(funci.toString());
		}

		Date agora2 = new Date();
		System.out.println();		
		System.out.println("Agora 2: "+sdt.format(agora2));
		System.out.println();
		
		System.out.println("--------------- MATRIX -------------------");
		System.out.println("Usando o número de funcionários para criar a matriz: "+n);
		int[][] matFun = new int[n][n];
		for(int i=0; i<matFun.length; i++) {
			for(int j=0; j<matFun[i].length; j++) {
				matFun[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("--Diagonal principal--");
		for(int i=0; i<matFun.length; i++) {
			System.out.print(matFun[i][i]+" ");			
		}
		System.out.println();
		int contagem = 0;
		System.out.println("--Números negativos na matriz--");
		for(int i=0; i<matFun.length; i++) {
			for(int j=0; j<matFun[i].length; j++) {
				if(matFun[i][j]<0) {
					System.out.println("Posição >>> Linha: "+i+ " Coluna: "+j+" Número: "+ matFun[i][j]);
					contagem++;
				}				
			}
		}
		System.out.println("Quantidade de negativos: "+contagem);

		Date agora3 = new Date();
		System.out.println();
		System.out.println("Agora 3: "+ sdt.format(agora3));
		System.out.println();
		System.out.println("--------------- MATRIX 2 -------------------");
		System.out.print("Insira a quantidade de linhas: ");
		int row = sc.nextInt();
		System.out.print("Insira a quantidade de colunas: ");
		int col = sc.nextInt();
		int countNeg =0;
		int countPos =0;
		int[][] trix = new int[row][col];
		for(int i=0; i<trix.length; i++) {
			for(int j=0; j<trix[i].length; j++) {
				trix[i][j]=sc.nextInt();
				if(trix[i][j]<0) {
					countNeg++;
				}
				else {
					countPos++;
				}
			}
		}
		System.out.println("Contagem de números positivos: "+countPos);
		System.out.println("Contagem de números negativos: "+countNeg);
		
		System.out.println("--- Lista de números positivos ---");
		for(int i=0; i<trix.length; i++) {
			for(int j=0; j<trix[i].length; j++) {
				if(trix[i][j]>=0) {
					System.out.print(trix[i][j] + " ");
				}				
			}
		}
		System.out.println();
		System.out.println("--- Lista de números negativos ---");
		for(int i=0; i<trix.length; i++) {
			for(int j=0; j<trix[i].length; j++) {
				if(trix[i][j]<0) {
					System.out.print(trix[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("--- Posição de um número ---");
		System.out.print("Digite o número para ser localizado: ");
		int loc = sc.nextInt();
		for(int i=0; i<trix.length; i++) {
			for(int j=0; j<trix[i].length; j++) {
				if(trix[i][j]==loc) {
					System.out.println("Localizado!");
					System.out.println("Posição >> Linha: "+i+", Coluna: "+j);
					if(i-1>=0) {
						System.out.println("Número acima: "+ trix[i-1][j]);
					}
					if(j+1<trix[i].length) {
						System.out.println("Número à direita: "+ trix[i][j+1]);
					}
					if(i+1<trix.length) {
						System.out.println("Número abaixo: "+ trix[i+1][j]);
					}
					if(j-1>=0) {
						System.out.println("Número à esquerda: "+ trix[i][j-1]);
					}
					System.out.println();
				}
			}
		}
		Date agoraFinal = new Date();
		System.out.println(sdt.format(agoraFinal));

		sc.close();
	}
	public static boolean idUsado(List<Funcionarios14_07_20> funcionarios, int id) {
		Funcionarios14_07_20 buscaId = funcionarios.stream().filter(q->q.getId()==id).findFirst().orElse(null);
		return buscaId != null;
	}
	
}
