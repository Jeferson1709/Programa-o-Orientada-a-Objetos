package teste;

import br.senac.sp.poo.heranca.Engenheiro;
import br.senac.sp.poo.heranca.Funcionario;

public class TestaIgualdade {
	public static void main(String[] args) {
		Funcionario e1 = new Engenheiro();
		e1.setRg("123456789");
		Engenheiro e2 = new Engenheiro();
		e2.setRg("123456789");
		// comparando os objetos				
		System.out.println(e1.equals(e2));
		// exibindo o toString do objeto
		System.out.println(e1);		
	}
}