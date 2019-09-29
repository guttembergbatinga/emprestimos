package aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import objetos.Pessoa;
import objetos.Usuario;

public class Programa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int senha, menuopcao, opcao;
		String login, nome, email, celular, data;

		List<Usuario> lista = new ArrayList<Usuario>();
		List<Pessoa> listaPessoaFisica = new ArrayList<Pessoa>();

		try {
			while (true) {
				Menu();

				System.out.println("\nFavor escolher o que deseja:");
				menuopcao = input.nextInt();
				Usuario usuario = null;
				switch (menuopcao) {
				case 1:
					System.out.println("####  LOGIN ####\n");
					System.out.print("Favor digite seu nome:");
					login = input.next();
					System.out.println("Favor digite a senha:");
					senha = input.nextInt();
					usuario = new Usuario(login, senha);
					lista.add(usuario);
					break;

				case 2:
					System.out.println("Cadastro de Itens:\n1 - Cadastrar Empréstimo \n2 - Listar Itens Emprestados");
					opcao = input.nextInt();
					if (opcao == 1) {
						System.out.print("Favor digite nome do Item emprestado:");
						nome = input.next();
						System.out.print("E-mail do amigo: ");
						email = input.next();
						System.out.print("Contato de celular do amigo: ");
						celular = input.next();
						System.out.print("Data do empréstimo: (DD/mm/YYYY)");
						data = input.next();
						Pessoa pessoa = new Pessoa(nome, email, celular, data);

						listaPessoaFisica.add(pessoa);
						break;
					} else if (opcao == 2) {
						for (Pessoa p : listaPessoaFisica) {
							System.out.println(p);
						}
						break;
					}
				case 3:
					System.out.println("Programa encerrado");
					System.exit(0);
					input.close();

				}
			}
		} catch (InputMismatchException exception1) {
			System.out.println("Opção Inválida!");
		} catch (ArrayIndexOutOfBoundsException exception2) {
			System.out.println("Posição inválida!");
		} catch (NumberFormatException exception3) {
			System.out.println("Impossível realizar esta ação.");
		} catch (IllegalArgumentException exception3) {
			System.out.println("Impossível realizar esta ação.");
		}

	}

	public static void Menu() {
		System.out.println("\t" + "SEJA BEM VINDO AO CONTROLE DE EMPRÉSTIMOS\n" + "\t1 - Efetuar LOGIN\n "
				+ "\t2 - Cadastrar ITEM / Listar ITEM\n " + "\t3 - Sair");

	}
}