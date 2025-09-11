package banco;

public class ContaBancaria {
	private double saldo;
	private String numero;
	private String agencia;
	private Cliente cliente;

	public ContaBancaria() {
	}

	public ContaBancaria(String agencia, 
			String numero, Cliente cliente) {
		this(agencia, numero);
		this.cliente = cliente;
	}
	public ContaBancaria(String numero,
			String agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
    public ContaBancaria(double saldo, String numero, String agencia) {}

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}

	public String info() {
		String str = String.format("AgÃªncia: %s%nNÃºmero: %s%nCliente: %s%nSaldo: R$ %.2f",
				this.agencia,
				this.numero,
				this.cliente.getNome(),
				this.saldo);
		return str;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	// método auxiliar para verificar se é possível realizar o saque.
	private boolean isAutorizado(double valor) {
		if (this.saldo >= valor) {
			return true;
		}
		return false;

	}

	public boolean sacar(double valor) {
		if (isAutorizado(valor)) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void transferir(double valor,
			ContaBancaria conta) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


    public double getSaldo() {
        return saldo;
    }
}

