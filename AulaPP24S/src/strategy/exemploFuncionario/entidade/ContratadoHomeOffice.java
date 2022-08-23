package strategy.exemploFuncionario.entidade;

import strategy.exemploFuncionario.padrãoStrategy.FeriasTemDireito;
import strategy.exemploFuncionario.padrãoStrategy.FeriasTemDireito;
import strategy.exemploFuncionario.padrãoStrategy.SalarioFixo;

public class ContratadoHomeOffice extends Funcionario{

    public ContratadoHomeOffice() {
        salario = new SalarioFixo();
        ferias = new FeriasTemDireito();
    }
}
