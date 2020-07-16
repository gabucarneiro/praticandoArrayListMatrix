package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Funcionarios;

public class ProgramaExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> funcionarios = new ArrayList<>();
		
		System.out.print("Número de cadastros: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("-- Cadastro "+i+"# --");
			System.out.print("ID: ");
			int id = sc.nextInt();
				while (idExistente(funcionarios, id)) {
					System.out.print("ID já existente, defina outro ID: ");
					id = sc.nextInt();
				}
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			funcionarios.add(new Funcionarios(id, nome, salario));
		}
		System.out.println(funcionarios.toString());
		
		System.out.print("Id do funcionários para gerar o aumento: ");
		int idAlterarSalario = sc.nextInt();
		Funcionarios emp = funcionarios.stream().filter(u -> u.getId() == idAlterarSalario).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("ID inexistente.");
			}
			else {
				System.out.print("Porcentagem do aumento: ");
				double porcentagem = sc.nextDouble();
				emp.aumentoSalario(porcentagem);
				System.out.println("Salario atualizado: "+emp.getSalario());
			}	
		
		sc.close();
	}
	public static boolean idExistente(List<Funcionarios> funcionarios, int id) {
		Funcionarios funci = funcionarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		return funci != null;
	}

}
