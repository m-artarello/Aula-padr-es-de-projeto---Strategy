package strategy.exemploFuncionario.padrãoStrategy;

public class SemSalario implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Não recebe salario");
    }
}
