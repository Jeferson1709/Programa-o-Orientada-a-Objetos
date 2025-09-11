package banco;

public class Cliente {
	private String nome;
	private String cpf;

	// Construtores
	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

    public String info(){
        return String.format("Nome: %s\nCPF: %s\n", this.nome, this.cpf);
    }
}
