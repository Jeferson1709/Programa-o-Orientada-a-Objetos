package teste;

import banco.ContaBancaria;

import banco.Cliente;

public class TesteConta {
	public static void main(String[] args) {
		// criar uma conta
		ContaBancaria conta = new ContaBancaria();
		conta.setAgencia("1234");
		conta.setNumero("5678-9");

		Cliente cli = new Cliente();
		System.out.println(conta.getCliente().getNome());
		cli.setCpf("111.111.111-22");
		conta.setCliente(cli);
		conta.depositar(1000);
		System.out.println(conta.info());
		conta.sacar(550);
		System.out.println(conta.info());

		ContaBancaria conta2 = new ContaBancaria();
		conta2.setAgencia("1234");
		conta2.setNumero("5678-0");
		conta2.setCliente(cli);
		conta2.depositar(500);
		System.out.println(conta2.info());
		conta2.sacar(1000);
		System.out.println(conta2.info());

	}
}
