package banco;

public class ContaBancaria {
	public String numero;
	private double saldo;
	public String agencia;
	public Cliente cliente;
	
	public ContaBancaria() {		
	}
	
	public ContaBancaria(String numero, 
			String agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String info() {
		String str = String.format
		("AgÃªncia: %s%nNÃºmero: %s%nCliente: %s%nSaldo: R$ %.2f",
				this.agencia, 
				this.numero, 
				this.cliente.nome, 
				this.saldo);
		return str;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void transferir(double valor, 
			ContaBancaria conta) {
		if(this.sacar(valor)) {
			conta.depositar(valor);
		}
	}
}
