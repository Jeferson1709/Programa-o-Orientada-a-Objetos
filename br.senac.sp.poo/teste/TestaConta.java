import br.senac.sp.poo.banco.Cliente;
import br.senac.sp.poo.banco.ContaBancaria;
import br.senac.sp.poo.banco.ContaCorrente;
import br.senac.sp.poo.banco.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		ContaBancaria[] contas = new ContaBancaria[5];
		contas[0] = new ContaCorrente();
		contas[1] = new ContaPoupanca();
		contas[2] = new ContaPoupanca();
		// criar uma conta
		ContaBancaria conta = new ContaCorrente();
		((ContaCorrente)conta).setChequeEspecial(1000);
		// criar um cliente
		Cliente c = new Cliente("JoÃ£o","111.111.111-22");	
		// associar o cliente Ã  conta
		conta.setCliente(c);
		// exibe o nome do cliente
		System.out.println(conta.getCliente().getNome());
		// exibe informaÃ§Ã£o da conta
		System.out.println(conta.info());
		// depositar na conta
		conta.depositar(1000);
		// exibe saldo da conta depois do depÃ³sito
		System.out.println(conta.exibeSaldo());
		// sacar 500
		conta.sacar(500);
		// exibe o saldo da conta depois do saque
		System.out.println(conta.exibeSaldo());
	}
}