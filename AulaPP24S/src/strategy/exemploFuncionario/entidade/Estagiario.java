package strategy.exemploFuncionario.entidade;

import strategy.exemploFuncionario.padrãoStrategy.FeriasSemDireito;
import strategy.exemploFuncionario.padrãoStrategy.FeriasTemDireito;
import strategy.exemploFuncionario.padrãoStrategy.SalarioPorHora;

public class Estagiario extends Funcionario{

    public Estagiario() {
        salario = new SalarioPorHora();
        ferias = new FeriasTemDireito();
    }
}
