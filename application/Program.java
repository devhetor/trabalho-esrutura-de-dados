package application;

import java.util.Scanner;

import entities.Departamento;
import entities.Empresa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Empresa empresa = new Empresa();

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o nome do departamento #%d: ", i + 1);
			String nomeDp = sc.nextLine();
			System.out.printf("Digite o nome do gerente do departamento #%d: ", i + 1);
			String gerente = sc.nextLine();
			//Departamento departamento = new Departamento(nomeDp, gerente);
			empresa.adicionarDepartamento(nomeDp, gerente);
		}

		char op;
		do {
			System.out.print("Adicionar colaborador? (y/n)");
			op = sc.next().charAt(0);
			sc.nextLine();
			if (op == 'y') {
				System.out.print("Adicionar em qual departamento? ");
				String nomeDepartamento = sc.nextLine();
				Departamento departamento = empresa.buscarDepartamentoPorNome(nomeDepartamento);
				if (departamento == null) {
					System.out.println("Departamento não encontrado.");
				} else {
					System.out.print("Adicionar quantos colaboradores? ");
					int quantidadeColab = sc.nextInt();
					sc.nextLine();
					for (int i = 0; i < quantidadeColab; i++) {
						System.out.print("Digite o nome do colaborador: ");
						String nomeColab = sc.nextLine();
						departamento.adicionarColaborador(nomeColab);
					}
				}
			}
		} while (op != 'n');

		System.out.println();
		empresa.imprimirDepartamentos();
		
		System.out.println();
		System.out.println("Imprimir por (1)departamento ou (2)colaborador?");
		int imprimirOp = sc.nextInt();
		sc.nextLine();
		if(imprimirOp == 1) {
			System.out.print("Digite o nome do departamento: ");
			String impDepartamento = sc.nextLine();
			empresa.imprimirColaboradoresPorDepartamento(impDepartamento);
		}else {
			System.out.print("Digite o nome do colaborador: ");
			String impColaborador = sc.nextLine();
			empresa.imprimirGerenteEDepartamentoPorColaborador(impColaborador);
		}

		sc.close();
	}

}
