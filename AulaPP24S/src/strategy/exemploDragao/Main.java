package strategy.exemploDragao;

import strategy.exemploDragao.entidade.ExterminadorDeDragoes;
import strategy.exemploDragao.padrãoStrategy.EstrategiaArmaBranca;
import strategy.exemploDragao.padrãoStrategy.EstrategiaDeFeitico;
import strategy.exemploDragao.padrãoStrategy.EstrategiaDeProjetil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dragão avistado");
        var exterminador = new ExterminadorDeDragoes(new EstrategiaArmaBranca());
        exterminador.iniciarBatalha();

        System.out.println("Dragão 2 avistado");
        exterminador.mudaEstrategia(new EstrategiaDeProjetil());
        exterminador.iniciarBatalha();

        System.out.println("Dragão 3 avistado");
        exterminador.mudaEstrategia(new EstrategiaDeFeitico());
        exterminador.iniciarBatalha();
    }
}
