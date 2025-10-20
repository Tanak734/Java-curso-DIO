import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Lendo a linha inteira e separando os dados
		String nome = scanner.next();
		double preco = scanner.nextDouble();
		String categoria = scanner.next();

		// TODO: Crie o objeto Produto
		Produto produto = new Produto(nome, preco, categoria);

		// Exiba as informações no formato solicitado:
		System.out.printf("Produto: %s | Categoria: %s | Preco: R$ %s", produto.getNome(), produto.getCategoria(), produto.getPreco());

		scanner.close();
	}
}