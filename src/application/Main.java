package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Informe seu nome: ");
		String name = sc.next();
		System.out.print("Informe seu sobrenome: ");
		String lastName = sc.next();
		System.out.print("Informe seu cpf: ");
		long cpf = sc.nextLong();
		
		Client client = new Client(name, lastName, cpf, 0.0);
		
		boolean decision = true;
		System.out.println();
		
		while(decision) {
			System.out.println("Opções disponíveis:");
			System.out.println(" 1 - consultar saldo");
			System.out.println(" 2 - fazer depósito");
			System.out.println(" 3 - fazer saque");
			System.out.println(" 4 - finalizar aplicação");
			
			System.out.print("Informe a opção desejada: ");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				client.checkBalace();
				System.out.println();
				break;
			case 2:
				System.out.print("Informe o valor do depósito: ");
				double amount = sc.nextDouble();
				client.deposit(amount);
				System.out.println();
				break;
			case 3:
				System.out.print("Informe o valor do saque: ");
				amount = sc.nextDouble();
				client.withdraw(amount);
				System.out.println();
				break;
			case 4:
				decision = false;
				System.out.print("Encerrando a aplicação até breve!");
				break;						
			default:
				System.out.println("Opção invalida, Tente novamente");
				System.out.println();
				break;
			}			
		}
		
		sc.close();
	}

}
