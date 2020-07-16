package pograma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import e_tidade.Employee;

public class ProgramaListaExercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Quantidade de funcionários para cadastrar: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			while(idEmUso(employee, id)) {
				System.out.print("ID em uso, escolha outro: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			employee.add(new Employee(id, nome, salario));
		}
		System.out.println();
		
		employee.add(new Employee(999, "Juscelino", 6000));
		employee.add(new Employee(998, "Alguem", 2000));
		
		System.out.println("--- Lista ---");
		for(Employee empl: employee) {
			System.out.print(empl.toString());
		}
		
		System.out.println("--- Aumento ---");
		System.out.print("ID do funcionário: ");
		int idAumento = sc.nextInt();
		Employee emplo = employee.stream().filter(w->w.getId()==idAumento).findFirst().orElse(null);
		if (emplo != null) {
			System.out.print("Valor (em %) para aumento: ");
			double porcentagem = sc.nextDouble();
			emplo.aumentoSalario(porcentagem);
			System.out.println("Dados atualizados: "+emplo.toString());
		}
		else {
			System.out.println("ID não encontrado.");
		}
		System.out.println();
		System.out.println("--- Lista ---");
		for(Employee empl: employee) {
			System.out.print(empl.toString());
		}
		
		sc.close();
	}
	public static boolean idEmUso(List<Employee> employee, int id) {
		Employee emp = employee.stream().filter(q->q.getId()==id).findFirst().orElse(null);
		return emp !=null;
	}

}
