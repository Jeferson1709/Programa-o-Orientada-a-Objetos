package teste;
public class TestaEstatico {	
	
	public static void main(String[] args) {		
		ClasseTeste c = new ClasseTeste();		
		c.atributo = 10;
		c.atributoEst = 20;
		ClasseTeste c2 = new ClasseTeste();
		c2.atributo = 5;
		c2.atributoEst = 15;		
		ClasseTeste.atributoEst = 25;
		// nos 3 prints, aparecerÃ¡ o mesmo valor, pois sÃ£o
		// os mesmos atributos
		System.out.println(c.atributoEst);
		System.out.println(c2.atributoEst);
		System.out.println(ClasseTeste.atributoEst);		
	}
}