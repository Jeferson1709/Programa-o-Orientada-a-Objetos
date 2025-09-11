package teste;

public class ClasseTeste {
	public int atributo;
	// atributo estÃ¡tico pertence Ã  classe
	public static int atributoEst = 20;
	
	public void metodo() {
		System.out.println("MÃ©todo");
		System.out.println(this.atributo);
	}
	
	public static void metodoEst() {
		System.out.println("MÃ©todo estÃ¡tico");
		// mÃ©todos estÃ¡ticos sÃ³ conseguem acessar
		// variÃ¡veis ou mÃ©todos estÃ¡ticos
		// as instruÃ§Ãµes abaixo NÃƒO FUNCIONAM
		/*
		this.atributo = 10;
		System.out.println(this.atributo);
		metodo();
		*/
	}
}