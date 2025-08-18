package carros;

public class Carros {

    public String chassi;
    public String modelo;
    public String marca;
    public int tamanhoTanque = 50;
    public int qtdCombustivel;

    public Carros(int tamanhoTanque){
    this.tamanhoTanque = tamanhoTanque; 
}

public Carros() {
	this(50);
}


public void buzinar() {
	System.out.println("Bibibi");
}

public void acelerar() {
	if(this.qtdCombustivel > 0) {
		System.out.println("Acelerando...");
		this.qtdCombustivel--;
	}else {
		System.out.println("Tanque vazio. Abastesa");
	}
}

public void frear() {
	System.out.println("...freando");
}

public void abastecer(int litros) {
	if(this.qtdCombustivel + litros > this.tamanhoTanque) {
		System.out.println("Não cabe no tanque");
	}else {
		this.qtdCombustivel += litros;
	}
}

}
