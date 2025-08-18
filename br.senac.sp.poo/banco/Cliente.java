package banco;

public class Cliente {
	public String nome;
	public String cpf;
	
	public Cliente() {}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}
}
