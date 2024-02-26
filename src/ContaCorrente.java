import java.util.Scanner;

public class ContaCorrente {
	int saldo = 3000;
	String nome = "Bruno Rivolta";
	String separador = "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=";
	String tipoConta = "Conta Corente";
	int menuSelecionado = 0;
	Scanner leitura = new Scanner(System.in);

	void deposito(int valor) {
		System.out.println(separador);
		saldo = saldo + valor;
		System.out.println("Depósito realizado com sucesso!");
	}

	void saque(int valor) {
		double resultado = saldo - valor;
		System.out.println(separador);
		if (resultado < saldo) {
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente na conta");
		}
	}

	void mostrarDadosDoClinente() {
		System.out.println(separador);
		System.out.printf("Cliente: %s%n", nome);
		System.out.printf("Tipo de Conta: %s%n", tipoConta);
	}

	void mostrarSaldo() {
		System.out.println(separador);
		System.out.printf("Saldo: R$%d%n", saldo);
	}

	void mensagemDeFim() {
		System.out.println(separador);
		System.out.println("Agradecemos sua preferência, volte logo!");
		System.out.println(separador);
	}

	void mostrarMenu() {
		while (menuSelecionado != 4) {
			System.out.println(separador);

			System.out.println("""
				Menu de opções:
				    1 - Consultar Saldo
				    2 - Depositar valor
				    3 - Transferir valor
				    4 - Sair
				    
				 Digite agora a opção desejada:
				""");
			menuSelecionado = leitura.nextInt();

			if (menuSelecionado == 1) {
				mostrarSaldo();
			} else if (menuSelecionado == 2) {
				System.out.println("Digite o valor que deseja depositar:");
				menuSelecionado = leitura.nextInt();
				deposito(menuSelecionado);
			} else if (menuSelecionado == 3) {
				System.out.println("Digite o valor que deseja sacar:");
				menuSelecionado = leitura.nextInt();
				saque(menuSelecionado);
			} else if (menuSelecionado == 4) {
				mensagemDeFim();
			} else {
				System.out.println("O valor digitado é invalido!");
			}
		}
	}
}
