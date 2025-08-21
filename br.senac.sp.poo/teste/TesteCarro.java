package teste;

import carros.Carros;

public class TesteCarro {
	public static void main(String[] args) {
		Carros c1 = new Carros(1);
		// popular o objeto
		c1.setChassi("123456");
		c1.setMarca("VW");
		;
		c1.setModelo("Fusca");
		// executando operaÃ§Ãµes do objeto
		c1.buzinar();
		c1.abastecer(50);
		c1.acelerar();
		c1.frear();
	}
}