package entities;

public class Client {
	
	private String name;
	private String lastName;
	private long cpf;
	private double balance;
	
	public Client() {
	}

	public Client(String name, String lastName, long cpf, double balance) {
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public double getBalance() {
		return balance;
	}

	
	public void checkBalace() {
		System.out.println("Seu saldo atual é R$" + String.format("%.2f", balance));
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Depósito feito de R$" +String.format("%.2f", amount) + " com sucesso!");
		}
		else {
			System.out.println("Valor de depósito inválido");
		}		
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Saque feito de R$" +String.format("%.2f", amount) + " com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente ou valor inválido");
		}
	}	
}
