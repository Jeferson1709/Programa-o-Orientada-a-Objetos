package heranca;

public class Engenheiro extends Funcionario {
	private String numCrea;

	public Engenheiro() {		
		System.out.println("Criou-se um engenheiro: " + this.hashCode());
	}

	public String getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(String numCrea) {
		this.numCrea = numCrea;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEngenheiro [numCrea=" + numCrea + "]";
	}

}