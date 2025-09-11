package heranca;

public class TestaHeranca {
	public static void main(String[] args) {
		// criar engenheiro
		Funcionario eng = new Engenheiro();
		eng.setNome("JoÃ£o");
		eng.setRg("123456789");
		eng.setSalario(10000);
		Engenheiro e = (Engenheiro) eng;
		e.setNumCrea("11111");
		System.out.println(eng.hashCode());
		System.out.println(e.hashCode());
		// criar contador
		Contador cont = new Contador();
		cont.setNome("Alberto");
		cont.setRg("123456780");
		cont.setSalario(7500);
		// cont.setNumCrc("22222");

	}
}