package teste;
import banco.Cliente;
import banco.ContaBancaria;
public class TestaTransferencia {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		ContaBancaria c1 = new ContaBancaria(cl1);			
		c1.depositar(500);
		Cliente cl2 = new Cliente();
		ContaBancaria c2 = new ContaBancaria(cl2);
		c1.transferir(100, c2);
		System.out.println(c1.info());
		System.out.println(c2.info());
	}
}
