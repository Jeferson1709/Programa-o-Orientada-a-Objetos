package teste;

import carros.Carros;

public class TestaArray {

    public static void main(String[] args) {
        // cria um Array de Carro com 4 posições
        Carros[] carros = new Carros[4];
        carros[0] = new Carros();
        carros[0].setMarca("Ford");
        carros[0].setModelo("Ka");

        // Cria um objeto Carro
        Carros c1 = new Carros();

        // Aponta posição 1 do vetor para c1
        carros[1] = c1;
        carros[1].setMarca("VW");
        carros[1].setModelo("Golf");
        carros[1] = null;
        carros[2] = new Carros();
        carros[3] = new Carros();
        // c1 = null;

        // Percorrendo array de objetos. Somente para leitura.
        for (Carros c : carros) {
            if (c != null)
                System.out.println(c != null ? c.getModelo() : "Carro não inicializado...");
            // isso alterará todos os modelos para Onix.
            c.setModelo("Onix");
        }
        System.out.println(carros[0].getModelo());
        System.out.println(carros[1].getModelo());
        System.out.println(carros[2].getModelo());
        System.out.println(carros[3].getModelo());

    }
}
