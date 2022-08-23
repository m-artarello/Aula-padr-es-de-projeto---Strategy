package strategy.exemploFuncionario.entidade;

import strategy.exemploFuncionario.padrãoStrategy.FeriasTemDireito;
import strategy.exemploFuncionario.padrãoStrategy.FeriasTemDireito;
import strategy.exemploFuncionario.padrãoStrategy.SalarioFixo;

public class Contratado extends Funcionario{

    public Contratado() {
        salario = new SalarioFixo();
        ferias = new FeriasTemDireito();
    }
}
