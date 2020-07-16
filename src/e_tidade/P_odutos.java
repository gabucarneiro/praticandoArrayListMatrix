package e_tidade;

public class P_odutos {
	private int id;
	private String nome;
	private double preco;
	
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public P_odutos() {
		
	}
	public P_odutos(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public void precoIncrease(double porcentagem) {
		preco += preco*porcentagem/100;
	}
	public void precoDiscount(double porcentagem) {
		preco -= preco*porcentagem/100;
	}
	
	public String toString() {
		return "ID: " + getId() + " - Nome: " + getNome() + " - Preço: " + String.format("R$%.2f", getPreco());
	}
	
	
}
