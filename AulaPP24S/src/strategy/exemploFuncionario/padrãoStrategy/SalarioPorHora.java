package strategy.exemploFuncionario.padrãoStrategy;

public class SalarioPorHora implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("Salario por hora");
    }
}
