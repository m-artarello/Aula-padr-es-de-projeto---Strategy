package strategy.exemploFuncionario.padrãoStrategy;

public class SalarioFixo implements Salario{
    @Override
    public void calcularSalario() {
        System.out.println("O salario eh fixo");
    }
}
