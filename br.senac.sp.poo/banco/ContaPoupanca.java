package banco;

// esta classe nÃ£o terÃ¡ subclasses
public final class ContaPoupanca extends ContaBancaria{

	@Override
	protected boolean isAutorizado(double valor) {
		if(this.getSaldo() >= valor) {
			return true;
		}
		return false;
	}

}