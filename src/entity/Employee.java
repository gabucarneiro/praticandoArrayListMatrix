package entity;

public class Employee {
	private int id;
	private String nome;
	private double salario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Employee() {
		
	}
	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public void aumentoSalario(double porcentagem) {
		salario += salario*porcentagem/100;
	}
	
	public String toString() {
		return "ID: "+getId()+ " - Nome: "+getNome()+ " - Salario: "+String.format("%.2f", getSalario());
	}
}
