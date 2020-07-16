package programa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		list.add("Naise");
		list.add("Juscelino");
		list.add("Ana");
		list.add("Ane");
		list.add("Naina");
		list.add("Nai");
		list.add("Gabriel");
		list.add("Gabumiel");
		list.add(1, "Gabriel");
		
		String menu="";
		String Menu = Menu(menu);
		System.out.println(Menu);
		System.out.println("Digite o n�mero correspondente � sua op��o: ");
		int option = sc.nextInt();
		while (option!=5) {
			switch (option) {
				case 1:
					for(String lista: list) {
						System.out.println(lista);
					}
					break;
				case 2:
					System.out.println("____ADD____");
					System.out.print("Escolha em qual posi��o: ");
					int posicao = sc.nextInt();
					System.out.print("Digite o nome a ser inclu�do: ");
					String adicionar = sc.next();
					list.add(posicao, adicionar);
					break;
				case 3:
					System.out.println("___REMOVER___");
					System.out.printf("Para remover por:%n 1- Nome%n 2- Index%n 3- Todos com a 1� letra __%n");
					System.out.print("Op��o para exclus�o: ");
					int opc_exclusao = sc.nextInt();
					switch(opc_exclusao) {
						case 1:
							System.out.print("Digite o nome para remo��o: ");
							String String_remover = sc.next();
							list.remove(String_remover);
							break;
						case 2:
							System.out.print("Digite o n�mero da posi��o para remo��o: ");
							int int_remover = sc.nextInt();
							list.remove(int_remover);
							break;
						case 3:
							System.out.print("Digite a letra inicial para remo��o: ");
							char char_remover = sc.next().charAt(0);
							list.removeIf(lista -> lista.charAt(0) == char_remover);
							break;
						default:
							break;
						}
					break;
				case 4:
					System.out.println("___ Index do nome___");
					System.out.print("Digite o nome que deseja saber qual Index: ");
					String indexOf = sc.next();
					System.out.println("O index de "+indexOf+" �: " +list.indexOf(indexOf));
					break;
				case 5:
					System.out.println("ENDED");
					break;
				case 6:
					System.out.println("___ Primeira ocorr�ncia da letra escolhida ___");
					System.out.print("Digite a letra deseja buscar a primeira ocorr�ncia: ");
					char primeiraOcorrencia = sc.next().charAt(0);
					String findFirst = list.stream().filter(lista -> lista.charAt(0)==primeiraOcorrencia).findFirst().orElse(null);
					System.out.println(findFirst);
					break;
				case 7:
					System.out.print("Digite a letra inicial para encontrar todos que iniciam com a letra escolhida: ");
					char char_remover = sc.next().charAt(0);
					//list.removeIf(lista -> lista.charAt(0) != char_remover);
					
					List<String> result = list.stream().filter(lista -> lista.charAt(0) == char_remover).collect(Collectors.toList());
					for (String lista:result) {
						System.out.println(lista);
					}
					
					break;
				case 8:
					System.out.println("A lista tem "+list.size()+" nomes.");
					break;
				default:
					System.out.println("N�o � uma op��o v�lida!");
					break;
				}
			System.out.println(Menu);
			
			System.out.println("Nova escolha: ");
			option = sc.nextInt();
		}
		
		
		sc.close();
	}
	public static String Menu(String menu) {
		return menu = "______ MENU ______"+ String.format("%n") + 
				"1- Listar" + String.format("%n") + 
				"2- Adicionar" + String.format("%n") + 
				"3- Remover" + String.format("%n") + 
				"4- Index do nome" + String.format("%n") + 
				"5- SAIR" + String.format("%n") + 
				"6- Encontrar primeira ocorr�ncia" + String.format("%n") + 
				"7- Encontrar todos com a letra" + String.format("%n") + 
				"8- Tamanho da lista";
	}

}
