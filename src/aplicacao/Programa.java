package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import objetos.Pessoa;
import objetos.Usuario;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner input = new Scanner(System.in);
		int senha, menuopcao, opcao;
		String login, nome, email, celular;
		
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = sdf.format(data);
		String dataDevolucao;
		

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
					System.out.println("Cadastro de Itens:\n1 - Cadastrar Empr�stimo \n2 - Listar Itens Emprestados");
					opcao = input.nextInt();
					if (opcao == 1) {
						System.out.print("Favor digite nome do Item emprestado:");
						nome = input.next();
						System.out.print("E-mail do amigo: ");
						email = input.next();
						System.out.print("Contato de celular do amigo: ");
						celular = input.next();
						System.out.print("Data de Empr�stimo: "+ dataFormatada);
						System.out.println("");
						System.out.println("Digite a data de Devolu��o: ");
						dataDevolucao = input.next();
						
						Date data1 = new Date(sdf.parse(dataFormatada).getTime());
						Date data2 = new Date(sdf.parse(dataDevolucao).getTime());
						
						if(data1.after(data2)) {
							System.out.println("Situa��o do Empr�stimo: Atrasado");
						}else {
							System.out.println("Situa��o do Empr�stimo: Em dia");
						}
						
						
						Pessoa pessoa = new Pessoa(nome, email, celular, dataFormatada, dataDevolucao);

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
			System.out.println("Op��o Inv�lida!");
		} catch (ArrayIndexOutOfBoundsException exception2) {
			System.out.println("Posi��o inv�lida!");
		} catch (NumberFormatException exception3) {
			System.out.println("Imposs�vel realizar esta a��o.");
		} catch (IllegalArgumentException exception3) {
			System.out.println("Imposs�vel realizar esta a��o.");
		}

	}

	public static void Menu() {
		System.out.println("\t" + "SEJA BEM VINDO AO CONTROLE DE EMPR�STIMOS\n" + "\t1 - Efetuar LOGIN\n "
				+ "\t2 - Cadastrar ITEM / Listar ITEM\n " + "\t3 - Sair");

	}
}