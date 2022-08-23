package strategy.exemploFuncionario.entidade;

import strategy.exemploFuncionario.padrãoStrategy.FeriasSemDireito;
import strategy.exemploFuncionario.padrãoStrategy.SalarioPorComissao;

public class Freelancer extends Funcionario{

    public Freelancer() {
        salario = new SalarioPorComissao();
        ferias = new FeriasSemDireito();
    }
}
