package carros;

public class Carros {

	private String chassi;
	private String modelo;
	private String marca;
	private int tamanhoTanque = 50;
	private int qtdCombustivel;
	// Construtores

	public Carros(int tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}

	public Carros() {
		this(50);
	}

	// ------------------------------------------------------------------
	// Getters e Setters
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// ------------------------------------------------------------------
	// Métodos
	public void buzinar() {
		System.out.println("Bibibi");
	}

	public void acelerar() {
		if (this.qtdCombustivel > 0) {
			System.out.println("Acelerando...");
			this.qtdCombustivel--;
		} else {
			System.out.println("Tanque vazio. Abastesa");
		}
	}

	public void frear() {
		System.out.println("...freando");
	}

	public void abastecer(int litros) {
		if (this.qtdCombustivel + litros > this.tamanhoTanque) {
			System.out.println("Não cabe no tanque");
		} else {
			this.qtdCombustivel += litros;
		}
	}

}
