package banco;



public class ContaCorrente extends {
    private double chequeEspecial = 1000;

	@Override
	protected boolean isAutorizado(double valor) {
		if (this.getSaldo() + this.chequeEspecial >= valor) {
			return true;
		}
		return false;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}
