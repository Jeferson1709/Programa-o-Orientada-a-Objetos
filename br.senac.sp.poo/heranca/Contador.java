package heranca;

public class Contador {
    public class Contador extends Funcionario {
	private String numCrc;
	
	public Contador() {
		System.out.println("Criou-se um contador");
	}

	public String getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(String numCrc) {
		this.numCrc = numCrc;
	}
	
	
}
}
