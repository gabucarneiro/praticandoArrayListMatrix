package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Employee;

public class ProgramaExercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Number of employees: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println(" ---- Employee N#"+i+" ----");
			System.out.print("ID: ");
			int id = sc.nextInt();
				while (idInUse(employee, id)) {
					System.out.print("ID in use. Set other ID:");
					id = sc.nextInt();
				}
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			employee.add(new Employee(id, nome, salario));
		}
		System.out.println();
		System.out.println("_____ LIST OF EMPLOYEES _____");
		for(Employee tostring : employee) {
			System.out.println(tostring.toString());
		}
		System.out.println();
		System.out.println("---- Salary increase ----");
		System.out.print("Employee ID: ");
		int idToUpgrade = sc.nextInt();
		Employee empl = employee.stream().filter(w->w.getId()==idToUpgrade).findFirst().orElse(null);
		if(empl == null) {
			System.out.println("ID null.");
		}
		else {
			System.out.print("Set the percentage to increase: ");
			double porcentagem = sc.nextDouble();
			empl.aumentoSalario(porcentagem);
			System.out.println(empl.toString());
		}		
		
		sc.close();
	}
	public static boolean idInUse(List<Employee> employee, int id) {
		Employee emp = employee.stream().filter(q->q.getId()==id).findFirst().orElse(null);
		return emp != null;
	}
}
