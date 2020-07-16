package pograma;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import e_tidade.P_odutos;

public class P_ograminha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<P_odutos> p_odutos = new ArrayList<>();
		char novoP_oduto;
		do {
		System.out.print("ID: ");
		int id = sc.nextInt();
			while (idInUse(p_odutos, id)) {
				System.out.print("ID em uso, defina outro id: ");
				id = sc.nextInt();
			}
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.next();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		p_odutos.add(new P_odutos(id, nome, preco));
		
		System.out.print("Novo produto? ('s' ou qualquer outra letra)");
		novoP_oduto = sc.next().charAt(0);
		} while (novoP_oduto == 's');
		
		for(P_odutos podutos: p_odutos) {
			System.out.println(podutos.toString());
		}
		
		
		System.out.println(" -- DESCONTO --");
		System.out.print("Informe o ID do produto para modificar o preço: ");
		int idToDiscount = sc.nextInt();
		P_odutos poduto = p_odutos.stream().filter(e->e.getId()==idToDiscount).findFirst().orElse(null);
		System.out.println("Dados atuais: "+poduto.toString());
		System.out.print("Valor do desconto em porcentagem: ");
		double porcentagem = sc.nextDouble();
		poduto.precoDiscount(porcentagem);
		System.out.println("Dados atualizados: "+poduto.toString());
		
		for(P_odutos podutos: p_odutos) {
			System.out.println(podutos.toString());
		}	
		sc.close();
	}
	public static boolean idInUse(List<P_odutos> p_odutos, int id) {
		P_odutos podutos = p_odutos.stream().filter(f->f.getId()==id).findFirst().orElse(null);
		return podutos !=null;
	}

}
