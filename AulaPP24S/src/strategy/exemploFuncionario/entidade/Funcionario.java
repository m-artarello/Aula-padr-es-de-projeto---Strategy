package strategy.exemploFuncionario.entidade;

import strategy.exemploFuncionario.padrãoStrategy.Ferias;
import strategy.exemploFuncionario.padrãoStrategy.Salario;

public class Funcionario {
    private String nome;
    protected Salario salario;
    protected Ferias ferias;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularSalario(){
        salario.calcularSalario();
    }

    public void calcularFerias(){
        ferias.calcularFerias();
    }

}
