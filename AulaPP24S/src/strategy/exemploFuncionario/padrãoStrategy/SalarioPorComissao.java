package strategy.exemploFuncionario.padrãoStrategy;

public class SalarioPorComissao implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Salario por comissão");
    }
}
