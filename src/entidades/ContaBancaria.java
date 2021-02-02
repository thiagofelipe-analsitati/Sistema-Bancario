package entidades;

public class ContaBancaria {
	
	private int numConta;
	private String nome;
	private double saldo;
	
	public ContaBancaria() {
	}
	public ContaBancaria(int numConta, String nome, double saldo) {
	
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	public ContaBancaria(int numConta, String nome) {
		
		this.numConta = numConta;
		this.nome = nome;
	
	}
	public int getNumConta() { 
		return numConta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	 
	public double Deposito(double deposito) {
		return this.saldo+=deposito;
	}
	public double Saque(double saque) {
		
		return this.saldo -= saque - 5.00 ;
			
	}
	
	public String toString() {
		 return "conta: " 
				 + numConta
				 + ", Titular: " 
				 + nome
				 + ",saldo : " 
				 + String.format("%.3f", saldo);
	}
	
}
