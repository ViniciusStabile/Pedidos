package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Ordem;
import Entidades.OrdemItens;
import Entidades.OrdemStatus;
import Entidades.Produto;

public class programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("email: ");
		String imail = sc.nextLine();

		System.out.println("Data de nascimento dd/MM/yyyy");
		Date dataNascimento = data.parse(sc.nextLine());

		Cliente cliente = new Cliente(nome, imail, dataNascimento);

		OrdemStatus status = OrdemStatus.valueOf("Processando");

		Ordem ordem = new Ordem(new Date(), status, cliente);

		System.out.println("Quanto produtos diferente deseja comprar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Produto #" + i);
			System.out.print("Nome produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();

			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.println("Quantos desse produto: ");
			int quantidade = sc.nextInt();

			OrdemItens itens = new OrdemItens(quantidade, precoProduto, produto);

			ordem.addProduto(itens);
		}

		System.out.println();
		System.out.println(ordem);

		
		sc.close();
	}

}
