package  teste;
import banco.ContaBancaria;

import banco.Cliente;
public class TesteConta {
    public static void main(String[] args) {
        // criar uma conta
		ContaBancaria conta = 
				new ContaBancaria();
		conta.agencia = "1234";
		conta.numero = "5678-9";
		Cliente cli = new Cliente();
		cli.nome = "JoÃ£o";
		cli.cpf = "111.111.111-22";
		conta.cliente = cli;
		conta.depositar(1000);
		System.out.println(conta.info());
		conta.sacar(550);
		System.out.println(conta.info());
		
		ContaBancaria conta2 = 
				new ContaBancaria();
		conta2.agencia = "1234";
		conta2.numero = "5678-0";
		conta2.cliente = cli;
		conta2.depositar(500);
		System.out.println(conta2.info());
		conta2.sacar(1000);
		System.out.println(conta2.info());

    }
}
