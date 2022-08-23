package strategy.exemploFuncionario.entidade;

import strategy.exemploFuncionario.padrãoStrategy.FeriasSemDireito;
import strategy.exemploFuncionario.padrãoStrategy.SemSalario;

public class Voluntario extends Funcionario{

    public Voluntario() {
        salario = new SemSalario();
        ferias = new FeriasSemDireito();
    }
}
