package teste;

import br.senac.sp.poo.banco.Cliente;
import br.senac.sp.poo.banco.ContaBancaria;
import br.senac.sp.poo.banco.ContaCorrente;
import br.senac.sp.poo.banco.ContaPoupanca;

public class TestaObjetos2 {
	public static void main(String[] args) {
		// cria um objeto ContaBancaria
		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(1000);
		// cria outro objeto ContaBancaria
		ContaBancaria c2 = new ContaPoupanca();
		c2.depositar(500);
		// Passa para a variÃ¡vel c3 a mesma referÃªncia da variÃ¡vel c2
		ContaBancaria c3 = c2;
		// este saque ocorre no mesmo objeto que Ã© referenciado por c2 e c3
		c3.sacar(250);
		// cria um objeto Cliente
		Cliente cl1 = new Cliente();
		cl1.setNome("JoÃ£o");
		// cria outro objeto Cliente
		Cliente cl2 = new Cliente();
		cl2.setNome("Maria");
		// Passa para a variÃ¡vel cl3 a mesma referÃªncia da variÃ¡vel cl1
		Cliente cl3 = cl1;
		// associa os clientes Ã s contas, lembrando que c2 e c3 sÃ£o as mesmas contas
		c1.setCliente(cl1);
		c2.setCliente(cl2);
		c3.setCliente(cl3);
		// troca o nome do cliente da conta cl3, que Ã© a mesma que a cl2
		cl3.setNome("Alberto");		
		// exibe as informaÃ§Ãµes
		System.out.println(c1.info());
		System.out.println(c2.info());
		System.out.println(c3.info());
		// exibe os "endereÃ§os" dos objetos
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.getCliente());
		System.out.println(c2.getCliente());
		System.out.println(c3.getCliente());
	}
}