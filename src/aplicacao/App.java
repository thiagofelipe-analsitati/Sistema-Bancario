package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBancaria;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta; 
		char simNao;
		System.out.println("Digite o N�mero da Conta: ");
		int numConta = sc.nextInt();
		System.out.println("Digite o nome do titular da Conta: ");
		String nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Deseja fazer um de posito inicial? s/n: ");
		char simN�o = sc.next().charAt(0);
		if(simN�o == 's' ) {
			System.out.println("Digite o valor inicial: ");
			double saldoInicial = sc.nextDouble();
			conta = new ContaBancaria(numConta, nome, saldoInicial);
			System.out.println(conta);
		}else {
			conta = new ContaBancaria(numConta, nome);
		}
		
		do {
		System.out.println("desjea Fazer alguma opera��o?:");
		System.out.println("Digite 1 para saldo: ");
		System.out.println("Digite 2 para dep�sito:");
		System.out.println("Digite 3 para saque: ");
		
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.printf("Seu saldo �: %.2f%n " , conta.getSaldo());
			System.out.println(conta);
			break;
		case 2:
			System.out.println("digite o valor do deposit: ");
			double deposito = sc.nextDouble();
			conta.Deposito(deposito);
			System.out.println(conta);
			break;
		case 3:
			System.out.println("digite o valor do saque: ");
			double saque = sc.nextDouble();
			conta.Saque(saque);
			System.out.println(conta);
			break;
		}
		System.out.println("Deseja fazer mais alguma opra��o: s/n: ");
		 simNao = sc.next().charAt(0);
		}while(simNao == 's');
		
		
		sc.close();


	}

}
