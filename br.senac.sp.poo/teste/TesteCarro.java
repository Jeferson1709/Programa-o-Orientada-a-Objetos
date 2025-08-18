package teste;

import carros.Carros;

public class TesteCarro {
	public static void main(String[] args) {				
		Carros c1 = new Carros(1);		
		// popular o objeto
		c1.chassi = "123456";
		c1.marca = "VW";
		c1.modelo = "Fusca";		
		// executando operaÃ§Ãµes do objeto
		c1.buzinar();
		c1.abastecer(50);
		c1.acelerar();
		c1.frear();
	}
}